package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class myAccountPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content p")
    private WebElementFacade successfulLoginText;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade unsuccessfulLoginText;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade noCredentialsLoginText;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successfullPassReset;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade accountAlreadyRegistered;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade noCredentialsRegisterError;

    public void verifySuccessfulLoginMessage(String username) {
        successfulLoginText.shouldContainOnlyText("Hello " + username + " (not " + username + "? Log out)");
    }
    public void verifyUnsuccessfulLoginMessage(String text) {
        unsuccessfulLoginText.shouldBeVisible();
    }
    public void verifyLoginWithoutCredentials(String text) {
        noCredentialsLoginText.shouldContainText(text);
    }
    public void verifySuccessfulPassReset(String text) {
        successfullPassReset.shouldContainText(text);
    }
    public void accountAlreadyRegistered() {
        accountAlreadyRegistered.shouldBeVisible();
    }
    public void noCredentialsRegisterError() {
        noCredentialsRegisterError.shouldBeVisible();
    }


}
