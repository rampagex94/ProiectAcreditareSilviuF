package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class myAccountPage extends PageObject {

    @FindBy(css =".woocommerce-MyAccount-content p")
    private WebElementFacade successfulLoginText;

    @FindBy(css =".woocommerce-error")
    private WebElementFacade unsuccessfulLoginText;

    @FindBy(css =".woocommerce-error")
    private WebElementFacade noCredentialsLoginText;

    @FindBy(css =".woocommerce-message")
    private WebElementFacade successfullPassReset;

    public void verifySuccessfulLoginMessage(String username) {
     successfulLoginText.shouldContainOnlyText("Hello " +username+ " (not " +username+ "? Log out)");
    }
    public void verifyUnsuccessfulLoginMessage(String text) {
        unsuccessfulLoginText.shouldContainText(text);
    }
    public void verifyLoginWithoutCredentials(String text){
        noCredentialsLoginText.shouldContainText(text);
    }
    public void verifySuccessfulPassReset(String text){
        successfullPassReset.shouldContainText(text);
    }









}
