package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ViewRoutineSteps {

    @Given("The User is on the view routine page")
    public void the_User_is_on_the_view_routine_page() throws InterruptedException {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/view_routine.html");
        Thread.sleep(1000);
    }

    @Then("The routine name should be {string}")
    public void the_routine_name_should_be(String rname) {
        Assert.assertEquals(Runner.viewRoutinePage.routineName.getText(), rname);
    }

    @When("The User clicks on the start routine button")
    public void the_User_clicks_on_the_start_routine_button() {
        Runner.viewRoutinePage.start.click();
    }

    @Then("The video should exist")
    public void the_video_should_exist() {
        Assert.assertNotEquals(Runner.viewRoutinePage.video, null);
    }

    @When("The User enters {string} into the duration field")
    public void the_User_enters_into_the_duration_field(String duration) throws InterruptedException {
        Thread.sleep(500);
        Runner.viewRoutinePage.duration.sendKeys(duration);
    }

    @Then("The current exercise should say {string}")
    public void the_current_exercise_should_say(String exercise) {
        Assert.assertEquals(Runner.viewRoutinePage.exercise.getText(), exercise);
    }

    @Then("The description should say {string}")
    public void the_description_should_say(String description) {
        Assert.assertEquals(Runner.viewRoutinePage.description.getText(), description);
    }

    @When("The User clicks on the complete exercise button")
    public void the_User_clicks_on_the_complete_exercise_button() throws InterruptedException {
        Thread.sleep(500);
        Runner.viewRoutinePage.completeExercise.click();
    }

    @When("The User clicks on the complete routine button")
    public void the_User_clicks_on_the_complete_routine_button() throws InterruptedException {
        Thread.sleep(1000);
        Runner.viewRoutinePage.completeRoutine.click();
    }

    @When("The User enters {string} into the reps field")
    public void the_User_enters_into_the_reps_field(String reps) {
        Runner.viewRoutinePage.reps.sendKeys(reps);
    }

    @Then("The previous exercise should be {string}")
    public void the_previous_exercise_should_be(String prev) {
        Assert.assertEquals(Runner.viewRoutinePage.prevExercise.getText(), prev);
    }

    @Then("The next exercise should be {string}")
    public void the_next_exercise_should_be(String next) {
        Assert.assertEquals(Runner.viewRoutinePage.nextExercise.getText(), next);
    }

    @Then("The history graph should contain routine {string}")
    public void the_history_graph_should_contain_routine(String routineId) {
        Assert.assertNotEquals(Runner.dashboardPage.routineHistory.findElement(By.id(routineId)), null);
    }

}
