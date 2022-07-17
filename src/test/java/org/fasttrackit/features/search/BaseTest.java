package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.*;
import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    //protected ~ can only be accessed within its own package
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected ProductSteps productSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected RegisterSteps registerSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;


    @After
    public void closeDriver(){
        wait(2000);
        webDriver.close();
    }

    public static void wait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}