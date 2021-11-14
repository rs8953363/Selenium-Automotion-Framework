package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in ");
        WebElement inputEmail = driver.findElement(By.id("session_email"));
        inputEmail.sendKeys("kexesobepu@zsero.com");

        //find the password input box
        WebElement inputPassword = driver.findElement(By.id("session_password"));
        inputPassword.sendKeys("password");

        //locates sign in button
        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();

        WebElement logOutLink = driver.findElement(By.linkText("Sign out"));
        logOutLink.click();

        WebElement homeLink = driver.findElement(By.partialLinkText("Hom"));
        homeLink.click();

    }
}
