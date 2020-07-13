package framework.base;

import framework.elements.Label;

public abstract class BasePage {
    private final Label LABEL;

    public BasePage(Label label) {
        this.LABEL = label;
    }

    public boolean isDisplayed() {
        return this.LABEL.isDisplayed();
    }
}