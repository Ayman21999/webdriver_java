package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {
    WebDriver driver;

    By chooseFileButton = new By.ById("file-upload");
    By uploadButton = new By.ById("file-submit");
    By uploadText = new By.ById("uploaded-files");

    UploadFile(WebDriver driver) {
        this.driver = driver;

    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then clicks upload button
     *
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(chooseFileButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getSuccessText() {
        return driver.findElement(uploadText).getText();
    }
}
