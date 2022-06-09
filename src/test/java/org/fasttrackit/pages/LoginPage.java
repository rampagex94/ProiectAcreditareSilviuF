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

public void setEmailField(String email){
    typeInto(emailField, email);
}
public void setPasswordField(String password){
    typeInto(passwordField, password);
}
public void clickLoginButton(){
    clickOn(loginButton);
}



}

