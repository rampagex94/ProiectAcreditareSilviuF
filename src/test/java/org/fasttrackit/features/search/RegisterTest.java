package org.fasttrackit.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void verifyRegisterFieldsAreVisible(){
        loginSteps.goToMyAccount();
        registerSteps.verifyRegisterRequiredFields();
    }

    @Test
    public void verifyRegisterRequiredFieldsAreVisible(){
        loginSteps.goToMyAccount();
        registerSteps.verifyRegisterRequiredFieldsAreVisible();
    }

    @Test
    public void registerWithValidCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.setRegisterCredentials("hola1234@yahoo.com", "12345qwertASDFG@xx34325");
        registerSteps.clickRegisterButton();
        loginSteps.verifySuccessfulLoginMessage("hola1234");
    }

    @Test
    public void registerWithAlreadyUsedCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.setRegisterCredentials("hola123@yahoo.com", "12345qwertASDFG@xx34325");
        registerSteps.clickRegisterButton();
        registerSteps.accountAlreadyRegisteredMessage();
    }

    @Test
    public void registerWithoutCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.clickRegisterButton();
        registerSteps.verifyNoCredentialsRegistrationError();
    }

    @Test
    public void registerWithInvalidCredentials() {
        loginSteps.goToMyAccount();
        registerSteps.setRegisterCredentials("hello", "");
        registerSteps.clickRegisterButton();
        registerSteps.popUpAlertInvalidRegistrationEmail();
    }


}
