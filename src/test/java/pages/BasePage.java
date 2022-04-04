package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        //System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        /*Dimension dimension = new Dimension(1366, 768);
        driver.manage().window().setSize(dimension);*/
        driver.manage().window().maximize();
        String url = "http://demo.automationtesting.in";
        driver.get(url);
        LOG.info("Open browser");

    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String returnBaseUrl() {
        return "http://demo.automationtesting.in/Index.html";
    }

    public static String getBaseUrl() {
        String baseUrl = returnBaseUrl();
        if (baseUrl != null) {
            return baseUrl.replace("Index.html", "");
        }
        return baseUrl;
    }

    public static void tabWindowsClose() {
        LOG.info("Close tab/window and return to the home tab/window");
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        int count = allWindows.size();
        for (String child : allWindows) {
            if (!parent.equalsIgnoreCase(child)) {
                driver.switchTo().window(child);
                sleep(1000);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
    }

    public void switchToNewTabWindow(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.switchTo().window(originalWindow);
    }
}
