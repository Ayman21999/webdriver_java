package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private Select findDropdownElements() {
        return new Select(driver.findElement(dropdown));
    }

    public void selectFromDropdown(String option) {
        findDropdownElements().selectByVisibleText(option);
    }

    public List<String> getSelectedOption() {
        List<WebElement> selectedElement =
                findDropdownElements().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
