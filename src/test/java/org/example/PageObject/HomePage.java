package org.example.PageObject;

import org.example.Hooks;
import org.example.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Hooks {
    @FindBy(xpath = "//*[@class='ico-login']")
    WebElement loginIcon;

    public void clickOnLoginIcon(){
        Util.clickOnElement(loginIcon);
    }
}
