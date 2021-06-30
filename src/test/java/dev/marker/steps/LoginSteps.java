package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    @Given("The User is on the login page")
    public void the_User_is_on_the_login_page() {
        Runner.driver.get("LOGIN URI");//LOGIN URI
    }

    @When("The User enters {string} into the username field")
    public void the_User_enters_into_the_username_field(String username) {
        Runner.loginPage.username.sendKeys(username);
    }

    @When("The User enters {string} into the password field")
    public void the_User_enters_into_the_password_field(String password) {
        Runner.loginPage.password.sendKeys(password);
    }

    @When("The User clicks on the sign-in button")
    public void the_User_clicks_on_the_sign_in_button() {
        Runner.loginPage.signin.click();
    }

    @Then("An alert should say {string}")
    public void an_alert_should_say(String alert) {
        Assert.assertEquals(Runner.loginPage.alert.getText(), alert);
    }

    @Then("The title should be {string}")
    public void the_Title_Should_Be(String title) {
        Assert.assertEquals(Runner.driver.getTitle(), title);
    }

    @Then("The username field should be empty")
    public void the_Username_Field_Should_Be_Empty() {
        Assert.assertEquals(Runner.loginPage.username.getText(), "");
    }

    @Then("The password field should be empty")
    public void the_Password_Field_Should_Be_Empty() {
        Assert.assertEquals(Runner.loginPage.password.getText(), "");
    }
}
