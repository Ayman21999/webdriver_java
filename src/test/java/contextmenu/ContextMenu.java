package contextmenu;

import base.BaseTest;
import org.testng.annotations.Test;

public class ContextMenu extends BaseTest {

    @Test
    public void  ContextMenuTest (){
        var contextTest = homePage.contextMenu();
        contextTest.rightClick();

    }
}
