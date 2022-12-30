package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BaseSeleniumPage {
    protected static WebDriver driver;


    public void clickElement(WebElement webElement) {
        webElement.click();
    }

    public void waitElement() throws InterruptedException {
        Thread.sleep(5000);
    }


    public void sendElement(WebElement webElement, String element) {
        webElement.sendKeys((CharSequence) element);

    }

}
