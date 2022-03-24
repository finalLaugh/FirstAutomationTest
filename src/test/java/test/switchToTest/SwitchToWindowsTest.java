package test.switchToTest;

import org.testng.annotations.Test;
import pages.switchTo.SwitchToWindows;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToWindowsTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void switchToDropDownMenuFunc () {
        driver.get(newUrl);
        SwitchToWindows.switchToDropDownMenuWindows();
    }
}
