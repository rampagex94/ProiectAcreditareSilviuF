package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.*;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;

    @Step
    public void fillInCheckoutFields(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        checkoutPage.setBillingFirstNameField(a);
        checkoutPage.setBillingLastNameField(b);
        checkoutPage.setBillingCompany(c);
        checkoutPage.setBillingCountry();
        checkoutPage.setBillingAddress(d);
        checkoutPage.setBillingCity(e);
        checkoutPage.setBillingState(f);
        checkoutPage.setBillingPostcode(g);
        checkoutPage.setBillingPhone(h);
        checkoutPage.setBillingEmail(i);
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
