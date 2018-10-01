package iPhone;

import AlertsPage.Alerts;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AlertsTest extends Base {
    Alerts alerts;
    @BeforeMethod
    public void navigate(){
        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
        uiCatalog.getAlerts();
        alerts = PageFactory.initElements(ad,Alerts.class);
    }
    @Test
    public void clickOnAlertPageShowSimple(){
        alerts.clickAlertPageShowSimple();
    }
    @Test
    public void clickOnAlertPageShowOkCancel(){
        alerts.clickAlertPageShowOkCancel();
    }
    @Test
    public void clickOnAlertPageShowCustomized(){
        alerts.clickAlertPageShowCustomized();
    }
    @Test
    public void clickOnAlertViewShowOkSimple(){
        alerts.clickAlertViewShowOkSimple();
    }
}
