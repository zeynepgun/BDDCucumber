package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtils;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import static com.swaglabs.base.BasePage.driver;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage {

    @FindBy(xpath = "//div[@class='app_logo']")
    private static WebElement appLogo;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private static List<WebElement> items;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


     public static String verifyTitle(){
     return ElementUtils.doGetPageTitle();
 }

    public static boolean isLogoDisplayed(){
        return ElementUtils.doIsDisplayed(appLogo);
    }


    public static void clickItem(String itemName) {
        for (WebElement item : items) {
            if (item.getText().equals(itemName)) {
                ElementUtils.doClick(item);
                break;
            }
        }
    }
}
