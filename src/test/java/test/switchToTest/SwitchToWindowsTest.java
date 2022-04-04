package test.switchToTest;

import org.testng.annotations.Test;
import pages.switchTo.SwitchToWindows;
import test.BaseTest;

import static pages.BasePage.*;

public class SwitchToWindowsTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void switchToDropDownMenuFunc () {
        driver.get(newUrl);
        SwitchToWindows.switchToDropDownMenuWindows();
        sleep(1000);
        SwitchToWindows.tabWindowsClose();
        SwitchToWindows.switchToDropDownMenuWindows2();
        sleep(1000);
        SwitchToWindows.tabWindowsClose();
        SwitchToWindows.switchToDropDownMenuWindows3();
        sleep(1000);
        SwitchToWindows.tabWindowsClose();
    }
}
