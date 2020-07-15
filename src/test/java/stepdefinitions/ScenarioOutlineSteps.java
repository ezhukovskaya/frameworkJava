package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java8.PendingException;
import org.testng.Assert;

public class ScenarioOutlineSteps {
    private int initialBillAmount;
    private double taxRate;
    private double finalBill;

    @Given("^I have a Customer$")
    public void iHaveACustomer() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^user enters initial bill amount as (\\d+)$")
    public void userEntersInitialBillAmountAs(int billAmount) {
        this.initialBillAmount = billAmount;
        System.out.println("Initial bill amount: " + initialBillAmount);
    }

    @Given("^Sales Tax Rate is (\\d+) percent$")
    public void salesTaxRateIsPercent(int taxRate) {
        this.taxRate = taxRate;
        System.out.println("Tax Rate: " + this.taxRate);
    }

    @Then("^Final bill amount calculate is (\\d+)$")
    public void finalBillAmountCalculateIs(int finalBill) {
        this.finalBill = (initialBillAmount * taxRate / 100) + initialBillAmount;
        Assert.assertEquals(finalBill, this.finalBill, "Results differ");
    }

    @Given("^Sales Tax Rate is {double} percent$")
    public void salesTaxRateIsPercent(double taxRate) {
        this.taxRate = taxRate;
        System.out.println("Tax Rate: " + this.taxRate);
    }

    @Then("^Final bill amount calculate is {double} $")
    public void finalBillAmountCalculateIs(double finalBill) throws Throwable {
        this.finalBill = (initialBillAmount * taxRate / 100) + initialBillAmount;
        Assert.assertEquals(finalBill, this.finalBill, "Results differ");
    }
}
