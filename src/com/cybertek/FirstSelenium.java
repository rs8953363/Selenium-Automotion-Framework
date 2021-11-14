package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        //We cannot open a browser without setting the path drivers. This line must come before creating the
        // webdriver object.
        // first argument is the type driver.   //Second argument is the location of the driver
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Dependencies\\drivers\\chromedriver.exe");

        //this line opens a browser
        WebDriver driver = new ChromeDriver();

        //open a website
        driver.get("https://cybertekschool.com");
    }
}



