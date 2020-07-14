package stepdefinitions;

import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.PendingException;

import java.util.List;

public class DataTablesSteps {
    @Given("^I placed an order for the following items$")
    public void iPlacedAnOrderForTheFollowingItems(DataTable dataTable) throws Throwable {
        List<List<String>> billData = dataTable.asLists(String.class);
        billData.forEach(data->data.forEach(System.out::println));
    }

    @When("^I generate the bill$")
    public void iGenerateTheBill() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a bill for \\$(\\d+) should be generated$")
    public void aBillFor$ShouldBeGenerated(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
