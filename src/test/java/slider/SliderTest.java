package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SliderTest extends BaseTest {
    int sliderCounter= 0;
    String sliderText;

    @Test
    public void counter(){
        var counter = homePage.horizontalSliderPage();
        while (sliderCounter != 8){
            counter.ClickOnRightArrow(Keys.ARROW_RIGHT);
            sliderCounter++;

        }
        sliderText = counter.getCounter();
        assertEquals(sliderText,"4","wrong number");
        System.out.println(sliderCounter);
    }

}
