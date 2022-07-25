package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.myAccountPage;

public class RegisterSteps extends ScenarioSteps {

    private HomePage homePage;
    private myAccountPage myAccountPage;

    @Step
    public void setRegisterCredentials(String email, String pass) {
        myAccountPage.setUsernameField(email);
        myAccountPage.setPasswordField(pass);
    }
    @Step
    public void clickRegisterButton(){
        myAccountPage.clickRegisterButton();
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
    public void verifyPopUpForInvalidEmail(){
        myAccountPage.invalidEmailPopup();
    }
    @Step
    public void verifyRegisterRequiredFields(){
        myAccountPage.verifyRegisterFieldsAreVisible();
    }
    @Step
    public void verifyRegisterRequiredFieldsAreVisible(){
        myAccountPage.verifyRegisterRequiredFieldsAreVisible();
    }



}




