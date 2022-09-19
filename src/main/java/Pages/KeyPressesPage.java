package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    WebDriver driver;
    private By inputFiled = new By.ById("target");
    private By textResult = new By.ById("result");

    KeyPressesPage(WebDriver driver) {
        this.driver = driver;

    }

    public void enterText(String text) {
        driver.findElement(inputFiled).sendKeys(text);

    }

    public String getResult() {
    return driver.findElement(textResult).getText();
    }


}
