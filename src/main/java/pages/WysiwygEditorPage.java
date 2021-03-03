package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private final WebDriver driver;
    protected final String editorIframeId = "mce_0_ifr";
    private final By textArea = By.id("tinymce");

    private final By decreaseIndentButton = By.cssSelector("#mceu_12 button");

    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    //Method to clear the text area and we send a text
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
    }

   // Method to send text to the text area
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
   //Method to exit the iframe page and go back to the DOM Best Practice

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}