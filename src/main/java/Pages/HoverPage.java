package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverPage {
    WebDriver driver;
    By figureBox = new By.ByClassName("figure");
    By CaptionBxo = new By.ByClassName("figcaption");

    HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * @param index starts at 1
     */

    public CaptionFigure hoverOverFigure(int index) {
        WebElement figure = driver.findElements(figureBox).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new CaptionFigure(figure.findElement(CaptionBxo));
    }

    public class CaptionFigure {
        private WebElement caption;
        private By header = new By.ByTagName("h5");
        private By link = new By.ByTagName("a");

        CaptionFigure(WebElement caption) {
            this.caption = caption;
        }
        public boolean isDisplayed(){
            return caption.isDisplayed();
        }
        public String getTitle(){
           return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }


    }
}
