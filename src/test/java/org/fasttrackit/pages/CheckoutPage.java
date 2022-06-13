package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends PageObject {

    @FindBy(css = "#menu-item-125")
    private WebElementFacade checkoutMenuButton;

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(css = "#billing_company")
    private WebElementFacade billingCompanyField;

    @FindBy(css = "#select2-billing_country-container")
    private WebElementFacade billingCountry;

    @FindBy(css = "#billingaddress_1")
    private WebElementFacade billingAddress;

    @FindBy(css = "#billing_city")
    private WebElementFacade billingCity;

    @FindBy(css = "#billing_state")
    private WebElementFacade billingState;

    @FindBy(css = "#billing_postcode")
    private WebElementFacade billingPostcode;

    @FindBy(css = "#billing_phone")
    private WebElementFacade billingPhone;

    @FindBy(css = "#billing_email")
    private WebElementFacade billingEmail;

    @FindBy(css = "#place_order")
    private WebElementFacade placeOrderButton;

    @FindBy(css = "#order_comments")
    private WebElementFacade orderComments;

    @FindBy(css = "#post-119")
    private WebElementFacade successfulOrder;

    public void clickCheckoutMenuButton() {
        clickOn(checkoutMenuButton);
    }
    public void setBillingFirstNameField(String name) {
        typeInto(firstNameField, name);
    }
    public void setBillingLastNameField(String name) {
        typeInto(lastNameField, name);
    }
    public void setBillingCompany(String name) {
        typeInto(billingCompanyField, name);
    }
    public void setBillingCountry() {
        clickOn(billingCountry);
    }
    public void setBillingAddress(String name) {
        typeInto(billingAddress, name);
    }
    public void setBillingCity(String name) {
        typeInto(billingCity, name);
    }
    public void setBillingState(String name) {
        typeInto(billingState, name);
    }
    public void setBillingPostcode(String number) {
        typeInto(billingPostcode, number);
    }
    public void setBillingPhone(String number) {
        typeInto(billingPhone, number);
    }
    public void setBillingEmail(String email) {
        typeInto(billingEmail, email);
    }
    public void clickPlaceOrderButton() {
        clickOn(placeOrderButton);
    }
    public void setOrderComments(String text) {
        typeInto(orderComments, text);
    }
    public void successfulOrderMsg() {
        successfulOrder.shouldBeVisible();
    }

}
