package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Util {
    protected static WebDriver driver;
    //static String url = "https://demo.nopcommerce.com/";
    public Util () {
        PageFactory.initElements(driver, this);
    }
    public static void enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);

    }
    public static void clickOnElement(WebElement element){
        element.click();
    }
    public static String get_Text(WebElement element){
        return element.getText();
    }


}
