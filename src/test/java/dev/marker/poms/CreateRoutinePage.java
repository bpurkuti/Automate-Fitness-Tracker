package dev.marker.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRoutinePage {

    private WebDriver driver;

    public CreateRoutinePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //temp ids --- NOT YET IMPL ---
    @FindBy(id = "logout")
    public WebElement logout;

    @FindBy(id = "routine-name")
    public WebElement routineName;

    @FindBy(id = "exercise")
    public WebElement exercise;

    @FindBy(id = "add")
    public WebElement add;

    @FindBy(id = "data-form")
    public WebElement dataForm;

    @FindBy(id = "exercise-name-text")
    public WebElement exerciseNameText;

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

    @FindBy(id = "create")
    public WebElement create;

    @FindBy(id = "back")
    public WebElement back;
}
