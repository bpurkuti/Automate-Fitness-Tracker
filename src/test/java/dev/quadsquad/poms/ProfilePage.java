package dev.quadsquad.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //temp ids --- NOT YET IMPL ---
    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(id = "view-route")
    public WebElement viewRoute;

    @FindBy(id = "new-Route")
    public WebElement newRoute;

    @FindBy(xpath = "ROUTINE HISTORY TABLE")
    public WebElement routineHistory;
}
