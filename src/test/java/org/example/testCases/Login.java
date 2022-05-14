package org.example.testCases;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Hooks;
import org.example.PageObject.HomePage;
import org.example.PageObject.LoginPage;
import org.example.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.security.PublicKey;

public class Login extends Hooks {
    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();
@Before
    public void open() throws InterruptedException {
    Hooks.setup();
    }
    @Test
    public void loginCase1(){
        homePage.clickOnLoginIcon();
        loginPage.enterCredentials();
        loginPage.clickOnLoginButton();
    }
    @After
    public void close(){
    Hooks.tearDown();
    }
}
