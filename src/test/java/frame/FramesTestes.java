package frame;

import base.BaseTests2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTestes extends BaseTests2 {

    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();

        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
