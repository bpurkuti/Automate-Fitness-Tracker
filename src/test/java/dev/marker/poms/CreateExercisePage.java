package dev.marker.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateExercisePage {

    private WebDriver driver;

    public CreateExercisePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "exercisename")
    public WebElement exercise;

    @FindBy(id = "exercisetype")
    public WebElement exercisetype;

    @FindBy(id = "videolink")
    public WebElement videolink;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "submitbtn")
    public WebElement submit;

    @FindBy(id = "errormsg")
    public WebElement errormsg;

}
