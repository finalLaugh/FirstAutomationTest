package test.switchToTest;

import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class SwitchToFramesTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Frames.html";

    @Test
    public void switchToDropDownMenuFunc () {
        driver.get(newUrl);
        //switchToFrames.clickSkipSignInButton();
        switchToFrames.switchToDropDownMenuFrames();


    }
}
