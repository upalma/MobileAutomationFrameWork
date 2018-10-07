package anroid;

import breakingNews.BreakingNews;
import common.Base;
import homePage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreakdingNewsTest extends BreakingNews {
    BreakingNews breakingNews;

    @BeforeMethod
    public void navigate() {
        BreakingNews breakingNews = PageFactory.initElements(Base.ad, BreakingNews.class);
    }
    @Test
    public void NewYorkPostLogoClick(){
        breakingNews.clickNewYorkPost();
    }
    @Test
    public void hamBurgerButtonClick(){
        breakingNews.clickOnHamBurger();
    }
    @Test
    public void notificationButtonClick(){
        breakingNews.clickOnNotification();
    }
    @Test
    public void firstBreakingNewsClicl(){
        breakingNews.clickOnFirstHeadLine();
    }
    public void secondBreakingNewsClick(){
        breakingNews.clickOnSecondHeadLine();
    }
}
