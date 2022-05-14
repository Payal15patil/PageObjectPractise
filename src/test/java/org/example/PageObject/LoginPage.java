package org.example.PageObject;

import org.example.Hooks;
import org.example.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Hooks {
    //We will declare elements on login page
    String emailID = "patil123@gmail.com";
    String password = "987654";

    @FindBy(xpath = "//*[@id='Email']")
    WebElement emailAdd;

    @FindBy(xpath = "//*[@name='Password']")
    WebElement addPass;

    @FindBy(xpath = "//*[@class='button-1 login-button']")
    WebElement loginBtn;

public void enterCredentials(){
    Util.enterText(emailAdd,emailID);
    Util.enterText(addPass,password);
}
public void  clickOnLoginButton(){
    Util.clickOnElement(loginBtn);
}

}
