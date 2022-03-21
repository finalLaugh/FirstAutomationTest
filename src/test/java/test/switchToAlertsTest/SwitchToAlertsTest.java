package test.switchToAlertsTest;

import org.testng.annotations.Test;
import test.BaseTest;

public class SwitchToAlertsTest extends BaseTest {

    @Test
    public void switchToDropDownMenuFunc () {
        //switchToAlerts.clickSkipSignInButton();
        switchToAlerts.switchToDropDownMenuAlerts();
    }
}
