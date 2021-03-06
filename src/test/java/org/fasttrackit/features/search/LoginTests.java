package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

import static java.lang.System.exit;

public class LoginTests extends BaseTest {

    @Test
    public void verifyLogInFormIsVisible() {
        loginSteps.goToMyAccount();
        loginSteps.verifyLoginFormIsVisible();
    }

    @Test
    public void verifyLogInRequiredFieldsAreVisible() {
        loginSteps.goToMyAccount();
        loginSteps.verifyLogInRequiredFields();
    }

    @Test
    public void logInWithValidCredentials() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifySuccessfulLoginMessage("johntravolta");
    }

    @Test
    public void logInWithInvalidCredentials() {
        loginSteps.goToMyAccount();
        loginSteps.setCredentials("12345@yahoo.com", "kangaroo123");
        loginSteps.clickLoginButton();
        loginSteps.verifyUnsuccessfulLoginMessage("ERROR");
    }

    @Test
    public void logInWithoutCredentials() {
        loginSteps.goToMyAccount();
        loginSteps.clickLoginButton();
        loginSteps.verifyLogInWithoutCredentialsText("Error: Username is required.");
    }

    @Test
    public void resetAccountForgottenPassword() {
        loginSteps.goToMyAccount();
        loginSteps.clickForgotPassword();
        loginSteps.inputEmailForAccountPasswordReset("hola1234@yahoo.com");
        loginSteps.clickRecoverPasswordButton();
        loginSteps.verifySuccessfulPassResetMsg("Password reset email has been sent.");
    }

    @Test
    public void logInAndTickTheRememberMeCheckBox() {
        loginSteps.goToMyAccount();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.clickOnRememberMe();
        loginSteps.clickLoginButton();

    }
}

