package javasript;


import base.BaseTests2;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests2 {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
}