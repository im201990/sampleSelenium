package Google.News.Pages;/*
 *
 * created by himanshu on 09/10/20
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndiaPage {

    public WebDriver driver;

    @FindBy(xpath = "//h2[text()='India']")
    private WebElement inidaPageHeader;

    public IndiaPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement getSIndiaPageHeader(){return inidaPageHeader;}

}
