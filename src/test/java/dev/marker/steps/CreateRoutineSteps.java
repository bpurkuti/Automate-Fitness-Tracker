package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CreateRoutineSteps {
    @Given("The User is on the create routine page")
    public void the_User_is_on_the_create_routine_page() {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/create_routine.html");
    }

    @When("The User enters {string} into the routine name field")
    public void the_User_enters_into_the_routine_name_field(String rname) {
        Runner.createRoutinePage.routineName.sendKeys(rname);
    }

    @When("The User selects an exercise {string}")
    public void the_User_selects_an_exercise(String exercise) {
        Runner.createRoutinePage.exercise.sendKeys(exercise);
    }

    @When("The User clicks on the add button")
    public void the_User_clicks_on_the_add_button() {
        Runner.createRoutinePage.add.click();
    }

    @When("The User clicks on the create button")
    public void the_User_clicks_on_the_create_button() {
        Runner.createRoutinePage.create.click();
    }

    @When("The User clicks the home button")
    public void the_User_clicks_the_back_button() {
        Runner.createRoutinePage.home.click();
    }

    @When("The User selects the exercise filter {string}")
    public void the_User_selects_the_exercise_filter(String filter) {
        new Select(Runner.createRoutinePage.typeFilter).selectByVisibleText(filter);
    }
}
