package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Initiate the Webdriver
        WebDriver driver = new ChromeDriver();

        // adding implicit wait of 15 secs
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // URL launch
        driver.get("https://www.google.com");

        // get browser title after browser launch
        System.out.println("Browser title: " + driver.getTitle());

    }
}