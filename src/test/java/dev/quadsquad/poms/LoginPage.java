package dev.quadsquad.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //temp ids --- NOT YET IMPL ---
    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(id = "create-acct")
    public WebElement createAcct;

    @FindBy(id = "signin")
    public WebElement signin;

    @FindBy(id = "signup")
    public WebElement signup;
}
