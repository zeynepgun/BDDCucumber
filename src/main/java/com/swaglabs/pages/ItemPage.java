package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.swaglabs.base.BasePage.driver;

public class ItemPage {

    @FindBy(xpath = "//button[text()='ADD TO CART']")
    private static WebElement addBtn;

    @FindBy(id = "shopping_cart_container")
    private static WebElement cartBtn;

    public ItemPage() {
    PageFactory.initElements(driver, this);
    }
    public static void clickAddToCart() {
    ElementUtils.doClick(addBtn);
    }

    public static void clickCartButton() {
    ElementUtils.doClick(cartBtn);
    }
}
