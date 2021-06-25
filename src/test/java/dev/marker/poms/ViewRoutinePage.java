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

    @FindBy(id = "start")
    public WebElement start;

    @FindBy(id = "exercise")
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

    @FindBy(id = "next-exercise")
    public WebElement nextExercise;

    @FindBy(id = "complete")
    public WebElement complete;
}
