package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CartPage extends PageObject {

@FindBy(css = ".woocommerce-message")
    private WebElementFacade successfulAddToCart;

public void verifySuccessMessage(String productName){
    successfulAddToCart.containsText(productName + "has been added to your cart.");
}
}
