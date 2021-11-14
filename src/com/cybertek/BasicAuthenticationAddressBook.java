package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationAddressBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        //driver represents the whole browser
        //Finding element on a webpage
        WebElement inputEmail = driver.findElement(By.id("session_email"));
        //sendKeys() method is used to type on an element, it takes string as argument
        inputEmail.sendKeys("kexesobepu@zsero.com");

        WebElement inputPassword = driver.findElement(By.id("session_password"));
        inputPassword.sendKeys("password");
        //inputEmail.clear();//clears the content of an input element

        //locates the sign in button
        WebElement signinButton = driver.findElement(By.name("commit"));
        System.out.println(driver.getTitle());

        //clicks on the button
        signinButton.click();
        System.out.println(driver.getTitle());

        WebElement username = driver.findElement(By.className("navbar-text"));
        //System.out.println(username);

        String actualUsername = username.getText();
        System.out.println(actualUsername);

        if ("kexesobepu@zsero.com".equals(actualUsername)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED: kexesobepu@zsero.com");
            System.out.println("actualUsername = " + actualUsername);
        }

        //verify title
        if (!driver.getTitle().contains("Sign In")) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(driver.getTitle());
        }
        //How to maximize the page
        //driver.manage().window().fullscreen(); //mac
        driver.manage().window().maximize(); //

        }
    }

