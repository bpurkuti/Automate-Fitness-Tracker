package dev.marker.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewRoutinePage {

    private WebDriver driver;

    public ViewRoutinePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //temp ids --- NOT YET IMPL ---
    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(id = "startbtn")
    public WebElement start;

    @FindBy(id = "exercisename")
    public WebElement exercise;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(id = "video")
    public WebElement video;

    @FindBy(id = "duration")
    public WebElement duration;

    @FindBy(id = "weight")
    public WebElement weight;

    @FindBy(id = "reps")
    public WebElement reps;

    @FindBy(id = "sets")
    public WebElement sets;

    @FindBy(id = "prevexercisename")
    public WebElement prevExercise;

    @FindBy(id = "nextexercisename")
    public WebElement nextExercise;

    @FindBy(id = "routinename")
    public WebElement routineName;

    @FindBy(id = "completeexercisebtn")
    public WebElement completeExercise;

    @FindBy(id = "completeeroutinebtn")
    public WebElement completeRoutine;
}
