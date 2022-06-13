package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTests extends BaseTest {

    @Test
    public void loginWithValidCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.clickLoginButton();
        loginSteps.verifySuccessfulLoginMessage("johntravolta");
    }
    @Test
    public void loginWithInvalidCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("alabala1234@yahoo.com", "pass123");
        loginSteps.clickLoginButton();
        loginSteps.verifyUnsuccessfulLoginMessage("ERROR");
    }
    @Test
    public void loginWithoutCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.clickLoginButton();
        loginSteps.verifyLoginWithoutCredentials("Error: Username is required.");
    }
    @Test
    public void forgotMyPassword() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.clickForgotPassword();
        loginSteps.setLostEmailField("johntravolta@yahoo.com");
        loginSteps.clickRecoverPasswordButton();
        loginSteps.verifySuccessfulPassResetMsg("Password reset email has been sent.");
    }




}
