package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainBrowserQuit {
    public static void main(String[] args) throws InterruptedException {

        // Initiate the Webdriver
        WebDriver driver = new ChromeDriver();

        // adding implicit wait of 15 secs
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // URL launch and get the browser title
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        System.out.println( "Browser title after launch: " + driver.getTitle());

        // close browser
        driver.quit();

    }
}