package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutWithAValidProduct(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("beanie");
        productSteps.selectProductFromList("Beanie");
        cartSteps.clickAddToCart();
        checkoutSteps.clickCheckoutMenuButton();
        checkoutSteps.fillInCheckoutFields();
        checkoutSteps.orderComments("Please deliver in time");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.successfulOrderMsg();
    }

    @Test
    public void checkoutWithoutAnyProduct(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        checkoutSteps.clickCheckoutMenuButton();
        checkoutSteps.emptyCartCantCheckoutMessage();
    }
}
