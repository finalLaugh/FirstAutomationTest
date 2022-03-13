import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SeleniumLearn {

    /*public void typesOfLocators() {

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

    }*/
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
    public void locatorExam() {
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Navigate to the URL
        driver.get("https://saucedemo.com");

        // Use CSS selectors
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        // Use CSS/Xpath
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket")).click(); // add to cart
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click(); // click on cart
        driver.findElement(By.xpath("//*[@id='checkout']")).click(); // click Checkout

        // Use the best locator
        driver.findElement(By.id("first-name")).sendKeys("first name");
        driver.findElement(By.id("last-name")).sendKeys("last name");
        driver.findElement(By.id("postal-code")).sendKeys("zip");
        driver.findElement(By.xpath("//*[@id='continue']")).click(); // continue

        // By link text
        driver.findElement(By.name("finish")).click(); // click on Finish

        Assert.assertTrue(driver.findElement(By.cssSelector("#checkout_complete_container")).isDisplayed());
    }

}


