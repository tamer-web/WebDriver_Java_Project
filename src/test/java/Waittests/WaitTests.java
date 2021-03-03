package Waittests;

import base.BaseTests2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests2 {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
    @Test
    public void testWaitUntilVisible(){
        var loadingPage2 = homePage.clickDynamicLoading().clickExample2();
        loadingPage2.clickStart();
        assertEquals(loadingPage2.getLoadedText(),"Hello World!", "Loaded text incorrect");
    }
}