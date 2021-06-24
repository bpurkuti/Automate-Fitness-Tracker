package dev.quadsquad.runners;

import dev.quadsquad.poms.LoginPage;
import dev.quadsquad.poms.SignupPage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "dev.quadsquad.steps")
public class RunAll {

    public static WebDriver driver = null;
    public static LoginPage loginPage = null;
    public static SignupPage signupPage = null;


    @BeforeClass
    public static void setup(){
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
