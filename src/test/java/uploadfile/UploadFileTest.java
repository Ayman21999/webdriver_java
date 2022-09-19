package uploadfile;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTest extends BaseTest {

    @Test
    public void chooseFile(){
        var uploadfile = homePage.uploadFile();
        uploadfile.uploadFile("/home/ayman/eclipse-workspace/webdriver_java/resources/chromedriver");
//        uploadfile.clickUploadButton();
        assertEquals(uploadfile.getSuccessText(),"chromedriver","Upload Wrong File " );

    }
}
