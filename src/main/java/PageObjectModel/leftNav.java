package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utulities.Driver;

public class leftNav {
    private WebDriver driver;

    public leftNav() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "fuse-navigation .group-items > .nav-item:nth-child(1)")
    private WebElement dropdownSetup;

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement dropdownParameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement buttonCountries;

    @FindBy(xpath = "//span[contains(text(),'Citizenship')]")
    private WebElement buttonCitizenship;

    public void clickondropdownSetup() {
        dropdownSetup.click();
    }

    public void clickondropdownParameters() {
        dropdownParameters.click();
    }

    public void clickonbuttonCountries() {
        buttonCountries.click();
    }

    public void clickbuttonCitizenship() {
        buttonCitizenship.click();
    }
}