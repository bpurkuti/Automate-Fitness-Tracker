package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CreateRoutineSteps {
    @Given("The User is on the create routine page")
    public void the_User_is_on_the_create_routine_page() throws InterruptedException {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/create_routine.html");
        Thread.sleep(1000);
    }

    @When("The User enters {string} into the routine name field")
    public void the_User_enters_into_the_routine_name_field(String rname) throws InterruptedException {
        Runner.createRoutinePage.routineName.sendKeys(rname);
    }

    @When("The User selects an exercise {string}")
    public void the_User_selects_an_exercise(String exercise) {
        Runner.createRoutinePage.exercise.sendKeys(exercise);
    }

    @When("The User clicks on the add button")
    public void the_User_clicks_on_the_add_button() throws InterruptedException {
        Runner.createRoutinePage.add.click();
        Thread.sleep(500);
    }

    @When("The User clicks on the create button")
    public void the_User_clicks_on_the_create_button() throws InterruptedException {

        Runner.createRoutinePage.create.click();
        Thread.sleep(1000);
    }

    @When("The User clicks the home button")
    public void the_User_clicks_the_back_button() {
        Runner.createRoutinePage.home.click();
    }

    @When("The User selects the exercise filter {string}")
    public void the_User_selects_the_exercise_filter(String filter) {
        new Select(Runner.createRoutinePage.typeFilter).selectByVisibleText(filter);
    }

    @When("The User selects the date {string}")
    public void the_User_selects_the_date(String date) {
        Runner.createRoutinePage.date.sendKeys(date);
    }

    @Then("An alert should appear")
    public void an_alert_should_appear() throws InterruptedException {
        Thread.sleep(250);
        Assert.assertNotEquals(Runner.createRoutinePage.submitmsg.getText(), "");
    }
}
