package jsAlret;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JsAlertTest extends BaseTest {

    @Test
    public void alertTest(){
        var alert = homePage.alertPage();
        alert.triggerAlert();
        alert.alert_ClickToAccept();
        assertEquals(alert.getResult() , "You successfully clicked an alert","Result text incorrect");
    }

    @Test
    public void getAlertText(){
        var alert_text = homePage.alertPage();
        alert_text.triggerConfirmAlert();
        String text = alert_text.alert_getText();
        assertEquals(text,"I am a JS Confirm","incorrect Test");
    }

    @Test
    public void alertPromptText(){
        var alert = homePage.alertPage();
        alert.alert_ClickToPrompt();
        String txt = "ayman";
        alert.setTextInFiled(txt);
        alert.alert_ClickToAccept();
        assertEquals(alert.getResult(),"You entered: "+txt,"Incorrect Message");
    }
}
