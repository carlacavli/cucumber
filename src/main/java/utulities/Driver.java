package utulities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    /*
    why we need to use one driver (singleton pattern)
    because we are using page object model and we need swith between the page
    without singleton pattern it will thwor null pointer exception
     */
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }
}