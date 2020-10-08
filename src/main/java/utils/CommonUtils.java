package utils;/*
 *
 * created by himanshu on 08/10/20
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CommonUtils {

    public static String googleNewsUrl;

    public static void implicitWait(WebDriver driver, WebElement element, int duration) {
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
    }

    public static void launchGoogleNewsPage(WebDriver driver) throws IOException {
        googleNewsUrl = PropertyUtils.readPropertyFile("googleNewsHomePageUrl");
        LoggerUtils.info("launching Google News");
        driver.get(googleNewsUrl);
    }

}
