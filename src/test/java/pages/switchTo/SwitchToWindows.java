package pages.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToWindows extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToWindows.class);
    public static SwitchToWindows instance;

    public static SwitchToWindows getInstance() {
        if (instance == null) {
            instance = new SwitchToWindows();
        }
        return instance;
    }

    // Register menu locators
    private static final By skipSignInButton = By.id("btn2");
    private static final By switchToDropDownHover = By.xpath("//a[@href='SwitchTo.html']");
    private static final By switchToDropDownWindows = By.xpath("//li/a[@href='Windows.html']");
    private static final By clickOnClickButton = By.xpath("//button[@class='btn btn-info' and text()='    click   ']");

    /*public void clickSkipSignInButton() {
        LOG.info("Click skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }*/

    public static void switchToDropDownMenuWindows() {
        /*LOG.info("Hover on SwitchTo dropdown menu");
        driver.findElement(switchToDropDownHover).sendKeys(Keys.TAB);
        driver.findElement(switchToDropDownHover).click();
        LOG.info("Click on Windows");
        driver.findElement(switchToDropDownWindows).click();*/
        LOG.info("Click on 'click' button");
        driver.findElement(clickOnClickButton).click();
        sleep(2000);

    }
}

