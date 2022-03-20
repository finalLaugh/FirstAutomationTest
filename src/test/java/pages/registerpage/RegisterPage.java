package pages.registerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    private final By skipSignInButton = By.id("btn2");
    private final By firstNameField = By.xpath("//input[@ng-model='FirstName']");
    private final By lastNameField = By.xpath("//input[@ng-model='LastName']");
    private final By address = By.xpath("//textarea");
    private final By emailAddressField = By.xpath("//input[@ng-model='EmailAdress']");
    private final By phoneField = By.xpath("//input[@ng-model='Phone']");
    private final By genderMale = By.xpath("//input[@value='Male']");
    private final By genderFemale = By.xpath("//input[@value='FeMale']");
    private final By hobbiesCricket = By.xpath("//input[@id='checkbox1']");
    private final By hobbiesMovies = By.xpath("//input[@id='checkbox2']");
    private final By hobbiesHockey = By.xpath("//input[@id='checkbox3']");
    private final By languages = By.xpath("//div[@id='msdd']");
    private final By languagesSelect = By.xpath("//a[@class='ui-corner-all' and text()='Romanian']");
    private final By skills = By.id("Skills");
    private final By skillsSelect = By.xpath("//option[@value='Java']");
    private final By country = By.id("countries");
    private final By countryClick = By.xpath("//span[@role='combobox']");
    private final By countrySelect = By.xpath("//li[@class='select2-results__option' and contains(text(),'Japan')]");
    private final By dateOfBirthYearClick = By.id("yearbox");
    private final By dateOfBirthYearSelect = By.xpath("//option[@value='1987']");
    private final By dateOfBirthMonthClick = By.xpath("//select[@ng-model='monthbox']");
    private final By dateOfBirthMonthSelect = By.xpath("//option[@value='December']");
    private final By dateOfBirthDayClick = By.id("daybox");
    private final By dateOfBirthDaySelect = By.xpath("//option[@value='3']");
    private final By passwordField = By.xpath("//input[@id='firstpassword']");
    private final By confirmPasswordField = By.xpath("//input[@id='secondpassword']");
    private final By submitButton = By.xpath("//button[@id='submitbtn']");
    private final By refreshButton = By.id("Button1");

    public void clickSkipSignInButton() {
        LOG.info("Click skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void registerFieldsCompletion() {
        LOG.info("Type in first name");
        driver.findElement(firstNameField).sendKeys("Dragos");
        LOG.info("Type in last name");
        driver.findElement(lastNameField).sendKeys("Cas");
        LOG.info("Type in address");
        driver.findElement(address).sendKeys("The hidden one.");
        LOG.info("Type in email");
        driver.findElement(emailAddressField).sendKeys("ffxii23@yahoo.com");
        LOG.info("Type in phone");
        driver.findElement(phoneField).sendKeys("0743292558");
        LOG.info("Choose gender");
        driver.findElement(genderMale).click();
        LOG.info("Choose hobbies");
        driver.findElement(hobbiesMovies).click();
        LOG.info("Choose languages");
        driver.findElement(languages).click();
        driver.findElement(languagesSelect).click();
        LOG.info("Choose skills");
        driver.findElement(skillsSelect).click();
        LOG.info("Select country");
        driver.findElement(countryClick).click();
        driver.findElement(countrySelect).click();
        LOG.info("Choose year, month and day");
        driver.findElement(dateOfBirthMonthClick).click();
        driver.findElement(dateOfBirthYearSelect).click();
        driver.findElement(dateOfBirthMonthSelect).click();
        driver.findElement(dateOfBirthDaySelect).click();
        LOG.info("Type in password and confirm password");
        driver.findElement(passwordField).sendKeys("katana");
        driver.findElement(confirmPasswordField).sendKeys("katana");
        LOG.info("Click Submit button");
        //Scroll element into view using JavaScriptExecutor _________________________________
        //((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
        //___________________________________________________________________________________
        driver.findElement(submitButton).sendKeys(Keys.PAGE_DOWN);
        driver.findElement(submitButton).click();
        sleep(2000);
        LOG.info("Click Refresh button");
        driver.findElement(refreshButton).sendKeys(Keys.TAB);
        driver.findElement(refreshButton).click();


    }
}