package wysiwygEditor;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WYSIWYGEditorTest extends BaseTest {
    String text = "Hello";
    String text2 = " World";
    @Test
    public void EditorTest(){
        var editor =homePage.editor();
        editor.clearEditorArea();
        editor.setEditorText(text);
        editor.ClickSpaceButton();
        editor.setEditorText(text2);
        assertEquals(editor.getEditorText(),text+text2 ,"Wrong Word"    );


    }
}
