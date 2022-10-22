package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * @author alpinaro (Alper Çınaroğlu)
 * https://github.com/alpinaro
 */
public class Index {

    public Index() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    // General
    @FindBy (xpath = "//span[@class=\"navigation_page\"]")
    public WebElement navigationPage;

    // Homepage
    @FindBy (xpath = "//a[@class=\"login\"]")
    public WebElement linkLogin;

    // Authentication Page
    @FindBy (id = "email_create")
    public WebElement textEmailCreate;

    @FindBy (id = "SubmitCreate")
    public WebElement submitCreate;

    @FindBy (id = "customer_firstname")
    public WebElement textFirstName;

    @FindBy (id = "customer_lastname")
    public WebElement textLastName;

    @FindBy (xpath = "//input[@type=\"password\"]")
    public WebElement password;

    @FindBy (id = "firstname")
    public WebElement textAddressFirstName;

    @FindBy (id = "lastname")
    public WebElement textAddressLastName;

    @FindBy (id = "address1")
    public WebElement textAddressLine1;

    @FindBy (id = "city")
    public WebElement textAddressCity;

    @FindBy (id = "id_state")
    public WebElement selectAddressState;

    @FindBy (id = "postcode")
    public WebElement textAddressPostCode;

    @FindBy (id = "phone_mobile")
    public WebElement textAddressPhoneMobile;

    @FindBy (id = "alias")
    public WebElement textAddressAlias;

    @FindBy (id = "submitAccount")
    public WebElement submitRegister;

    // Shopping
    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement linkDresses;

    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    public WebElement linkSummerDresses;

    @FindBy (xpath = "//div[@class=\"product-container\"]")
    public WebElement productContainer1;

    @FindBy (xpath = "//a[@class=\"button ajax_add_to_cart_button btn btn-default\"]")
    public WebElement linkAddToCart1;

    @FindBy (xpath = "//div[@id=\"layer_cart\"]/div[1]/div[1]/h2")
    public WebElement confirmAdded;

    @FindBy (xpath = "//*[@id=\"layer_cart_product_title\"]")
    public WebElement confirmName;

    @FindBy (xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]")
    public WebElement confirmQuantity;

    @FindBy (xpath = "//a[@class=\"btn btn-default button button-medium\"]")
    public WebElement linkProceed;

    @FindBy (xpath = "//a[@class=\"button btn btn-default standard-checkout button-medium\"]")
    public WebElement linkProceedStandard;

    @FindBy (id = "id_address_delivery")
    public WebElement addressDelivery;

    @FindBy (xpath = "//button[@class=\"button btn btn-default button-medium\"]")
    public WebElement submitProceed;

    @FindBy (xpath = "//input[@id=\"cgv\"]")
    public WebElement checkboxTerms;

    @FindBy (xpath = "//button[@class=\"button btn btn-default standard-checkout button-medium\"]")
    public WebElement submitProceedStandard;

    @FindBy (xpath = "//a[@class=\"bankwire\"]")
    public WebElement linkPaymentOptionBankwire;

    @FindBy (xpath = "//p[@class=\"cheque-indent\"]")
    public WebElement orderComplete;

    @FindBy (xpath = "//a[@class=\"account\"]")
    public WebElement linkAccount;

    @FindBy (xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
    public WebElement linkOrderHistory;

    @FindBy (xpath = "//td[@class=\"history_state\"]")
    public WebElement orderHistoryState;
}






