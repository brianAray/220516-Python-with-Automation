package com.revature.stepdefinitions;

import org.testng.Assert;

import com.revature.IsItFriday;
import com.revature.IsItMonday;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class days_step_def {
    
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }

    @Given("today is {string}")
    public void today_is(String string) {
        today = string;
    }

    @When("I ask whether it's Monday yet")
    public void i_ask_whether_it_s_monday_yet() {
        actualAnswer = IsItMonday.isItMonday(today);
    }

    
    @When("I ask whether it's Friday")
    public void i_ask_whether_it_s_friday() {
        actualAnswer = IsItFriday.isItFriday(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        Assert.assertEquals(actualAnswer, string);
    }
}
