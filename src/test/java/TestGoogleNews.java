import Google.News.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.CommonUtils;
import utils.DriverUtils;
import utils.LoggerUtils;

import java.io.IOException;

public class TestGoogleNews {

    public static String browserName = System.getProperty("browserName");


    @Test
    public static void testGoogleNewsPage() throws IOException {
        WebDriver driver = DriverUtils.getBrowserInstance(browserName);
        CommonUtils.launchGoogleNewsPage(driver);
        String googleNewsHomePageTitle = driver.getTitle();
        Assert.assertEquals(googleNewsHomePageTitle,"Google News","browser is not redirected to the correct page");
        driver.quit();
    }
}
