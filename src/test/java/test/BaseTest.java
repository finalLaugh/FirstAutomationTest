package test;

import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.registerpage.RegisterPage;
import pages.switchTo.SwitchToAlerts;
import pages.switchTo.SwitchToFrames;
import pages.switchTo.SwitchToWindows;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public SwitchToAlerts switchToAlerts = SwitchToAlerts.getInstance();
    public SwitchToWindows switchToWindows = SwitchToWindows.getInstance();
    public SwitchToFrames switchToFrames = SwitchToFrames.getInstance();

    @BeforeSuite
    public void setUp() {
        BasePage.setUp();
    }

    /*@AfterSuite
    public void tearDown() { BasePage.tearDown(); }*/
}
