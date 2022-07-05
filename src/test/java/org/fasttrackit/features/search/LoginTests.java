package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

import static java.lang.System.exit;

public class LoginTests extends BaseTest {

    @Test
    public void loginLogoAndFieldsVisible() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.verifyLoginForm();
    }

    @Test
    public void verifyRequiredFields() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.verifyRequiredFields();
    }

    @Test
    public void verifyRememberMeCheckBox() {
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.clickOnRememberMe();
        webDriver.close();
        loginSteps.navigateToHomePage();
        loginSteps.navigateToLogin();
        loginSteps.verifyRememberMeCheckBox();
    }

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
        loginSteps.setCredentials("12345@yahoo.com", "lalala123");
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
        loginSteps.setLostEmailField(Constants.LOST_EMAIL);
        loginSteps.clickRecoverPasswordButton();
        loginSteps.verifySuccessfulPassResetMsg("Password reset email has been sent.");
    }


}

