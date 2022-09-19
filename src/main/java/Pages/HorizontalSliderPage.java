package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    WebDriver driver ;
    By slider = new By.ByTagName("input");
    By counter = new By.ById("range");

    public  HorizontalSliderPage(WebDriver driver){
        this.driver = driver ;

    }
    public void ClickOnRightArrow(Keys keys){
        driver.findElement(slider).sendKeys(keys.ARROW_RIGHT);

    }
    public String getCounter(){
        return driver.findElement(counter).getText();
    }

}
