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
        checkoutSteps.fillInCheckoutFields("John","Doe","Java","lala1","Rome","Rome","123456","1234567890","john@yahho.com");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.successfulOrderMsg();
    }
}
