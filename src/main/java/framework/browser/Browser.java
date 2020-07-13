package framework.browser;

import application.constants.PathsConstants;
import framework.base.BaseElement;
import framework.utils.PropertiesRead;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Browser {
    private static final int TIMEOUT = Integer.parseInt(PropertiesRead.read("implicitlyTimeout", PathsConstants.FRAMEWORK_PROPERTY));
    private static final int EXPLICIT_TIMEOUT = Integer.parseInt(PropertiesRead.read("explicitTimeout", PathsConstants.FRAMEWORK_PROPERTY));
    private static WebDriver driver;
    private static final Logger log = Logger.getLogger(Browser.class);

    public static WebDriver getBrowser() {
        if (driver == null) {
            driver = BrowserFactory.getBrowser();
        }
        return driver;
    }
    public static void setWaitUntilClickable(By by) {
        log.info("Timeout is " + EXPLICIT_TIMEOUT);
        (new WebDriverWait(getBrowser(), EXPLICIT_TIMEOUT)).until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void setWaitUntilInvisible(By by) {
        log.info("Timeout is " + EXPLICIT_TIMEOUT);
        (new WebDriverWait(getBrowser(), EXPLICIT_TIMEOUT)).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static String getCurrentUrl() {
        log.info("Getting current Url");
        return getBrowser().getCurrentUrl();
    }

    public static void addCookie(Cookie cookie) {
        log.info("adding " + cookie.getName() + " data");
        getBrowser().manage().addCookie(cookie);
    }

    public static void addCookie(String name, String value) {
        getBrowser().manage().addCookie(new Cookie(name, value));
    }

    public static void refresh() {
        getBrowser().navigate().refresh();
    }

    public static String getAttribute(By by, String attribute) {
        return getBrowser().findElement(by).getAttribute(attribute);
    }

    public static void back() {
        getBrowser().navigate().back();
    }

    public static void switchTo(int tabNumber, ArrayList<String> tabs) {
        getBrowser().switchTo().window(tabs.get(tabNumber));
    }

    public static void goToUrl(String url) {
        getBrowser().get(url);
    }

    public static void maximize() {
        getBrowser().manage().window().maximize();
    }

    public static void quit() {
        getBrowser().quit();
    }

    public static void setImplicitlyWait() {
        getBrowser().manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
    }

    public static void setExplicitWaitUntilPresence(BaseElement element) {
        log.info("Timeout is " + EXPLICIT_TIMEOUT);
        (new WebDriverWait(getBrowser(), EXPLICIT_TIMEOUT)).until(ExpectedConditions.presenceOfElementLocated(element.getElementLocator()));
    }

    public static void takeScreenshot(String path) {
        log.info("Taking screenshot");
        TakesScreenshot screenshot = ((TakesScreenshot) getBrowser());
        log.info("Inserting image into the file PNG");
        File image = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(path);
        try {
            FileUtils.copyFile(image, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}