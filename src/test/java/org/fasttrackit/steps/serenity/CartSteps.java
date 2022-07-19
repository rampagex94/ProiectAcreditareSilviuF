package org.fasttrackit.steps.serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.*;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.myAccountPage;
import org.fasttrackit.utils.Constants;

public class CartSteps extends ScenarioSteps {

    private ProductPage productPage;
    private CartPage cartPage;
    private HomePage homePage;


    @Step
    public void clickAddToCart() {
        productPage.clickAddToCartButton();
    }
    @Step
    public void verifySuccessfulAddToCartMessage(String productName){
        cartPage.verifySuccessMessage(productName);
    }
    @Step
    public void clickCartButton(){
        homePage.goToCartButton();
    }
    @Step
    public void removeFromCartButton(){
        cartPage.removeFromCartButton();
    }
    @Step
    public void itemRemovedFromCartMessage(){
        cartPage.itemRemovedFromCartMessage();
    }
    @Step
    public void changeProductQuantity(){
        cartPage.productQuantityField();
        cartPage.updateCartButton();
    }
    @Step
    public void cartUpdatedMessage(){
        cartPage.cartUpdatedMessage();
    }





}
