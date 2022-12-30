package helpers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory extends BaseSeleniumPage {
    public static DesiredCapabilities cap;
    public AppFactory() {
        PageFactory.initElements(driver, this);
    }


    public static void getDriver(String platformName) throws MalformedURLException {
        if (platformName.equals("Android")) {
            cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", "emulator-5554");
            cap.setCapability("automationName", "UiAutomator2");
            //cap.setCapability("app", "/Users/vladyslav/Downloads/mda-1.0.10-12.apk");
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        } else if (platformName.equals("iOS")) {
            cap.setCapability("platformName","iOS");
            cap.setCapability("deviceName","iphone");
            cap.setCapability("automationName","XCUITest");
            cap.setCapability("platformVersion","16.2");
            cap.setCapability("app","/Users/vladyslav/Downloads/MyRNDemoApp.app");
            driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        }
    }




}
