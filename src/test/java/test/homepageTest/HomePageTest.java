package test.homepageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

public class HomePageTest extends BaseTest {

    @Test
    public void testLogoIsDisplayed() {
        Assert.assertTrue(homePage.checkLogo(), "Logo is not shown");
    }
}
