package LoginTestPage;

import Pages.LoginPage;
import Pages.SaveAreaPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

    @Test
    public void  testSuccessLogin(){
        LoginPage loginPage = homePage.ClickLoginButton();
        loginPage.setusername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SaveAreaPage saveAreaPage = loginPage.ClickButton();
        assertTrue(saveAreaPage.SuccessAlertText()
                .contains("You logged into a secure area!")
                ,"Wrong Password or Email");
    }
}
