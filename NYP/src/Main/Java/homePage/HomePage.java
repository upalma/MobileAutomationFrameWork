package homePage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout\n")
    WebElement welComePage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.Switch")
    WebElement breakingNewsSlider;
    @FindBy(id = "br.com.golmobile.nypost:id/continue_customize") WebElement chooseYourAlertPageContinue;

    public void clickOnWelComePage(){
        welComePage.click();
    }
    public void clickOnBreakingNewsSlider(){
        breakingNewsSlider.click();
    }
    public void clickOnChooseYourAlertPageContinue(){
        chooseYourAlertPageContinue.click();
    }
    public void lunchOnBreakingNewsPage(){
        clickOnWelComePage();
        clickOnBreakingNewsSlider();
        clickOnChooseYourAlertPageContinue();
    }

}
