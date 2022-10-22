package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Index;
import utilities.Auxiliary;
import utilities.ConfigReader;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Main {

    Index index = new Index();

    @Then("page is {string}")
    public void pageIs(String page) {

        Assert.assertEquals(page, index.navigationPage.getText());
    }

    @When("go to {string}")
    public void goTo(String URL) {

        Driver.getDriver().get(ConfigReader.getProperty(URL));
    }

    @Then("page source contains {string}")
    public void pageSourceContains(String keyword) {

        Assert.assertTrue(Driver.getDriver().getPageSource().contains(keyword));
    }

    @Then("page title contains {string}")
    public void pageTitleContains(String title) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }

    @And("{int} seconds waited")
    public void secondsWaited(int time) {

        Auxiliary.wait(time);
    }

    @When("close browser")
    public void closeBrowser() {

        Driver.closeDriver();
    }
}