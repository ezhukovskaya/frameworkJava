package framework.base;

import framework.browser.Browser;
import lombok.Data;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class BaseElement {

    private static final Logger LOG = Logger.getLogger(BaseElement.class);
    protected By elementLocator;
    protected String elementName;

    public BaseElement(By locator, String name) {
        this.elementLocator = locator;
        this.elementName = name;
    }

    public void submit(){
        getElement().submit();
    }

    public WebElement getElement() {
        return Browser.getBrowser().findElement(elementLocator);
    }

    public List<WebElement> getElements() {
        return Browser.getBrowser().findElements(this.elementLocator);
    }

    public List<String> getElementsAsString(){
        List <String> text = new ArrayList<>();
        for(WebElement element: getElements()){
            text.add(element.getText());
        }
        return text;
    }

    public String getText() {
        LOG.info("Get text from element");
        return getElement().getText();
    }

    public Dimension getSize() {
        return Browser.getBrowser().findElement(this.elementLocator).getSize();
    }

    public boolean isDisplayed() {
        return getElements().size() > 0;
    }

}