package horizontalslider;


import base.BaseTests2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests2 {

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}