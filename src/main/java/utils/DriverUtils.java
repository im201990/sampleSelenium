package utils;/*
 *
 * created by himanshu on 09/10/20
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class DriverUtils {

    public static WebDriver driver;

    public static WebDriver getBrowserInstance(String browser) throws IOException {
        if (browser.equalsIgnoreCase("chrome")) {
            String chromeDriverPath = System.getProperty("user.dir") + "/src/main/resources/chromedriver";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            options.addArguments("--start-fullscreen");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(capabilities);
            driver.manage().deleteAllCookies();
            LoggerUtils.info("Chrome browser launched");
        }

        else if (browser.equalsIgnoreCase("firefox")){
            String geckoDriverPath =System.getProperty("user.dir") + "/src/main/resources/geckodriver";
            DesiredCapabilities capabilities; capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            capabilities.setCapability("browser.privatebrowsing.autostart", true);
            capabilities.setCapability("acceptInsecureCerts", true);
            System.setProperty("webdriver.firefox.profile","default");
            System.setProperty("webdriver.gecko.driver",geckoDriverPath);
            driver = new FirefoxDriver(capabilities);
            LoggerUtils.info("Firefox browser launched");
        }
        return driver;
    }

}
