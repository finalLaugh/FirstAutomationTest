package pages.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.Set;

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
    private static final By clickOpenNewSeperateWindows = By.xpath("//a[@href='#Seperate']");
    private static final By clickOnClickButton2 = By.className("btn-primary");
    private static final By clickOpenNewSeperateWindows2 = By.xpath("//a[@href='#Multiple']");
    private static final By clickOnClickButton3 = By.xpath("//div[@id='Multiple']/button");

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
        sleep(1000);
    }

    public static void switchToDropDownMenuWindows2() {
        LOG.info("Click on 'Open new seperate windows'");
        driver.findElement(clickOpenNewSeperateWindows).click();
        sleep(1000);
        LOG.info("Click on 'click' button");
        driver.findElement(clickOnClickButton2).click();
    }

    public static void switchToDropDownMenuWindows3() {
        LOG.info("Click on 'Open seperate multiple windows'");
        driver.findElement(clickOpenNewSeperateWindows2).click();
        LOG.info("Click on click button");
        driver.findElement(clickOnClickButton3).click();
    }
}

