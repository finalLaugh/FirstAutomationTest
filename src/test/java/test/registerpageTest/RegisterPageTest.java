package test.registerpageTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class RegisterPageTest extends BaseTest {

    private String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void registerFields() {
        driver.get(newUrl);
        //sleep(1000);
        //registerPage.scrollToElement();
        registerPage.registerFieldsCompletion();
        //registerPage.setDateOfBirth("1987", "December", "3");
    }
}
