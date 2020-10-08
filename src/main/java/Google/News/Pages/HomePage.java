package Google.News.Pages;/*
 *
 * created by himanshu on 08/10/20
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.LoggerUtils;

public class HomePage {

    public WebDriver driver;

    @FindBy(xpath = "//a[@title='News'][@id='sdgBod']")
    private WebElement homePageNewsButton;
    @FindBy(xpath = "//a[text()='Headlines']")
    private WebElement headlinesHeader;
    @FindBy(xpath = "//span[text()='India'][@class='ICsaqd']")
    private WebElement indiaButton;
    @FindBy(xpath = "//span[text()='Sports'][@class='ICsaqd']")
    private WebElement sportsButton;

    public HomePage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }


    public  WebElement  getHomePageNewsButton() {return homePageNewsButton;}
    public  WebElement getHeadlinesHeader() {return headlinesHeader;}
    public  WebElement getIndiaButton() {return indiaButton;}
    public  WebElement getSportsButton() {return sportsButton;}

    public  void switchToIndiaNews(){
        LoggerUtils.info("switching to India News Page");
        CommonUtils.implicitWait(driver, getIndiaButton(), 10);
        getIndiaButton().click();
    }

    public void switchToSportsNews(){
        LoggerUtils.info("switching to Sports News Page");
        CommonUtils.implicitWait(driver, getSportsButton(), 10);
        getSportsButton().click();
    }
}
