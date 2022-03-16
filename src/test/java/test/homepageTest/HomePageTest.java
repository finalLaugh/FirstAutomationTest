package test.homepageTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.sleep;

public class HomePageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed() throws InterruptedException {
        Assert.assertTrue(homePage.checkLogo(), "Logo is not shown");
        sleep(2000);

        // homePage.clickBack();
        // homePage.checkEmailField("ffxii23@yahoo.com");
        // homePage.clickSkipSignInButton();
        // homePage.clickSubmitButton();
    }

    @Test
    public void signInFunctionality() throws InterruptedException {
        homePage.clickSignInButton();
        sleep(2000);
        homePage.signInFields("ffxii23@yahoo.com", "shibuyastation");
        Assert.assertTrue(homePage.checkLogInMessage(), "The text is not shown");
        sleep(2000);
    }
}
