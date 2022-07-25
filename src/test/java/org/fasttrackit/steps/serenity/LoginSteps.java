package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.myAccountPage;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private myAccountPage myAccountPage;

    @Step
    public void verifyLoginFormIsVisible(){
        Assert.assertTrue(myAccountPage.verifyLoginFormIsVisible());
    }
    @Step
    public void verifyLogInRequiredFields(){
        Assert.assertTrue(myAccountPage.verifyLogInRequiredFieldsAreVisible());
    }
    @Step
    public void navigateToHomePage() {
        homePage.open();
    }
    @Step
    public void navigateToMyAccount() {
        homePage.clickAccountLink();
    }
    @Step
    public void setCredentials(String email, String pass) {
        myAccountPage.setEmailField(email);
        myAccountPage.setLoginPasswordField(pass);
    }
    @Step
    public void clickLoginButton() {
        myAccountPage.clickLoginButton();
    }
    @Step
    public void verifySuccessfulLoginMessage(String username) {
        myAccountPage.verifySuccessfulLoginMessage(username);
    }
    @Step
    public void verifyUnsuccessfulLoginMessage(String text) {
        myAccountPage.verifyUnsuccessfulLoginMessage(text);
    }
    @Step
    public void verifyLogInWithoutCredentialsText(String text) {
        myAccountPage.verifyLoginWithoutCredentialsText(text);
    }
    @Step
    public void doLogin(String email, String password) {
        navigateToHomePage();
        navigateToMyAccount();
        setCredentials(email, password);
        clickLoginButton();
    }
    @Step
    public void clickForgotPassword() {
        myAccountPage.clickForgotPassword();
    }
    @Step
    public void inputEmailForAccountPasswordReset(String email) {
        myAccountPage.emailFieldForPasswordReset(email);
    }
    @Step
    public void clickRecoverPasswordButton() {
        myAccountPage.clickResetPasswordForAccountButton();
    }
    @Step
    public void verifySuccessfulPassResetMsg(String text) {
        myAccountPage.verifySuccessfulPassResetMessage(text);
    }
    @Step
    public void clickOnRememberMe(){
        myAccountPage.clickOnRememberMe();
    }
    @Step
    public void goToMyAccount(){
        navigateToHomePage();
        navigateToMyAccount();
    }


}

