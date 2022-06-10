package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCart() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessfulAddToCart("\"Beanie with Logo\"");

    }
}


