package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SaveAreaPage {
    WebDriver driver ;
    By SuccessAlert = By.id("flash");

    SaveAreaPage(WebDriver driver ){
        this.driver = driver ;

    }

    public String SuccessAlertText(){
       String sucessText =  driver.findElement(SuccessAlert).getText();

       return sucessText;
    }
}
