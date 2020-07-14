package stepdefinitions;

import application.utils.MenuOperationUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class TemplateSteps {
    private String errorMessage;
    private static final Logger LOG = Logger.getLogger(TemplateSteps.class);

    @Given("^I have a menu item with name \"(.*?)\" and price (\\d+)$")
    public void iHaveAMenuItemWithNameAndPrice(String itemName, Integer price) {
        MenuOperationUtils.setName(itemName);
        MenuOperationUtils.setPrice(price);
    }

    @When("^I add that menu item$")
    public void iAddThatMenuItem() {
        try {
            MenuOperationUtils.addItem();
        } catch (IllegalArgumentException e){
            LOG.error(e.getMessage());
            errorMessage = e.getMessage();
        }
    }

    @Then("^Menu item with name \"(.*?)\" should be added$")
    public void menuItemWithNameShouldBeAdded(String name) {
        Assert.assertTrue(MenuOperationUtils.isItemExists(name), "Item is not added");
    }

    @Then("I should see error message with {string}")
    public void iShouldSeeErrorMessageWith(String errorMessage) {
        Assert.assertEquals(errorMessage,this.errorMessage);
    }
}
