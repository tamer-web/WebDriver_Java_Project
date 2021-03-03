package fileupload;


import base.BaseTests2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests2 {

    @Test
    public void testFileUpload() {

        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\Tamer\\WebDriver_Java\\resources\\chromedriver.exe");

        assertEquals(uploadPage.getUpLoadedFiles(),
                "chromedriver.exe",
                "Uploaded files incorrect");
    }
}