package framework.base;

import framework.elements.Label;

public abstract class BaseForm {
    private final Label LABEL;

    public BaseForm(Label label) {
        this.LABEL = label;
    }

    public boolean isDisplayed() {
        return this.LABEL.isDisplayed();
    }
}