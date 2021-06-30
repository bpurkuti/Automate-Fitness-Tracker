package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateRoutineSteps {
    @Given("The User is on the create routine page")
    public void the_User_is_on_the_create_routine_page() {
        Runner.driver.get("CREATE URI");
    }

    @When("The User enters {string} into the routine name field")
    public void the_User_enters_into_the_routine_name_field(String rname) {
        Runner.createRoutinePage.routineName.sendKeys(rname);
    }

    @When("The User selects an exercise {string}")
    public void the_User_selects_an_exercise(String exercise) {
        Runner.createRoutinePage.routineName.sendKeys(exercise);
    }

    @When("The User clicks on the add button")
    public void the_User_clicks_on_the_add_button() {
        Runner.createRoutinePage.add.click();
    }

    @Then("The form to enter details should popup")
    public void the_form_to_enter_details_should_popup() {
        Assert.assertNotEquals(Runner.createRoutinePage.dataForm,null);
    }

    @Then("The exercise name should be {string}")
    public void the_exercise_name_should_be(String text) {
        Assert.assertEquals(Runner.createRoutinePage.exerciseNameText.getText(), text);
    }

    @Then("The exercise description should say {string}")
    public void the_exercise_description_should_say(String description) {
        Assert.assertEquals(Runner.createRoutinePage.description.getText(), description);
    }

    @Then("The video should exist")
    public void the_video_should_exist() {
        Assert.assertNotEquals(Runner.createRoutinePage.video,null);
    }

    @When("The User enters {string} into the duration field")
    public void the_User_enters_into_the_duration_field(String duration) {
        Runner.createRoutinePage.duration.sendKeys(duration);
    }

    @When("The User enters {string} into the reps field")
    public void the_User_enters_into_the_reps_field(String reps) {
        Runner.createRoutinePage.reps.sendKeys(reps);
    }

    @When("The User clicks on the create button")
    public void the_User_clicks_on_the_create_button() {
        Runner.createRoutinePage.create.click();
    }

    @When("The User clicks the back button")
    public void the_User_clicks_the_back_button() {
        Runner.createRoutinePage.back.click();
    }

}
