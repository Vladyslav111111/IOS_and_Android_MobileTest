package test;

import helpers.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.AndroidApp;
import pages.IOSApp;


import java.net.MalformedURLException;

public class MainPageTest extends BaseSeleniumPage {


    @Test
    public static void mainTest() throws InterruptedException, MalformedURLException {

        new AndroidApp().registrationOrder();
        Assert.assertEquals("Enter a payment method",
                driver.findElement(By.id("com.saucelabs.mydemoapp.android:id/enterPaymentMethodTV"))
                        .getText());

        new IOSApp().registrationOrderIos();
        Assert.assertEquals("Checkout",
                driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Checkout']"))
                        .getText());

    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

