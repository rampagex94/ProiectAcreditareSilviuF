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
@FindBy(css = ".remove")
   private WebElementFacade removeFromCartButton;
@FindBy(css = ".woocommerce-message")
   private WebElementFacade itemRemovedFromCartMessage;
@FindBy(css = ".input-text")
   private WebElementFacade productQuantityField;
@FindBy(css = "[name=\"update_cart\"]")
   private WebElementFacade updateCartButton;
@FindBy(css = ".woocommerce-message")
   private WebElementFacade cartUpdated;
@FindBy(css = ".checkout-button")
   private WebElementFacade proceedToCheckoutButton;

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

public void removeFromCartButton(){
    clickOn(removeFromCartButton);
}

public void itemRemovedFromCartMessage(){
    itemRemovedFromCartMessage.shouldContainText("removed. Undo?");
}

public void productQuantityField(){
    clickOn(productQuantityField);
    productQuantityField.clear();
    productQuantityField.sendKeys("5");
}

public void updateCartButton(){
    clickOn(updateCartButton);
}

public void cartUpdatedMessage(){
    cartUpdated.isDisplayed();
}

public void proceedToCheckoutButton(){
    clickOn(proceedToCheckoutButton);
}








}
