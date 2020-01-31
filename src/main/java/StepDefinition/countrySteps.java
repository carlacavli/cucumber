package StepDefinition;

import PageObjectModel.SignInPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utulities.Driver;

import java.util.concurrent.TimeUnit;

public class countrySteps {


    WebDriver driver;
    SignInPage sip = new SignInPage();
    leftNav lv = new leftNav();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
//        System.setProperty( "webdriver.chrome.driver", "D:\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe" );

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://test-basqar.mersys.io");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {

        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickbuttonLogin();

    }

    @Given("^Click on setup on top$")
    public void click_on_setup_on_top() throws Throwable {
        lv.clickondropdownSetup();
    }

    @Given("^Click on parameter$")
    public void click_on_parameter() throws Throwable {
        lv.clickondropdownParameters();
    }

    @Given("^Click on countries$")
    public void click_on_countries() throws Throwable {
        lv.clickonbuttonCountries();
    }
}