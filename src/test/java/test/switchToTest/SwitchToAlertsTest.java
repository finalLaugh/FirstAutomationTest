package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToAlertsTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Alerts.html";

    @Test
    public void switchToDropDownMenuFunc () {
        driver.get(newUrl);
        //switchToAlerts.clickSkipSignInButton();
        switchToAlerts.switchToDropDownMenuAlerts();
    }
}
