package Google.News.Pages;/*
 *
 * created by himanshu on 08/10/20
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "//a[@title='News'][@id='sdgBod']")
    private static  WebElement homePageNewsButton;
    @FindBy(xpath = "//h2[text()='Headlines']")
    private static WebElement headlinesHeader;
    @FindBy(xpath = "//span[text()='India'][@class='ICsaqd']")
    private static WebElement indiaButton;
    @FindBy(xpath = "//span[text()='Sports'][@class='ICsaqd']")
    private static WebElement sportsButton;

    public static WebElement  getHomePageNewsButton(){return homePageNewsButton;}
    public static WebElement getHeadlinesHeader(){return headlinesHeader;}
    public static WebElement getIndiaButton(){return indiaButton;}
    public static WebElement getSportsButton(){return sportsButton;}


}
