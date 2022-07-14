package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

import static java.lang.System.exit;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLogInFieldsAreVisible() {
        loginSteps.goToLoginPage();
        loginSteps.verifyLoginForm();
    }

    @Test
    public void verifyLogInRequiredFields() {
        loginSteps.goToLoginPage();
        loginSteps.verifyLoginRequiredFields();
    }

    @Test
    public void logInWithValidCredentials() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifySuccessfulLoginMessage("johntravolta");
    }

    @Test
    public void logInWithInvalidCredentials() {
        loginSteps.goToLoginPage();
        loginSteps.setCredentials("12345@yahoo.com", "lalala123");
        loginSteps.clickLoginButton();
        loginSteps.verifyUnsuccessfulLoginMessage("ERROR");
    }

    @Test
    public void logInWithoutCredentials() {
        loginSteps.goToLoginPage();
        loginSteps.clickLoginButton();
        loginSteps.verifyLogInWithoutCredentialsText("Error: Username is required.");
    }

    @Test
    public void resetAccountForgottenPassword() {
        loginSteps.goToLoginPage();
        loginSteps.clickForgotPassword();
        loginSteps.inputEmailForAccountPasswordReset(Constants.LOST_EMAIL);
        loginSteps.clickRecoverPasswordButton();
        loginSteps.verifySuccessfulPassResetMsg("Password reset email has been sent.");
    }

    @Test
    public void logInAndTickTheRememberMeCheckBox() {
        loginSteps.goToLoginPage();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.clickOnRememberMe();
        loginSteps.clickLoginButton();

    }
}

