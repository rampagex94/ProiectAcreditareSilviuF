package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class CartPage extends BasePage {

@FindBy(css = ".woocommerce-message")
    private WebElementFacade successfulAddToCart;
@FindBy(css =".cart_item .product-subtotal")
   private List<WebElementFacade> listOfProductsSubtotalSpan;

public void verifySuccessMessage(String productName){
    successfulAddToCart.containsText(productName + "has been added to your cart.");
}

public int getSubtotalPriceFromProducts(){
    int sum = 0;
    for (WebElementFacade element: listOfProductsSubtotalSpan){
       sum+=getPriceFromString(element.getText());
    }
    return sum;
}






}
