package forgotpassword;

import base.BaseTests2;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.FormSubmit;

import static org.testng.Assert.assertTrue;


public class ForgotPasswordTests extends BaseTests2 {

    @Test
    protected void testSuccessfulForgotPassword(){
        ForgotPasswordPage forgotPasswordPage=homePage.clickForgotPassword();
        forgotPasswordPage.setEnterEmail("tom@example.com");
        FormSubmit formSubmit=forgotPasswordPage.retrieveButton();
        assertTrue(formSubmit.getAlertText().contains("Your e-mail's been sent!"),"Alert text is incorrect");
    }

}
