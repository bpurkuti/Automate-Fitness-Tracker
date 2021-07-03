package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardSteps {

    @Given("The User is on the dashboard page")
    public void the_User_is_on_the_profile_page() throws InterruptedException {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/dashboard.html");
        Thread.sleep(500);
    }

    @When("The User clicks on the new routine button")
    public void the_User_clicks_on_the_new_routine_button() throws InterruptedException {
        Thread.sleep(300);
        Runner.dashboardPage.newRoute.click();
    }

    @When("The User clicks on the routine button {string}")
    public void the_User_Clicks_On_The_Routine_Button(String routine) {
        Runner.dashboardPage.routine(routine).click();
    }

    @When("The User clicks on the logout button")
    public void the_User_clicks_on_the_logout_button() {
        Runner.dashboardPage.logout.click();
    }

    @Then("The greeting should say {string}")
    public void the_greeting_should_say(String greeting) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Runner.dashboardPage.greeting.getText(), greeting);;
    }

    @When("The User clicks on a routine button {string}")
    public void the_User_clicks_on_a_routine_button(String routineId) {
        Runner.dashboardPage.routine(routineId).click();
    }

}
