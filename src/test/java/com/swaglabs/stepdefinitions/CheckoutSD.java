package com.swaglabs.stepdefinitions;

import com.swaglabs.base.ConfigReader;
import com.swaglabs.pages.HomePage;
import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ItemPage;
import com.swaglabs.pages.CartPage;
import com.swaglabs.pages.CheckoutStepOne;
import com.swaglabs.pages.CheckoutStepTwo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSD {
    @Given("^user is logged in the shopping area$")
    public void verifyUserIsLoggedIn(){
    LoginPage.enterUserName(ConfigReader.getProperty("username"));
    LoginPage.enterPassword(ConfigReader.getProperty("password"));
    LoginPage.clickLoginButton();
    String actualTitle = HomePage.verifyTitle();
    Assert.assertEquals("Swag Labs", actualTitle);
    Assert.assertTrue(HomePage.isLogoDisplayed());
}


    @When("user clicks on item with name {string}")
    public void userClicksOnItemWithName(String itemName) {
        HomePage.clickItem(itemName);
    }

    @And("user clicks on the add to cart button")
    public void userClicksOnTheAddToCartButton() {
        ItemPage.clickAddToCart();
    }

    @And("user clicks on the shopping cart button")
    public void userClicksOnTheShoppingCartButton() {
        ItemPage.clickCartButton();
    }

    @And("user clicks on the checkout button")
    public void userClicksOnTheCheckoutButton() {
        CartPage.clickCheckout();
    }


    @And("user enters the order information as {string}, {string}, and {string}")
    public void userEntersTheOrderInformationAsAnd(String firstName, String lastName, String zipCode) {
        CheckoutStepOne.sendOrderInformation(firstName, lastName, zipCode);
    }

    @And("user clicks on the continue button")
    public void userClicksOnTheContinueButton() {
        CheckoutStepOne.clickContinue();
    }


    @Then("user sees the item name matches that of the {string}")

    public void userSeesTheItemNameMatchesThatOfThe(String itemName) {

        Assert.assertEquals(itemName, CheckoutStepTwo.getItemName());

    }
}
