package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewRoutineSteps {

    @Given("The User is on the view routine page")
    public void the_User_is_on_the_view_routine_page() {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/view_routine.html");
    }

    @Then("The routine name should be {string}")
    public void the_routine_name_should_be(String rname) {
        Assert.assertEquals(Runner.viewRoutinePage.routineName.getText(), rname);
    }

    @Then("The exercise duration should say {string}")
    public void the_exercise_duration_should_say(String duration) {
        Assert.assertEquals(Runner.viewRoutinePage.duration.getText(), duration);
    }

    @When("The User clicks on the start routine button")
    public void the_User_clicks_on_the_start_routine_button() {
        Runner.viewRoutinePage.start.click();
    }

}
