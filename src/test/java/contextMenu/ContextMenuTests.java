package contextMenu;

import base.BaseTests2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests2 {
    @Test
    public void testRightClick(){
        var menuPage=homePage.clickContextMenuPage();
        menuPage.rightClickBox();

        String message=menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message,"You selected a context menu","PopUp Message Incorrect"
                );
    }
}
