package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class ProductTest extends BaseTest{

    @Test
    public void changeProductQuantity(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        productSteps.selectProductFromList("Beanie with Logo");
        productSteps.changeProductQuantity();
    }

    @Test
    public void sortProductsByAscendantPrice(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        productSteps.goToShop();
        productSteps.sortProductsLowPriceToHigh();
    }


}
