package test.registerpageTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.sleep;

public class RegisterPageTest extends BaseTest {


    @Test
    public void registerFields() {
        registerPage.clickSkipSignInButton();
        //sleep(1000);
        registerPage.registerFieldsCompletion();

    }
}
