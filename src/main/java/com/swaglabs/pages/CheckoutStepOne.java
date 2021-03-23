package com.swaglabs.pages;

import static com.swaglabs.base.BasePage.driver;

import com.swaglabs.utils.ElementUtils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutStepOne {

    @FindBy(id="first-name")
    private static WebElement firstName;

    @FindBy(id="last-name")
    private static WebElement lastName;

    @FindBy(id="postal-code")
    private static WebElement postalCode;

    @FindBy(xpath="//input[@value='CONTINUE']")
    private static WebElement continueBtn;

    public CheckoutStepOne(){
        PageFactory.initElements(driver,this);
    }

    public static void sendOrderInformation(String name, String lName, String zipCode) {
        ElementUtils.doSendText(firstName, name);
        ElementUtils.doSendText(lastName, lName);
        ElementUtils.doSendText(postalCode, zipCode);
    }

    public static void clickContinue() {
        ElementUtils.doClick(continueBtn);
    }


}
