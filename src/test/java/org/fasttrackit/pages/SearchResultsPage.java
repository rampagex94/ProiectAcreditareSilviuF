package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".content-area")
    private List<WebElementFacade> productList;
    @FindBy(css = ".woocommerce-info")
    private WebElementFacade noProductsFoundMessage;

    public boolean checkListForProduct(String productName) {
        for (WebElementFacade element : productList) {
            String name = element.findElement(By.cssSelector(".content-area h2")).getText();
            if (name.contains(productName)) {
              return true;
            }
        }
        return false;
    }

    public void selectProductFromList(String product){
        for (WebElementFacade element : productList) {
            String name = element.findElement(By.cssSelector(".content-area h2")).getText();
            if (name.contains(product)) {
                element.findElement(By.cssSelector(".wp-post-image")).click();
                break;
            }
        }
    }

    public boolean noProductsFoundFromSearchResult() {
        if (noProductsFoundMessage.isDisplayed()) {
            Assert.assertTrue(true);
        }
         return false;
        }




}
