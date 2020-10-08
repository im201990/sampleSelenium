package Google.News.Pages;/*
 *
 * created by himanshu on 09/10/20
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsPage {
    public WebDriver driver;

    @FindBy(xpath = "//h2[text()='Sports']")
    private WebElement sportsPageHeader;

    public SportsPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getSportsPageHeader(){return sportsPageHeader;}



}
