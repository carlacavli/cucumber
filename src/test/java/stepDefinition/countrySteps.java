package stepDefinition;

import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class countrySteps {

    @Given("^Go to etsy website$")
    public void go_to_etsy_website() throws Throwable {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");


    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
    }
    }