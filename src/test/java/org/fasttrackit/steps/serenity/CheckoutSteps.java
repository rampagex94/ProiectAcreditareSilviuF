package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;
import org.fasttrackit.utils.CheckoutDetails;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;

    @Step
    public void fillInCheckoutFields() {
        checkoutPage.setBillingFirstNameField(CheckoutDetails.FNAME);
        checkoutPage.setBillingLastNameField(CheckoutDetails.LNAME);
        checkoutPage.setBillingCompany(CheckoutDetails.COMPANY);
        //checkoutPage.setBillingCountry();
        checkoutPage.setBillingAddress(CheckoutDetails.ADDRESS);
        checkoutPage.setBillingCity(CheckoutDetails.CITY);
        checkoutPage.setBillingState(CheckoutDetails.STATE);
        checkoutPage.setBillingPostcode(CheckoutDetails.POSTCODE);
        checkoutPage.setBillingPhone(CheckoutDetails.PHONE);
        checkoutPage.setBillingEmail(CheckoutDetails.EMAIL);
    }

    @Step
    public void orderComments(String text) {
        checkoutPage.setOrderComments(text);
    }
    @Step
    public void clickCheckoutMenuButton() {
        checkoutPage.clickCheckoutMenuButton();
    }
    @Step
    public void clickPlaceOrderButton() {
        checkoutPage.clickPlaceOrderButton();
    }
    @Step
    public void successfulOrderMsg(){
        checkoutPage.successfulOrderMsg();
    }

}
