package com.cybertek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //This line makes the findElement wait for some time when it cannot find an element
        //findElement method will keep trying to locate the element during given duration
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.cheapfansedge.info");
        driver.findElement(By.tagName("input")).sendKeys("asdfasdfd");

        //HARD CODED WAIT
        Thread.sleep(5000);
        driver.get("https://www.google.com");
    }
}
