package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class RegisterPage extends PageObject {

    @FindBy(css = "#reg_email")
    private WebElementFacade registerEmailField;

    @FindBy(css = "#reg_password")
    private WebElementFacade registerPasswordField;

    @FindBy(css = "[name=register]")
    private WebElementFacade registerButton;

    @FindBy(css = ".register")
    private WebElementFacade registerClass;

    public void setUsernameField(String username){
        typeInto(registerEmailField, username);
    }
    public void setPasswordField(String password) {
        typeInto(registerPasswordField, password);
    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }



}


