package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CreateExerciseSteps {

    @Given("The User is on the create exercise page")
    public void the_User_is_on_the_create_exercise_page() throws InterruptedException {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/create_exercise.html");
        Thread.sleep(500);
    }

    @When("The User enters {string} into the exercise name field")
    public void the_User_enters_into_the_exercise_name_field(String exercise) {
        Runner.createExercisePage.exercise.sendKeys(exercise);
    }

    @When("The User selects the exercise type {string}")
    public void the_User_selects_the_exercise_type(String type) {
        new Select(Runner.createExercisePage.exercisetype).selectByVisibleText(type);
    }

    @When("The User enters {string} into the video link field")
    public void the_User_enters_into_the_video_link_field(String link) {
        Runner.createExercisePage.videolink.sendKeys(link);
    }

    @When("The User enters {string} into the description field")
    public void the_User_enters_into_the_description_field(String description) {
        Runner.createExercisePage.description.sendKeys(description);
    }

    @When("The User clicks on the submit button")
    public void the_User_clicks_on_the_submit_button() throws InterruptedException {
        Thread.sleep(250);
        Runner.createExercisePage.submit.click();
    }

    @Then("An error alert should appear")
    public void an_error_alert_should_appear() throws InterruptedException {
        Thread.sleep(500);
        Assert.assertNotEquals(Runner.createExercisePage.errormsg.getText(), "");
    }

}
