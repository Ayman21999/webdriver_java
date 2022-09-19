package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.Assert.assertTrue;

public class HoverPageTest extends BaseTest {

    @Test
    public void testHoverUser1(){
        var hoverpage = homePage.ClickHover();
        var caption  = hoverpage.hoverOverFigure(1);
        assertTrue(caption.isDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title is  incorrect");
        assertEquals(caption.getLinkText(),"View profile","Caption link ");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link is incorrect");
    }
}
