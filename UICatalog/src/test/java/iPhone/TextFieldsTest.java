package iPhone;

import ButtonsPage.Buttons;
import navigate.NavigateUi;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.Base.ad;

public class TextFieldsTest extends NavigateUi {

    TextFields textFields = new TextFields();

    @BeforeMethod
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTextFields();
        textFields = PageFactory.initElements(ad, TextFields.class);
    }
    @Test
    public void clickToUiTextField(){
        textFields.clickOnUiTextField();
    }
    @Test
    public void clickToUiTextFieldRounded(){
        textFields.clickOnUiTextFieldRounded();
    }
    @Test
    public void clickToUiTextFieldSecure(){
        textFields.clickOnUiTextFieldSecure();
    }
    @Test
    public void clickToUiTextFieldLeftView(){
        textFields.clickOnUiTextFieldLeftView();
    }
    @Test
    public void sendTextToUiTextField(){
        textFields.inputDataOnUiTextField();
    }
    @Test
    public void sendTextToUiTextFieldRounded(){
        textFields.inputDataOnUiTextFieldRounded();
    }
    @Test
    public void sendTextToUiTextFieldSecure(){
        textFields.inputDataOnUiTextFieldSecure();
    }
    @Test
    public void sendTextToUiTextFieldLeftView(){
        textFields.inputDataOnUiTextFieldLeftView();
    }
    @Test
    public void sendTextToAllField(){
        textFields.inputDataOnAllField();
    }
}