package org.fasttrackit.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class SearchTests extends BaseTest{

    @Test
    public void searchValidProductTest() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        searchSteps.verifyProductSearchResults("Beanie");
    }

    @Test
    public void searchForAnInvalidProduct() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        searchSteps.noProductsFoundFromSearchResult();
    }




}
