package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private By logo = By.id("logo");
    private By signInButton = By.id("btn1");
    private By skipSignInButton = By.id("btn2");
    private By emailField = By.id("email");
    private By nextButton = By.id("enterimg");

    private HomePage() {

    }

    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    public boolean checkLogo() {
        LOG.info("Check if Logo is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void clickSignInButton() {
        LOG.info("Click Sign in button");
        driver.findElement(signInButton).click();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void clickBack () {
        LOG.info("Go back");
        driver.navigate().back();
    }

    public void checkEmailField(String email) {
        LOG.info("Put email into the field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSubmitButton() {
        LOG.info("Click submit");
        driver.findElement(nextButton).click();
    }
}
