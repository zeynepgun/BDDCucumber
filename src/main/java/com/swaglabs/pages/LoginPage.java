package com.swaglabs.pages;

import static com.swaglabs.base.BasePage.driver;

import com.swaglabs.utils.ElementUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //locators using FindBy
    @FindBy(id="user-name")
    private static WebElement username;

    @FindBy(id="password")
    private static WebElement password;

    @FindBy(id="login-button")
    private static WebElement loginBtn;

    @FindBy(xpath="//h3[@data-test='error']")
    private static WebElement errorMsg;
    //Constructor
    public LoginPage(){

        PageFactory.initElements(driver,this);
    }

    //Page Actions
    public static String verifyTitle(){

        return ElementUtils.doGetPageTitle();
    }


    public static void enterUserName(String user){

        ElementUtils.doSendText(username, user);
    }

    public static void enterPassword(String pwd){

        ElementUtils.doSendText(password, pwd );
    }


    public static void clickLoginButton(){

        ElementUtils.doClick(loginBtn);
    }

    public static String getErrorMessage(){
        return ElementUtils.doGetText(errorMsg);
    }





}
