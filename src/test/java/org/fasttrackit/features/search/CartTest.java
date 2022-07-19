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
        cartSteps.verifySuccessfulAddToCartMessage("\"Beanie with Logo\"");
    }

    @Test
    public void removeProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.clickCartButton();
        cartSteps.removeFromCartButton();
        cartSteps.itemRemovedFromCartMessage();
    }

    @Test
    public void changeProductQuantityFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Album");
        productSteps.selectProductFromList("Album");
        cartSteps.clickAddToCart();
        cartSteps.clickCartButton();
        cartSteps.changeProductQuantity();
        cartSteps.cartUpdatedMessage();
    }




}


