package framework.elements;

import framework.base.BaseElement;
import framework.browser.Browser;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends BaseElement {
    static final Logger LOG = Logger.getLogger(DropDown.class);

    public DropDown(By locator, String name) {
        super(locator, name);
    }

    public void select(String key) {
        LOG.info(elementName + " select");
        new Select(Browser.getBrowser().findElement(elementLocator)).selectByVisibleText(key);
    }

    public void select(int index) {
        LOG.info(elementName + " select");
        new Select(Browser.getBrowser().findElement(elementLocator)).selectByIndex(index);
    }

    public Select getSelectedElements() {
        return new Select(Browser.getBrowser().findElement(elementLocator));
    }

}
