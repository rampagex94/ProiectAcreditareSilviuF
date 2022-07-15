package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;
import org.fasttrackit.pages.myAccountPage;
import org.junit.Test;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private myAccountPage myAccountPage;
    private RegisterPage registerPage;

    @Step
    public void setRegisterCredentials(String email, String pass) {
        registerPage.setUsernameField(email);
        registerPage.setPasswordField(pass);
    }
    @Step
    public void clickRegisterButton(){
        registerPage.clickRegisterButton();
    }
    @Step
    public void accountAlreadyRegisteredMessage(){
        myAccountPage.accountAlreadyRegisteredMessage();
    }
    @Step
    public void verifyNoCredentialsRegistrationError(){
        myAccountPage.noCredentialsRegistrationError();
    }
    @Step
    public void popUpAlertInvalidRegistrationEmail(){
        registerPage.invalidEmailPopup();
    }
    @Step
    public void verifyRegisterRequiredFields(){
        registerPage.verifyRegisterFieldsAreVisible();
    }
    @Step
    public void verifyRegisterRequiredFieldsAreVisible(){
        registerPage.verifyRegisterRequiredFieldsAreVisible();
    }



}




