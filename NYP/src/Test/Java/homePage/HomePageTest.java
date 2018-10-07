package homePage;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    HomePage homePage;

    @BeforeMethod
    public void nevigate(){
        homePage = PageFactory.initElements(Base.ad, HomePage.class);
    }
    @Test
    public void welComePageClick(){
        homePage.clickOnWelComePage();
    }
    @Test
    public void breakingNewsSliderClick(){
        homePage.clickOnBreakingNewsSlider();
    }
    @Test
    public void chooseYourAlertPageContinueClick(){
        homePage.clickOnChooseYourAlertPageContinue();
    }
    @Test
    public void BreakingNewsPageLunch(){
        homePage.lunchOnBreakingNewsPage();
    }
}
