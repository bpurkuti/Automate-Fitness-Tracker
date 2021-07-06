package dev.marker.steps;

import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginSteps {

    @Given("The User is on the login page")
    public void the_User_is_on_the_login_page() throws InterruptedException {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/login.html");
        Thread.sleep(500);
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

    @Then("A login alert should appear")
    public void a_login_alert_should_appear() throws InterruptedException {
        Thread.sleep(250);
        Assert.assertNotEquals(Runner.loginPage.loginerror.getText(), "");
    }

    @Then("The title should be {string}")
    public void the_Title_Should_Be(String title) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(Runner.driver.getTitle(), title);
    }

    @Then("The username field should be empty")
    public void the_username_field_should_be_empty() {
        Assert.assertEquals(Runner.loginPage.username.getText(), "");
    }

    @Then("The password field should be empty")
    public void the_password_field_should_be_empty() {
        Assert.assertEquals(Runner.loginPage.password.getText(), "");
    }
}
