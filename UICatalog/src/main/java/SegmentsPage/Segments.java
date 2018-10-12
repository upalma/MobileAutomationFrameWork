package SegmentsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Segments extends Base {
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]") WebElement uISegementedControlButton;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[2]") WebElement uISegementControlStyleBordered;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]") WebElement uISegementControlStyleBar;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]") WebElement uISegementControlStyleBarTint;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[5]") WebElement uISegementControlStyleBarImage;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]") WebElement uiSegmentedControlCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]") WebElement uiSegmentedControlSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]") WebElement uiSegmentedTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[2]") WebElement uiSegmentedControlStyleCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]") WebElement uiSegmentedControlStyleSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[2]") WebElement uiSegmentedControlStyleTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[3]") WebElement uiSegmentedControlStyleBarCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[3]") WebElement uiSegmentedControlStyleBarSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[3]") WebElement uiSegmentedControlStyleBarTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[4]") WebElement uiSegmentTintCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[4]") WebElement uiSegmentTintSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[4]") WebElement uiSegmentTintTools;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[5]") WebElement uiSegmentImageCheck;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[5]") WebElement uiSegmentImageSearch;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[5]") WebElement uiSegmentImageTools;


    public void clickOnUISegementedControlButton(){
        uISegementedControlButton.click();
    }
    public void clickOnUISegementControlStyleBordered(){
        uISegementControlStyleBordered.click();
    }
    public void clickOnUISegementControlStyleBar(){
        uISegementControlStyleBar.click();
    }
    public void clickOnUISegementControlStyleBarTint(){
        uISegementControlStyleBarTint.click();
    }
    public void clickOnUISegementControlStyleBarImage(){
        uISegementControlStyleBarImage.click();
    }
    public void setUiSegmentControl(){
        clickByXpathWebElement(uiSegmentedControlCheck);
        clickByXpathWebElement(uiSegmentedControlSearch);
        clickByXpathWebElement(uiSegmentedTools);
    }
    public void setUiSegmentControlStyleBordered(){
        clickByXpathWebElement(uiSegmentedControlStyleCheck);
        clickByXpathWebElement(uiSegmentedControlStyleSearch);
        clickByXpathWebElement(uiSegmentedControlStyleTools);
    }
    public void setUiSegmentControlStyleBar(){
        clickByXpathWebElement(uiSegmentedControlStyleBarCheck);
        clickByXpathWebElement(uiSegmentedControlStyleBarSearch);
        clickByXpathWebElement(uiSegmentedControlStyleBarTools);
    }
    public void setUiSegmentControlStyleBarTint(){
        clickByXpathWebElement(uiSegmentTintCheck);
        clickByXpathWebElement(uiSegmentTintSearch);
        clickByXpathWebElement(uiSegmentTintTools);
    }
    public void setUiSegmentcontrolStyleBarImage(){
        clickByXpathWebElement(uiSegmentImageCheck);
        clickByXpathWebElement(uiSegmentImageSearch);
        clickByXpathWebElement(uiSegmentImageTools);
    }

}
