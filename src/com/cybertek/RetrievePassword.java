package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievePassword {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        //tagnames don't have a space, atributes or values can have spaces.
        WebElement email = driver.findElement(By.tagName("input"));
        email.sendKeys("example@gmail.com");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
    }
}
