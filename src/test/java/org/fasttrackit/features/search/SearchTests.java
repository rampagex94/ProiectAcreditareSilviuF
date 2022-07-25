package org.fasttrackit.features.search;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class SearchTests extends BaseTest{

    @Test
    public void searchValidProduct() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Beanie");
        searchSteps.verifyProductSearchResults("Bfd");
    }

    @Test
    public void searchForAnInvalidProduct() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("Alien");
        searchSteps.noProductsFoundFromSearchResult();
    }

    @Test
    public void checkIfProductListIsRelevantToSearch(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("T-shirt");
        searchSteps.checkListForProduct("T-shirt");
    }

    @Test
    public void selectAProductFromSearchedList(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("T-shirt");
        searchSteps.selectProductFromList("New T-shirt");
    }



}
