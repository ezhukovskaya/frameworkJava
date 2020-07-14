package stepdefinitions;

import cucumber.api.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.PendingException;

import java.util.List;
import java.util.Map;

public class DataTablesSteps {
    @Given("^I placed an order for the following items$")
    public void iPlacedAnOrderForTheFollowingItems(DataTable dataTable) {
        //1-DIMENSIONAL

        /*List<String> billData = dataTable.asList(String.class);
        billData.forEach(System.out::println);*/

        //2-DIMENSIONAL

       /* List<List<String>> billData = dataTable.asLists(String.class);
        billData.forEach(data->data.forEach(System.out::println));*/

        //MAP

        List<Map<String, String>> billData = dataTable.asMaps(String.class, String.class);
        billData.forEach(item -> item.forEach((key, value) -> System.out.println("Key: " + key)));
        billData.forEach(item -> item.forEach((key, value) -> System.out.println("Value: " + value)));
    }

    @When("^I generate the bill$")
    public void iGenerateTheBill() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^a bill for \\$(\\d+) should be generated$")
    public void aBillFor$ShouldBeGenerated(int arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
