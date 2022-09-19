package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    By usernameFiled = By.id("username");
    By passwordFiled = By.id("password");
    By loginButton = new By.ByCssSelector("#login Button");


    LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setusername(String name) {
        driver.findElement(usernameFiled).sendKeys(name);
    }

    public void  setPassword(String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }
    public SaveAreaPage ClickButton(){
        driver.findElement(loginButton).click();
        return new SaveAreaPage(driver);
    }
}
