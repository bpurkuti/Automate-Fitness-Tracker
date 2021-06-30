package dev.marker.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    private WebDriver driver;

    public SignupPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //temp ids --- NOT YET IMPL ---
    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBy(id = "lastname")
    public WebElement lastname;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "confirmpassword")
    public WebElement reenterPassword;

    @FindBy(id = "height")
    public WebElement height;

    @FindBy(id = "weight")
    public WebElement weight;

    //Will dynamically find the selected sex"
    public WebElement sex(String id){
        return driver.findElement(By.id(id));
    }

    @FindBy(id = "age")
    public WebElement age;

    @FindBy(id = "signupbtn")
    public WebElement signup;

    @FindBy(id = "signin")
    public WebElement signin;

    @FindBy(id = "alert")
    public WebElement alert;
}
