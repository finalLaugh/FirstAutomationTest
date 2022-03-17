package pages.registerpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    // Register menu locators
    private By skipSignInButton = By.id("btn2");
    private By firstNameField = By.xpath("//input[@ng-model='FirstName']");
    private By lastNameField = By.xpath("//input[@ng-model='LastName']");


    public void clickSkipSignInButton() {
        LOG.info("Click skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void registerFieldsCompletion() {
        LOG.info("Type in first name");
        driver.findElement(firstNameField).click();
        driver.findElement(firstNameField).sendKeys("Dragos");
        LOG.info("Type in last name");
        driver.findElement(lastNameField).click();
        driver.findElement(lastNameField).sendKeys("Cas");
    }
}
