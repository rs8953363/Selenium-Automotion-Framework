package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualURL = " + actualURL);
            System.out.println("expectedURL = " + expectedURL);
        }
        // gets the HTML of the page
       // System.out.println(driver.getPageSource());
    }
}
