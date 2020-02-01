package PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class SignInPage  extends AbstractClass{
    WebDriver driver;

    public SignInPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


//        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("nigeria_tenant_admin");
//        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("TnvLOl54WxR75vylop2A");
//        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
    }

    @FindBy(css = "[formcontrolname=\"username\"]")
    private WebElement inputUserName;

    @FindBy(css = "[formcontrolname=\"password\"]")
    private WebElement inputPassword;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement buttonLogin;


    public void typeIninputUserName() {
        sendkeysFunction(inputUserName, "nigeria_tenant_admin");

    }

    public void typeIninputPassword() {
        sendkeysFunction(inputPassword, "TnvLOl54WxR75vylop2A");

    }


    public void clickonbuttonLogin() {
        clickFunction(buttonLogin);


    }
}