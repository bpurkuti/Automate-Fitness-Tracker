package dev.marker.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    @FindBy(id = "greeting")
    public WebElement greeting;

    //Will dynamically find the element of "id"
    public WebElement routine(String id){
        return driver.findElement(By.id(id));
    }

    @FindBy(id = "new-Route")
    public WebElement newRoute;

    @FindBy(xpath = "ROUTINE HISTORY TABLE")
    public WebElement routineHistory;
}
