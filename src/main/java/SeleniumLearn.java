import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLearn {
    WebDriver driver;

    @Before
    public void setUp() {
        // Telling the system where to find cromedriver.
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver.exe");
        // 1. Instantiate the driver
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        // 5. Quit driver
        driver.quit();
    }

    @Test
    public void typesOfLocators() {

        // 2. Store the URL in a variable
        String url = "https://saucedemo.com";
        // 3. Navigate to the URL
        driver.get(url);
        // 4. Find and store element
        WebElement element;
        // ID
        element = driver.findElement(By.id("user-name"));
        // Name
        //driver.findElement(By.name("name of locator"));
        // Class name
        driver.findElement(By.className("form_input"));
        // Tag name
        driver.findElement(By.tagName("input"));
        // CSS selector
        driver.findElement(By.cssSelector("#user-name"));
        // Xpath selector
        driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        // Link text
        //driver.findElement(By.linkText("exact link text inside the 'a' tag"));
        // Partial link text
        //driver.findElement(By.partialLinkText("parts of link text that should be unique, not repeatable"));

    }
}
