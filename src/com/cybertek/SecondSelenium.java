package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SecondSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Selenium Dependencies\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        //open a website. Get method waits for the page to load
        driver.get ("https://etsy.com");
        //open a website. Navigate.to method does not wait for the page to load
        driver.navigate().to("https://amazon.com");

        //navigate.back takes you from the amazon's website to etsy's website
        driver.navigate().back();

        //navigate.forward takes you from the etsy's website to amazon's website again
        driver.navigate().forward();

        driver.navigate().refresh();//refreshes the page
    }
}
