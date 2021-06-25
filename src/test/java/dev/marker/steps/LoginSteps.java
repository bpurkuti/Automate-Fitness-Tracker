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

    @When("The User enters {username} into the username field")
    public void the_User_enters_notauser_into_the_username_field(String username) {
        Runner.loginPage.username.sendKeys(username);
    }

    @When("The User enters {password} into the password field")
    public void the_User_enters_notapass_into_the_password_field(String password) {
        Runner.loginPage.password.sendKeys(password);
    }

    @When("The User clicks on the sign-in button")
    public void the_User_clicks_on_the_sign_in_button() {
        Runner.loginPage.signin.click();
    }

    @Then("An alert should say {alert}")
    public void an_alert_should_say_Please_enter_a_valid_username_and_password(String alert) {
        Assert.assertEquals(Runner.loginPage.alert.getAttribute("value"), alert);
    }

    @Then("Then The title should be {title}")
    public void then_The_title_should_be_Login(String title) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(Runner.driver.getTitle(), title);
    }
}
