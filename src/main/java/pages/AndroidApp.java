package pages;

import helpers.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.net.MalformedURLException;

import static helpers.AppFactory.getDriver;

public class AndroidApp extends BaseSeleniumPage {

    public AndroidApp() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//android.widget.TextView[@content-desc='My Demo App']")
    WebElement openApp;


    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Displays selected product'][1]")
    WebElement choiceBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Tap to add product to cart']")
    WebElement addToCart;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc='Displays number of items in your cart']")
    WebElement cartBtn;

    @FindBy(xpath = "//android.widget.Button[@content-desc='Confirms products for checkout']")
    WebElement proceedBtn;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Tap to use this username for login'][1]")
    WebElement chooseLoginBtn;


    @FindBy(xpath = "//android.widget.Button[@content-desc='Tap to login with given credentials']")
    WebElement continueBtn;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    WebElement fullname;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    WebElement address;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    WebElement addressOffice;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    WebElement city;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    WebElement zipcode;
    @FindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    WebElement country;

    @FindBy(id = "com.saucelabs.mydemoapp.android:id/paymentBtn")
    WebElement paymentBtn;


    public void registrationOrder() throws InterruptedException, MalformedURLException {
        getDriver("Android");
        waitElement();
        clickElement(openApp);
        waitElement();
        clickElement(choiceBtn);
        waitElement();
        clickElement(addToCart);
        clickElement(cartBtn);
        waitElement();
        clickElement(proceedBtn);
        waitElement();
        clickElement(chooseLoginBtn);
        clickElement(continueBtn);
        waitElement();
        sendElement(fullname, "Alex Sam");
        sendElement(address, "Central Park 12/2");
        sendElement(addressOffice, "Grand Park 6");
        sendElement(city, "LA");
        sendElement(zipcode, "21232");
        sendElement(country, "USA");
        clickElement(paymentBtn);
    }
}