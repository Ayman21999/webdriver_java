package dropdown;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption() {
    var dropdown = homePage.dropdownPage();
    String op = "Option 2";
    dropdown.selectFromDropdown(op);
    var selectedOption = dropdown.getSelectedOption();

    assertEquals(selectedOption.size(),1,"Incorrect number  of selection ");
    assertTrue(selectedOption.contains(op),"Option not selected ");
        System.out.printf("Selected Item  :"+ op);
    }
}
