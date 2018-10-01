package breakingNews;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BreakingNews extends Base {
    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")
    WebElement alertPageShowSimple;
}
