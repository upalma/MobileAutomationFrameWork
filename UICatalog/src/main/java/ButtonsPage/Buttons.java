package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Buttons extends Base {
    @FindBy (xpath = "//XCUIElementTypeButton[@name=\"Gray\"]") WebElement backgroundImage;

    public void backgroundImageClick(){
        backgroundImage.click();
    }
}
