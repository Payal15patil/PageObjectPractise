package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Hooks {

    Util util = new Util();

    public static void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Util.driver = new ChromeDriver();
        Util.driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(6000);
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Util.driver.manage().window().maximize();
    }

    public static void tearDown() {
        Util.driver.close();
    }
}
