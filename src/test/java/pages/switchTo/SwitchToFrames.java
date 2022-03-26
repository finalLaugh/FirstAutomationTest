package pages.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.Set;

public class SwitchToFrames extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToFrames.class);
    public static SwitchToFrames instance;

    public static SwitchToFrames getInstance() {
        if (instance == null) {
            instance = new SwitchToFrames();
        }
        return instance;
    }

    // Register menu locators \\
//    private static final By skipSignInButton = By.id("btn2");
//    private static final By switchToDropDownHover = By.xpath("//a[@href='SwitchTo.html' and text()='SwitchTo']");
//    private static final By switchToDropDownFrames = By.xpath("//a[@href='Frames.html']");
      private static final By singleIframeSelect = By.id("singleframe");
      private static final By singleIframeField = By.xpath("/html/body/section/div/div/div/input");
      private static final By iframeWithinAnIframe = By.xpath("//a[@href='#Multiple']");
      private static final By iframeWithinAnIframeField = By.xpath("/html/body/section/div/div/div/input");


    /*public void clickSkipSignInButton() {
        LOG.info("Click skip Sign in button");
        driver.findElement(skipSignInButton).click();
    }*/


    public static void switchToDropDownMenuFrames() {
        /*LOG.info("Click on Frames drop-down button");
        driver.findElement(switchToDropDownHover).sendKeys(Keys.TAB);
        driver.findElement(switchToDropDownHover).click();
        LOG.info("Click on Frames dropdown menu");
        driver.findElement(switchToDropDownFrames).click();*/

        LOG.info("Select Single Iframe and click on the text field");
        driver.switchTo().frame(0);
        driver.findElement(singleIframeField).sendKeys("Parent frame 0");
        sleep(2000);
        driver.switchTo().defaultContent();
        LOG.info("Select Iframe within an Iframe and click on the text field");
        driver.findElement(iframeWithinAnIframe).click();
        sleep(1000);
        driver.switchTo().frame(1).switchTo().frame(0);
        driver.findElement(iframeWithinAnIframeField).sendKeys("Child frame 0");
        sleep(2000);
    }
}

