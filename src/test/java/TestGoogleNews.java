
import Google.News.Pages.HomePage;
import Google.News.Pages.IndiaPage;
import Google.News.Pages.SportsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonUtils;
import utils.LoggerUtils;


import java.io.IOException;

public class TestGoogleNews extends BaseClass{



    @Test(priority = 0)
    public void testGoogleNewsHomePage() throws IOException {
        HomePage homePage = new HomePage(driver);
        CommonUtils.launchGoogleNewsPage(driver);
        String googleNewsHomePageTitle = driver.getTitle();
        boolean isheadlinesHeaderAvailable = homePage.getHeadlinesHeader().isDisplayed();
        Assert.assertEquals(googleNewsHomePageTitle,"Google News","browser is not redirected to the Google News page");
        Assert.assertEquals(isheadlinesHeaderAvailable,true,"Headlines header not visible");
    }

    @Test(priority = 1)
    public void testNavigationToIndiaNewsPageFromHomePage() throws IOException {
        HomePage homePage = new HomePage(driver);
        IndiaPage indiaPage = new IndiaPage(driver);
        CommonUtils.launchGoogleNewsPage(driver);
        homePage.switchToIndiaNews();
        boolean isSportsHeaderDisplayed=indiaPage.getSIndiaPageHeader().isDisplayed();
        Assert.assertEquals(isSportsHeaderDisplayed, true, "Sports header not dispalyed");
          }

    @Test(priority = 2)
    public void testNavigationToSportsNewsPageFromHomePage() throws IOException, InterruptedException {
        HomePage homePage=new HomePage(driver);
        SportsPage sportsPage=new SportsPage(driver);
        CommonUtils.launchGoogleNewsPage(driver);
        homePage.switchToSportsNews();
        boolean isSportsHeaderDisplayed=sportsPage.getSportsPageHeader().isDisplayed();
        Assert.assertEquals(isSportsHeaderDisplayed, true, "Sports header not dispalyed");
    }
}
