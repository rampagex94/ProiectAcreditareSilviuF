package org.fasttrackit.pages;

import io.cucumber.java.mk_latn.No;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.error.ShouldBeTrue;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".content-area")
    private List<WebElementFacade> productList;
    @FindBy(css = ".content-area p")
    private WebElementFacade noProductsFoundMessage;
    @FindBy(css = ".wp-post-image")
    private WebElementFacade productImage;

    public boolean checkListForProduct(String productName) {
        for (WebElementFacade element : productList) {
            String name = element.findElement(By.cssSelector(".content-area h2")).getText();
            if (name.contains(productName)) {
              return true;
            }
        }
        return false;
    }

    public void selectProductFromList(String product) {
        for (WebElementFacade element : productList) {
            if (element.findElement(By.cssSelector(".content-area h2")).getText().equalsIgnoreCase(product)) {
               element.findElement(By.cssSelector(".content-area h2")).click();
                break;
            }
        }
    }

    public void noProductsFoundFromSearchResult() {
        String ExpectedMessage = noProductsFoundMessage.getText();
        String ActualMessage = "No products were found matching your selection.";
        Assert.assertEquals(ActualMessage, ExpectedMessage);
    }




}
