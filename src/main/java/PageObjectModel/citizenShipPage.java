package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class citizenShipPage extends AbstractClass {
    private WebDriver driver;

    public citizenShipPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputCitizenName;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement InputCitizenShortName;

    public void typeinputCitizenName(String name){
        sendkeysFunction(inputCitizenName, name);
    }
    public void typeInputCitizenShortName(String shortname){
        sendkeysFunction(InputCitizenShortName, shortname);
    }
}

