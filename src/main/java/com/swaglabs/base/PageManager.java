package com.swaglabs.base;

import com.swaglabs.pages.*;


public class PageManager {

    public static LoginPage loginPage;
    public static HomePage homePage;
    public static ItemPage itemPage;
    public static CartPage cartPage;
    public static CheckoutStepTwo checkoutStepTwo;
    public static CheckoutStepOne checkoutStepOne;
    public static void initializePageObjects(){

        loginPage = new LoginPage();
        homePage = new HomePage();
        itemPage = new ItemPage();
        cartPage = new CartPage();
        checkoutStepOne = new CheckoutStepOne();
        checkoutStepTwo = new CheckoutStepTwo();
    }
}
