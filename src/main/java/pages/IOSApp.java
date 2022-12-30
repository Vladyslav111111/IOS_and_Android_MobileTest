package pages;

import helpers.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static helpers.AppFactory.getDriver;


public class IOSApp extends BaseSeleniumPage {
    public IOSApp() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//XCUIElementTypeOther[@name='Sauce Labs Backpack']")
    WebElement choiceBtn;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='Add To Cart button']")
    WebElement addToCart;

    @FindBy(xpath = "//XCUIElementTypeButton[@name='tab bar option cart']")
    WebElement cartBtn;


    @FindBy(id = "Proceed To Checkout button")
    WebElement proceedBtn;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='bob@example.com-autofill']")
    WebElement chooseLoginBtn;


    @FindBy(xpath = "//XCUIElementTypeOther[@name='Login button']")
    WebElement continueBtn;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Full Name* input field']")
    WebElement fullname;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Address Line 1* input field']")
    WebElement address;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Address Line 2 input field']")
    WebElement addressOffice;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name='City* input field']")
    WebElement city;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Zip Code* input field']")
    WebElement zipcode;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Country* input field']")
    WebElement country;

    @FindBy(xpath = "//XCUIElementTypeOther[@name='To Payment button']")
    WebElement paymentBtn;


    public void registrationOrderIos() throws InterruptedException, MalformedURLException {
        getDriver("iOS");
        waitElement();
        clickElement(choiceBtn);
        waitElement();
        clickElement(addToCart);
        waitElement();
        clickElement(cartBtn);
        clickElement(proceedBtn);
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