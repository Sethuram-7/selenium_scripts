package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SecondTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        List<WebElement> totalLnks = driver.findElements(By.tagName("a"));
        System.out.println( "Total number of links on a page: " + totalLnks.size() );
        for ( int j = 0; j < totalLnks.size() ; j++) {
            System.out.println( "Link text is: " + totalLnks.get(j).getText() ) ;
        }
        driver.quit();
        }
    }

