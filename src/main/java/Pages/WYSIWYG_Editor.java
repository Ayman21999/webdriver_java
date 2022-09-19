package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYG_Editor {

    WebDriver driver;
    private String editorTextID = "mce_0_ifr";
    By textAreaId = new By.ById("tinymce");

    By button = new By.ByXPath("//button[@title='Increase indent']");

    WYSIWYG_Editor(WebDriver driver) {
        this.driver = driver;
    }

    public void clearEditorArea() {
        SwitchToEditorArea();
        driver.findElement(textAreaId).clear();
        SwitchToParentFrame();
    }

    public void setEditorText(String text) {
        SwitchToEditorArea();
        driver.findElement(textAreaId).sendKeys(text);
        SwitchToParentFrame();

    }

    public void ClickSpaceButton() {
        driver.findElement(button).click();
    }

    private void SwitchToEditorArea() {
        driver.switchTo().frame(editorTextID);
    }

    public String getEditorText() {
        SwitchToEditorArea();
        String text = driver.findElement(textAreaId).getText();
        SwitchToParentFrame();
        return text;
    }

    private void SwitchToParentFrame() {
        driver.switchTo().parentFrame();
    }
}
