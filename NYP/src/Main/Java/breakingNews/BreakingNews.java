package breakingNews;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BreakingNews extends Base {
    @FindBy(id = "br.com.golmobile.nypost:id/logo_header")
    WebElement newYorkPost;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\'Menu\']")
    WebElement hamBurger;
    @FindBy(id = "br.com.golmobile.nypost:id/turn_on_notifications_item")
    WebElement notification;
    @FindBy(id = "br.com.golmobile.nypost:id/headline_text_view")
    WebElement firstHeadLine;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    WebElement secondHeadLine;

    public void clickNewYorkPost(){
        newYorkPost.click();
    }
    public void clickOnHamBurger(){
        hamBurger.click();
    }
    public void clickOnNotification() {
        notification.click();
    }
    public void clickOnFirstHeadLine(){
        firstHeadLine.click();
    }
    public void clickOnSecondHeadLine() {
        secondHeadLine.click();
    }
}

