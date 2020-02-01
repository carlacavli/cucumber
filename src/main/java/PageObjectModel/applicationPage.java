package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class applicationPage extends AbstractClass {
    private WebDriver driver;


    public applicationPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "svg[data-icon='plus']")
    private WebElement plusButton;

    @FindBy(css = "mat-dialog-actions svg[data-icon='save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text().'successfully created')]")
    private WebElement successfullMessage;


    @FindAll({@FindBy(xpath = "//tbody//tr//td[2]")})
    private List<WebElement> tableListofNames;

    public void clickPlusButton() {
        clickFunction(plusButton);
    }

    public void clickSaveButton() {
        clickFunction(saveButton);
    }

    public void nameIsCreated(String value) {

//        waitUntilVisibility(successfullMessage);
//        verifyCreated(tableListofNames,value);
    }
}