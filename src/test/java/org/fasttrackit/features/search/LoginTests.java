package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

import static java.lang.System.exit;

public class LoginTests extends BaseTest {

    @Test
    public void loginLogoAndLoginFieldsVisible() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.verifyLoginForm();
    }

    @Test
    public void verifyLoginRequiredFields() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.verifyLoginRequiredFields();
    }

    @Test
    public void loginWithValidCredentials() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifySuccessfulLoginMessage("johntravolta");
    }

    @Test
    public void loginWithInvalidCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("12345@yahoo.com", "lalala123");
        loginSteps.clickLoginButton();
        loginSteps.verifyUnsuccessfulLoginMessage("ERROR");
    }

    @Test
    public void loginWithoutCredentials() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.clickLoginButton();
        loginSteps.verifyLoginWithoutCredentialsText("Error: Username is required.");
    }

    @Test
    public void forgotMyPassword() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.clickForgotPassword();
        loginSteps.inputEmailForAccountPasswordReset(Constants.LOST_EMAIL);
        loginSteps.clickRecoverPasswordButton();
        loginSteps.verifySuccessfulPassResetMsg("Password reset email has been sent.");
    }


}

