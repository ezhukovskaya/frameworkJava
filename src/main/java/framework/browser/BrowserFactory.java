package framework.browser;

import application.constants.PathsConstants;
import framework.enums.BrowserList;
import framework.utils.PropertiesRead;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {


    public static WebDriver getBrowser() {
        String browserName = PropertiesRead.read("browser", PathsConstants.FRAMEWORK_PROPERTY);
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case CHROME:
                return getChromeInstance();
            case FIREFOX:
                return getFirefoxInstance();
            default:
                throw new IllegalStateException("Incorrect browser name in configuration file");
        }
    }

    private static ChromeDriver getChromeInstance() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static FirefoxDriver getFirefoxInstance() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}