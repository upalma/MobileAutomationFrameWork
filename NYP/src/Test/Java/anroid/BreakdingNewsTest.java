package anroid;

import breakingNews.BreakingNews;
import common.Base;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreakdingNewsTest extends BreakingNews {
    HomePage homePage;
    BreakingNews breakingNews;
    @BeforeMethod
    public void navigate() {
        BreakingNews breakingNews = PageFactory.initElements(ad, BreakingNews.class);
        HomePage homePage = PageFactory.initElements(ad, HomePage.class);
    }
    @Test
    public void clickOnBreakingNews(){
        breakingNews.clickFirstHeadLine();
    }
//    @Test
//    public void clickOnFirstBreakingNews(){
//        homePage.clickOnFristBreakingNews();
//    }
}