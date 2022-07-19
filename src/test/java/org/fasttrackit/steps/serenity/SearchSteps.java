package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void doSearch(String keyword) {
        homePage.openSearch();
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void verifyProductSearchResults(String productName){
        Assert.assertTrue(searchResultsPage.checkListForProduct(productName));
    }
    @Step
    public void noProductsFoundFromSearchResult(){
        searchResultsPage.noProductsFoundFromSearchResult();
    }
    @Step
    public void checkListForProduct(String productName) {
        searchResultsPage.checkListForProduct(productName);
    }
    @Step
    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);
    }





}
