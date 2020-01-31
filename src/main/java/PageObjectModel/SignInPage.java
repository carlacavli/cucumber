package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class SignInPage {
   WebDriver driver;

    public SignInPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );


    }

    @FindBy(css="[formcontrolname=\"username\"]")
    private WebElement inputUserName;


    @FindBy(css="[formcontrolname=\"password\"]")
    private WebElement inputPassword;

    @FindBy(css="button[aria-label=\"LOGIN\"]")
    private WebElement buttonLogin;

    public void typeIninputUserName(){
        inputUserName.sendKeys("nigeria_tenant_admin");
    }
    public void typeIninputPassword(){
        inputPassword.sendKeys("TnvLOl54WxR75vylop2A");
    }
    public void clickbuttonLogin(){
        buttonLogin.click();
    }


}