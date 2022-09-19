package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
    WebDriver driver ;

    By boxId = new By.ById("hot-spot");


    public ContextMenu(WebDriver driver) {
        this.driver = driver;
    }
    public void rightClick(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(boxId);
//        driver.findElement(boxId);
        actions.contextClick(element).perform();
    }
    public void alert_Click (){
    driver.switchTo().alert().accept();
    }
}
