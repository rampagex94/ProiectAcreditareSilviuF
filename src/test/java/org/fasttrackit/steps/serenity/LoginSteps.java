package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.myAccountPage;

public class LoginSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private myAccountPage myAccountPage;

    @Step
    public void navigateToHomePage() {
        homePage.open();
    }

    @Step
    public void navigateToLogin(){
        homePage.clickAccountLink();
    }

    @Step
    public void setCredentials(String email, String pass){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifySuccessfulLoginMessage(String username){
        myAccountPage.verifySuccessfulLoginMessage(username);
    }

}
