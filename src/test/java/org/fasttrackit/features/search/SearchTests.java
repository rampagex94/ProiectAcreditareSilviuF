package org.fasttrackit.features.search;
import org.junit.Test;

public class SearchTests extends BaseTest{

    @Test
    public void searchValidProductTest() {
        loginSteps.doLogin("johntravolta@yahoo.com", "Johntravolta1");
        searchSteps.doSearch("Beanie");
        searchSteps.verifyProductSearchResults("Beanie");
    }




}
