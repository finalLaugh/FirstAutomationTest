package pages.switchTo;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToAlerts extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlerts.class);
    public static SwitchToAlerts instance;

    public static SwitchToAlerts getInstance() {
        if (instance == null) {
            instance = new SwitchToAlerts();
        }
        return instance;
    }

    // Register menu locators
    private final By skipSignInButton = By.id("btn2");
    private final By switchToDropDownHover = By.xpath("//a[text()='SwitchTo']");
    private final By switchToDropDownAlertsClick = By.xpath("//a[text()='Alerts']");
    private final By clickAlertWithOk = By.xpath("//button[@class='btn btn-danger']");
    private final By clickAlertWithOkAndCancel = By.xpath("//a[@href='#CancelTab']");
    private final By clickButtonConfirmBox = By.className("btn-primary");
    private final By clickAlertWithTextbox = By.xpath("//a[@href='#Textbox']");
    private final By clickButtonPromptBox = By.className("btn-info");

    public void clickSkipSignInButton() {
        LOG.info("Click skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }

    public void switchToDropDownMenuAlerts() {
        /*LOG.info("Hover on SwitchTo dropdown menu");
        driver.findElement(switchToDropDownHover).sendKeys(Keys.TAB);
        driver.findElement(switchToDropDownHover).click();
        LOG.info("Click on Alerts");
        driver.findElement(switchToDropDownAlertsClick).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.tagName("body")), -1, -1).click();*/
        LOG.info("Click on 'click the button to display an alert box'");
        driver.findElement(clickAlertWithOk).click();
        sleep(2000);

        LOG.info("Click OK on the alert box");
        driver.switchTo().alert().accept();

        LOG.info("Click on Alert with OK & Cancel");
        driver.findElement(clickAlertWithOkAndCancel).click();

        LOG.info("Click on 'click the button to display a confirm box");
        driver.findElement(clickButtonConfirmBox).click();
        sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(clickButtonConfirmBox).click();
        sleep(2000);
        driver.switchTo().alert().dismiss();
        sleep(2000);

        LOG.info("Click on Alert with Textbox");
        driver.findElement(clickAlertWithTextbox).click();

        LOG.info("Click on 'click the button to demonstrate the prompt box");
        driver.findElement(clickButtonPromptBox).click();
        sleep(2000);
        driver.switchTo().alert().sendKeys("Dragos");
        driver.switchTo().alert().accept();
        driver.findElement(clickButtonPromptBox).click();
        sleep(2000);
        driver.switchTo().alert().dismiss();
    }
}

