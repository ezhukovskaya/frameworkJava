package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TemplateSteps {
    @Given("I have a menu item with name {string} and price {int}")
    public void iHaveAMenuItemWithNameAndPrice(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I add that menu item")
    public void iAddThatMenuItem() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Menu item with name {string} should be added")
    public void menuItemWithNameShouldBeAdded(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
