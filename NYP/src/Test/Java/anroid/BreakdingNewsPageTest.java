package anroid;

import breakingNewsPage.BreakingNewsPage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BreakdingNewsPageTest extends BreakingNewsPage {
    BreakingNewsPage breakingNews;

    @BeforeMethod
    public void navigate() {
        BreakingNewsPage breakingNews = PageFactory.initElements(Base.ad, BreakingNewsPage.class);
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
    @Test
    public void sportsTest() throws InterruptedException {
        breakingNews.setSports();
    }
    @Test
    public void pageSixTest() throws InterruptedException{
        breakingNews.setPageSix();
    }
    @Test
    public void businessTest()throws InterruptedException{
        breakingNews.setBusiness();
    }
    @Test
    public void entertainmentTest() throws InterruptedException{
        breakingNews.setEntertainment();
    }
    @Test
    public void opinionTest() throws InterruptedException{
        breakingNews.setOpinion();
    }
    @Test
    public void menuTest(){
        breakingNews.clickMenu();
    }
    @Test
    public void livingTest() throws InterruptedException{
        breakingNews.setLiving();
    }

    @Test(priority = 2, enabled = false)
    public void menuSearchBoxTest() throws InterruptedException {
        breakingNews.setMenuSearchBox();
    }
    @Test(priority = 1, enabled = false)
    public void topNewsTest(){
        breakingNews.setTopNews();
    }
    @Test(priority = 0, enabled = true)
    public void menuNewsTest() throws InterruptedException {
        breakingNews.setMenuNews();
    }
    @Test(priority = 3, enabled = false)
    public void notificationTest(){
        breakingNews.setNotifications();
    }
    @Test(priority = 4, enabled = false)
    public void signUpTest() throws InterruptedException {
        breakingNews.setSignUp();
    }
    @Test
    public void sportsNewsTest() throws InterruptedException{
        breakingNews.setSportsLastestNews();
    }
    @Test
    public void photoTest()throws InterruptedException{
        breakingNews.setPhotos();
    }
    @Test
    public void photo1Test() throws InterruptedException{
        breakingNews.setPhotos1();
    }
    @Test
    public void photo2Test() throws InterruptedException{
        breakingNews.setPhoto2();
    }
}
