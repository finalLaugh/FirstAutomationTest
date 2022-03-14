package test.homepageTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed() throws InterruptedException {
        Assert.assertTrue(homePage.checkLogo(), "Logo is not shown");
        //homePage.clickSignInButton();
       // homePage.clickBack();
        //homePage.clickSkipSignInButton();
        homePage.checkEmailField("ffxii23@yahoo.com");
        Thread.sleep(2000);
        homePage.clickSubmitButton();
        Thread.sleep(2000);
    }
}
