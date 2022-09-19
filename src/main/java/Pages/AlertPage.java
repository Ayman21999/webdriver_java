package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    WebDriver driver;
    By ButtonTrigger = new By.ByXPath(".//button[text()='Click for JS Alert']");
    By confirmButton  = new By.ByXPath(".//button[text()='Click for JS Confirm']");
    By filedButton = new By.ByXPath(".//button[text()='Click for JS Prompt']");
    By result = new By.ById("result");

    AlertPage(WebDriver driver) {
        this.driver = driver;

    }

    public void triggerAlert() {
        driver.findElement(ButtonTrigger).click();
    }
    public void triggerConfirmAlert(){
        driver.findElement(confirmButton).click();
    }
    public void alert_ClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void  alert_ClickToAccept() {
         driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void alert_ClickToPrompt(){
        driver.findElement(filedButton).click();
    }
    public void  setTextInFiled(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String alert_filedTest(){
        return driver.switchTo().alert().getText();
    }
}
