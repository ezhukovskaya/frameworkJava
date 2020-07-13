package tests;

import application.constants.UrlConstants;
import framework.browser.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {
    @BeforeTest
    public static void init(){
        Browser.setImplicitlyWait();
        Browser.goToUrl(UrlConstants.WEB_URL);
        Browser.maximize();
    }

    @AfterTest
    public static void close(){
        Browser.quit();
    }
}
