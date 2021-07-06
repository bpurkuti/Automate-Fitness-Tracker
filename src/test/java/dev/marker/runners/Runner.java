package dev.marker.runners;

import dev.marker.poms.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"}, glue = "dev.marker.steps")
public class Runner {

    public static WebDriver driver = null;
    public static LoginPage loginPage = null;
    public static SignupPage signupPage = null;
    public static DashboardPage dashboardPage = null;
    public static CreateRoutinePage createRoutinePage = null;
    public static ViewRoutinePage viewRoutinePage = null;
    public static CreateExercisePage createExercisePage = null;


    @BeforeClass
    public static void setup(){
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
        dashboardPage = new DashboardPage(driver);
        createRoutinePage = new CreateRoutinePage(driver);
        viewRoutinePage = new ViewRoutinePage(driver);
        createExercisePage = new CreateExercisePage(driver);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
