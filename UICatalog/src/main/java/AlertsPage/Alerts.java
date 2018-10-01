package AlertsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Alerts extends Base{
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    WebElement alertPageShowSimple;
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    WebElement alertPageShowOkCancel;
    @FindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Show Customized\"]")
    WebElement alertPageShowCustomized;
    @FindBy (xpath = "(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")
    WebElement alertViewShowOkSimple;

    public void clickAlertPageShowSimple(){
        alertPageShowSimple.click();
    }
    public void clickAlertPageShowOkCancel(){
        alertPageShowOkCancel.click();
    }
    public void clickAlertPageShowCustomized(){
        alertPageShowCustomized.click();
    }
    public void clickAlertViewShowOkSimple(){
        alertViewShowOkSimple.click();
    }
}
