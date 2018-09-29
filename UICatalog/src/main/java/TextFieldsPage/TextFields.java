package TextFieldsPage;

import common.Base;

/**
 * Created by mrahman on 1/15/17.
 */
public class TextFields extends Base{

    public void typeOnUiTextField(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Normal\"]", "Architecture");
    }
    public void typeOnUiTextFieldRounded(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Rounded\"]", "Rounded");
    }
    public void typeOnUiTextFieldSecure(){
        typeByXpath("//XCUIElementTypeSecureTextField[@name=\"Secure\"]", "test123");
   }
    public void typeOnUiTextFieldLeftView(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Check\"]", "Secure");
    }

    public void writeTextToFields()throws InterruptedException{
        typeOnUiTextField();
        typeOnUiTextFieldRounded();
        typeOnUiTextFieldSecure();
        typeOnUiTextFieldLeftView();
    }
}
