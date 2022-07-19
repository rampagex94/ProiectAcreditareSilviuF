package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {

    @FindBy(css = "[name=add-to-cart]")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".input-text")
    private WebElementFacade productQuantityField;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade quantityAddedToCart;
    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdown;
    @FindBy(css ="option:nth-child(4)")
    private WebElementFacade sortPriceLowToHigh;

    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }
    public void changeProductQuantity(){
        clickOn(productQuantityField);
        productQuantityField.clear();
        productQuantityField.sendKeys("3");
    }
    public void sortProductsBy(){
        clickOn(sortByDropdown);
    }
    public void selectLowPriceToHighPrice(){
        sortProductsBy();clickOn(sortPriceLowToHigh);
    }


}
