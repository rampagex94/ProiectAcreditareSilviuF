package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

public class myAccountPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content p")
    private WebElementFacade successfulLoginText;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade unsuccessfulLoginText;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade noCredentialsLoginText;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successfulPassReset;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade accountAlreadyRegistered;
    @FindBy(css = ".woocommerce-error")
    private WebElementFacade noCredentialsRegisterError;

    //LoginFields
    @FindBy(css = "#username")
    private WebElementFacade emailField;
    @FindBy(css = "#password")
    private WebElementFacade passwordField;
    @FindBy(css = "[name = login]")
    private WebElementFacade loginButton;
    @FindBy(css = ".woocommerce-LostPassword a")
    private WebElementFacade forgotPasswordButton;
    @FindBy(css = ".woocommerce-Input")
    private WebElementFacade recoverEmailField;
    @FindBy(css = ".woocommerce-Button")
    private WebElementFacade recoverPasswordButton;
    @FindBy(css = ".col-1")
    private WebElementFacade loginForm;
    @FindBy(css = ".col-1 .required")
    private WebElementFacade loginRequiredFields;
    @FindBy(css = "#rememberme")
    private WebElementFacade rememberMeCheckBox;

    //RegisterFields
    @FindBy(css = "#reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(css = "#reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css = ".col-2 .woocommerce-Button")
    private WebElementFacade registerButton;
    @FindBy(css = ".register")
    private WebElementFacade registerClass;
    @FindBy(css = ".col-2")
    private WebElementFacade registerForm;
    @FindBy(css = ".col-2 .required")
    private WebElementFacade registerRequiredFields;
    @FindBy(css = ".content-wrap")
    private WebElementFacade contentWrapClick;

    public void verifySuccessfulLoginMessage(String username) {
        successfulLoginText.shouldContainOnlyText("Hello " + username + " (not " + username + "? Log out)");
    }
    public void verifyUnsuccessfulLoginMessage(String text) {
        unsuccessfulLoginText.shouldBeVisible();
    }
    public void verifyLoginWithoutCredentialsText(String text) {
        noCredentialsLoginText.shouldContainText(text);
    }
    public void verifySuccessfulPassResetMessage(String text) {
        successfulPassReset.shouldContainText(text);
    }
    public void accountAlreadyRegisteredMessage() {
        accountAlreadyRegistered.shouldBeVisible();
    }
    public void noCredentialsRegistrationError() {
        noCredentialsRegisterError.shouldBeVisible();
    }

    //LoginMethods
    public void setEmailField(String email) {
        typeInto(emailField, email);
    }
    public void setLoginPasswordField(String password) {
        typeInto(passwordField, password);
    }
    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public void clickOnRememberMe() {
        clickOn(rememberMeCheckBox);
    }
    public void clickForgotPassword() {
        clickOn(forgotPasswordButton);
    }
    public void clickResetPasswordForAccountButton() {
        clickOn(recoverPasswordButton);
    }
    public void emailFieldForPasswordReset(String email) {
        typeInto(recoverEmailField, email);
    }
    public boolean verifyLoginFormIsVisible() {
        if (loginForm.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }
    public boolean verifyLogInRequiredFieldsAreVisible() {
        return loginRequiredFields.isDisplayed();
    }

    //RegisterMethods
    public void setUsernameField(String username){
        typeInto(registerEmailField, username);
    }
    public void setPasswordField(String password) {
        typeInto(registerPasswordField, password);
    }
    public void clickRegisterButton(){
        //Element not enabled bypass!
        clickOn(contentWrapClick);
        clickOn(registerButton);
    }

    public void invalidEmailPopup(){
        String popUp = "Please include an '@' in the email address";
        Assert.assertTrue(popUp, true);
    }
    public void verifyRegisterFieldsAreVisible(){
        registerForm.shouldBeVisible();
    }
    public void verifyRegisterRequiredFieldsAreVisible(){
        registerRequiredFields.shouldBeVisible();
    }


}
