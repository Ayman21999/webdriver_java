package Keys;

import Pages.HomePage;
import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTest extends BaseTest {

    @Test
    public void  TestBackSpace(){
    var key = homePage.keyPressesPage();
    key.enterText("A"+Keys.ADD);
   assertEquals(key.getResult(),"You entered: ADD") ;
    }
}
