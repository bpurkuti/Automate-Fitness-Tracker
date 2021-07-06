package dev.marker.steps;


import dev.marker.runners.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignupSteps {

    @Given("The User is on the sign-up page")
    public void the_User_is_on_the_sign_up_page() throws InterruptedException {
        Runner.driver.get("https://quadsquad.s3.amazonaws.com/signup.html");
        Thread.sleep(500);
    }

    @When("The User clicks on the sign-up button")
    public void the_User_clicks_on_the_sign_up_button() {
        Runner.signupPage.signup.click();
    }

    @When("The User enters {string} into the firstname field")
    public void the_User_enters_into_the_firstname_field(String firstname) {
        Runner.signupPage.firstname.sendKeys(firstname);
    }

    @When("The User enters {string} into the lastname field")
    public void the_User_enters_into_the_lastname_field(String lastname) {
        Runner.signupPage.lastname.sendKeys(lastname);
    }

    @When("The User enters {string} into the confirm password field")
    public void the_User_enters_into_the_confirm_password_field(String confirmPass) {
        Runner.signupPage.reenterPassword.sendKeys(confirmPass);
    }

    @When("The User enters {string} into the height field")
    public void the_User_enters_into_the_height_field(String height) {
        Runner.signupPage.height.sendKeys(height);
    }

    @When("The User enters {string} into the weight field")
    public void the_User_enters_into_the_weight_field(String weight) throws InterruptedException {
        Thread.sleep(500);
        Runner.signupPage.weight.sendKeys(weight);
    }

    @When("The User enters {string} into the gender field")
    public void the_User_selects_from_the_sex_dropdown(String gender) {
        Runner.signupPage.gender.sendKeys(gender);
    }

    @When("The User enters {string} into the age field")
    public void the_User_enters_into_the_age_field(String age) {
        Runner.signupPage.age.sendKeys(age);
    }
}
