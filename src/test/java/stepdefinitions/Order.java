package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Index;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Order {

    Index index = new Index();

    Actions actions = new Actions(Driver.getDriver());

    Select selectAddressDelivery;

    @When("Dresses category hovered")
    public void dressesCategoryHovered() {

        actions.moveToElement(index.linkDresses).perform();
    }

    @And("Summer Dresses category clicked")
    public void summerDressesCategoryClicked() {

        index.linkSummerDresses.click();
    }

    @When("first product hovered")
    public void firstProductHovered() {

        actions.moveToElement(index.productContainer1).perform();
    }

    @And("Add to cart link clicked")
    public void addToCartLinkClicked() {

        index.linkAddToCart1.click();
    }

    @Then("product added to cart")
    public void productAddedToCart() {

        Assert.assertEquals("Product successfully added to your shopping cart", index.confirmAdded.getText());
    }

    @And("product name contains {string}")
    public void productNameContains(String keyword) {

        Assert.assertTrue(index.confirmName.getText().contains(keyword));
    }

    @And("cart contains {int} item")
    public void cartContainsItem(int quantity) {

        Assert.assertEquals("There is 1 item in your cart.", index.confirmQuantity.getText());
    }

    @When("Proceed to checkout link clicked")
    public void proceedToCheckoutLinkClicked() {

        index.linkProceed.click();
    }

    @When("Proceed to checkout link2 clicked")
    public void proceedToCheckoutLink2Clicked() {

        index.linkProceedStandard.click();
    }

    @And("delivery address is correct")
    public void deliveryAddressIsCorrect() {

        selectAddressDelivery = new Select(index.addressDelivery);
        Assert.assertEquals(Account.addressAliasHolder, selectAddressDelivery.getFirstSelectedOption().getText());
    }

    @When("Proceed to checkout button clicked")
    public void proceedToCheckoutButtonClicked() {

        index.submitProceed.click();
    }

    @When("Terms of service checkbox selected")
    public void termsOfServiceCheckboxSelected() {

        if (!index.checkboxTerms.isSelected()) {
            index.checkboxTerms.click();
        }
    }

    @And("Proceed to checkout button2 clicked")
    public void proceedToCheckOutButton2Clicked() {

        index.submitProceedStandard.click();
    }

    @When("Pay by bank wire link clicked")
    public void payByBankWireLinkClicked() {

        index.linkPaymentOptionBankwire.click();
    }

    @When("I confirm my order button clicked")
    public void IConfirmMyOrderButtonClicked() {

        index.submitProceed.click();
    }

    @Then("order is complete")
    public void orderIsComplete() {

        Assert.assertEquals("Your order on My Store is complete.", index.orderComplete.getText());
    }
}