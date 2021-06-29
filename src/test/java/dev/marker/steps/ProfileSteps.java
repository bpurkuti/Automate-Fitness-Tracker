package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileSteps {

    @Given("The User is on the profile page")
    public void the_User_is_on_the_profile_page() {
        Runner.driver.get("PROFILE URL");
    }

    @When("The User clicks on the new routine button")
    public void the_User_clicks_on_the_new_routine_button() {
        Runner.profilePage.newRoute.click();
    }

    @When("The User clicks on the routine button {string}")
    public void the_User_Clicks_On_The_Routine_Button(String routine) {
        Runner.profilePage.routine(routine).click();
    }

    @When("The User clicks on the logout button")
    public void the_User_clicks_on_the_logout_button() {
        Runner.profilePage.logout.click();
    }

    @Then("The greeting should say {string}")
    public void the_greeting_should_say(String greeting) {
        Assert.assertEquals(Runner.profilePage.greeting.getText(), greeting);;
    }

}
