package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
   //Fields
    private final WebDriver driver;
    private final By enterEmail = By.id("email");
    private final By retrievePassword= By.id("form_submit");

    //Constructor
    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }

    //Methods
    public void setEnterEmail(String email){
        driver.findElement(enterEmail).sendKeys(email);
    }

    public FormSubmit retrieveButton(){
        driver.findElement(retrievePassword).click();
        return new FormSubmit(driver);
    }


}
