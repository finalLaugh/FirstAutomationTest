package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.homepage.HomePage;
import pages.registerpage.RegisterPage;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();

    @BeforeSuite
    public void setUp() {
        BasePage.setUp();
    }

    /*@AfterSuite
    public void tearDown() { BasePage.tearDown(); }*/
}
