package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class SwitchToWindowsTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void switchToDropDownMenuFunc () {
        driver.get(newUrl);
        switchToWindows.switchToDropDownMenuWindows();
        sleep(1000);
        switchToWindows.tabWindowsClose();
        switchToWindows.switchToDropDownMenuWindows2();
        sleep(1000);
        switchToWindows.tabWindowsClose();
        switchToWindows.switchToDropDownMenuWindows3();
        sleep(1000);
        switchToWindows.tabWindowsClose();

    }
}
