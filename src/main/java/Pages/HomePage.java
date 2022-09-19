package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage ClickLoginButton() {
        ClickLinkText("Form Authentication");
        return new LoginPage(driver);
    }
    public HoverPage ClickHover(){
        ClickLinkText("Hovers");
        return  new HoverPage(driver);
    }

    public DropdownPage dropdownPage() {
        ClickLinkText("Dropdown");
        return new DropdownPage(driver);
    }

    public void ClickLinkText(String text) {
        driver.findElement(By.linkText(text)).click();

    }
    public HorizontalSliderPage horizontalSliderPage(){
        ClickLinkText("Horizontal Slider");
        return  new HorizontalSliderPage(driver);
    }
    public KeyPressesPage keyPressesPage(){
        ClickLinkText("Key Presses");
        return new KeyPressesPage(driver);
    }
    public AlertPage alertPage(){
        ClickLinkText("JavaScript Alerts");
        return  new AlertPage(driver);

    }
    public UploadFile uploadFile(){
        ClickLinkText("File Upload");
        return  new UploadFile(driver);

    }

    public ContextMenu contextMenu (){
        ClickLinkText("Context Menu");
        return  new ContextMenu(driver);
    }

    public WYSIWYG_Editor editor(){
        ClickLinkText("WYSIWYG Editor");
        return new WYSIWYG_Editor(driver);
    }
}
