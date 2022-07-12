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
    public void accountAlreadyRegisteredMsg(){
        myAccountPage.accountAlreadyRegistered();
    }
    @Step
    public void verifyNoCredentialsRegistrationError(){
        myAccountPage.noCredentialsRegisterError();
    }
    @Step
    public void popUpAlertInvalidRegistrationEmail(){
        registerPage.invalidEmailPopup();
    }




}




