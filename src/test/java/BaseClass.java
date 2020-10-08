import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverUtils;
import utils.LoggerUtils;

import java.io.IOException;

public class BaseClass {

    public static WebDriver driver;
    public static String browserName = System.getProperty("browserName");

  @BeforeMethod
    public void setup() throws IOException {
        driver =DriverUtils.getBrowserInstance(browserName);
    }

    @AfterMethod
    public void browserInstanceClose(){
        LoggerUtils.info("Closing browser instance");
        driver.quit();
    }
}
