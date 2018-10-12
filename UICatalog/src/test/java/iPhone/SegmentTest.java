package iPhone;

import SegmentsPage.Segments;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SegmentTest extends Base {
    Segments segments;

    @BeforeMethod
    public void navigate(){
        UiCatalog ui =PageFactory.initElements(ad, UiCatalog.class);
        ui.getSegments();
        segments = PageFactory.initElements(ad, Segments.class);
    }
    @Test
    public void uISegementedControlButtonClick(){
        segments.clickOnUISegementedControlButton();
    }
    @Test
    public void uISegementControlStyleBorderedClick(){
        segments.clickOnUISegementControlStyleBordered();
    }
    @Test
    public void cuISegementControlStyleBarClick(){
        segments.clickOnUISegementControlStyleBar();
    }
    @Test
    public void uISegementControlStyleBarTintClick(){
        segments.clickOnUISegementControlStyleBarTint();
    }
    @Test
    public void uISegementControlStyleBarImageClick(){
        segments.clickOnUISegementControlStyleBarImage();
    }
    @Test(priority = 1,enabled = true)
    public void SegmentedControlTest() throws InterruptedException {
        segments.setUiSegmentControl();
        sleep(2);
    }
    @Test(priority = 2,enabled = true)
    public void SegmentedStyleTest() throws InterruptedException {
        segments.setUiSegmentControlStyleBordered();
        sleep(2);
    }
    @Test(priority = 3,enabled = true)
    public void SegmentedControlBarTest() throws InterruptedException {
        segments.setUiSegmentControlStyleBar();
        sleep(2);
    }
    @Test(priority = 4,enabled = true)
    public void SegmentedControlTintTest() throws InterruptedException {
        segments.setUiSegmentControlStyleBarTint();
        sleep(2);
    }
    @Test(priority = 5,enabled = true)
    public void SegmentedControlImageTest() throws InterruptedException {
        segments.setUiSegmentcontrolStyleBarImage();
        sleep(2);
    }
}


