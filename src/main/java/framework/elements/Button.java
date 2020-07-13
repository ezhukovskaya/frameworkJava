package framework.elements;

import framework.base.BaseElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Button extends BaseElement {
    public Button(By locator, String name) {
        super(locator, name);
    }

    static final Logger LOG = Logger.getLogger(Button.class);

    public void click() {
        LOG.info(this.elementName + " click");
        getElement().click();
    }
}
