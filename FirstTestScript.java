package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class FirstTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
      String current_url =  driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement e = driver.findElement(By.xpath("//*[@id=\"fullname\"]"));


        e.sendKeys("Selenium");
        String text = driver.findElement(By.xpath("//*[@id=\"fullname\"]")).getAttribute("value");
        System.out.println( "text 1 = "+text);
        e.clear();
        text = driver.findElement(By.xpath("//*[@id=\"fullname\"]")).getAttribute("value");
        System.out.println( "text 2 = "+text);
        driver.quit();
    }
}