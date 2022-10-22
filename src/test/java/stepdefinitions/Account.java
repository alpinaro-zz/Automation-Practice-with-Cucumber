package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.Index;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Account {

    Index index = new Index();

    // Fake User Data
    Faker faker = new Faker();
    String email = faker.internet().emailAddress();
    String password = faker.internet().password();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String addressStreet = faker.address().streetAddress();
    String addressCity = faker.address().city();
    String addressState = faker.address().state();
    Select selectState;
    String addressPostCode = faker.number().digits(5);
    String addressPhoneMobile = faker.phoneNumber().cellPhone();
    String addressAlias = faker.lordOfTheRings().location();
    static String addressAliasHolder; // Solid data with additional static holder for future checks

    // TODO User data will be saved to file for later use.

    @When("Sign in link clicked")
    public void signInLinkClicked() {

        index.linkLogin.click();
    }

    @And("email address entered")
    public void emailAddressEntered() {

        index.textEmailCreate.sendKeys(email);
    }

    @And("Create an account button clicked")
    public void createAnAccountButtonClicked() {

        index.submitCreate.click();
    }

    @And("form filled")
    public void formFilled() {

        index.textFirstName.sendKeys(firstName);
        index.textLastName.sendKeys(lastName);
        index.password.sendKeys(password);
        index.textAddressFirstName.sendKeys(firstName);
        index.textAddressLastName.sendKeys(lastName);
        index.textAddressLine1.sendKeys(addressStreet);
        index.textAddressCity.sendKeys(addressCity);

        selectState = new Select(index.selectAddressState);
        selectState.selectByVisibleText(addressState);

        index.textAddressPostCode.sendKeys(addressPostCode);
        index.textAddressPhoneMobile.sendKeys(addressPhoneMobile);
        index.textAddressAlias.clear();
        addressAliasHolder = addressAlias;
        index.textAddressAlias.sendKeys(addressAliasHolder);
    }

    @And("Register button clicked")
    public void registerButtonClicked() {

        index.submitRegister.click();
    }

    @When("account link clicked")
    public void accountLinkClicked() {

        index.linkAccount.click();
    }

    @When("order history link clicked")
    public void orderHistoryLinkClicked() {

        index.linkOrderHistory.click();
    }

    @Then("Status is {string}")
    public void statusIs(String status) {

        Assert.assertEquals(status, index.orderHistoryState.getText());
    }
}