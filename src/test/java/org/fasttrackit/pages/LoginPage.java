package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

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
    @FindBy(css = ".required")
    private WebElementFacade requiredFields;
    @FindBy(css = "#rememberme")
    private WebElementFacade rememberMeCheckBox;

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }
    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }
    public void clickLoginButton() {
        clickOn(loginButton);
    }
    public void clickForgotPassword() {
        clickOn(forgotPasswordButton);
    }
    public void recoverEmailField(String email) {
        typeInto(recoverEmailField, email);
    }
    public void clickRecoverPasswordButton() {
        clickOn(recoverPasswordButton);
    }
    public void verifyLoginForm(){
        loginForm.shouldBeVisible();
    }
    public void verifyRequiredFields(){
        requiredFields.shouldBeVisible();
    }
    public void clickOnRememberMe(){
        clickOn(rememberMeCheckBox);
    }


}

