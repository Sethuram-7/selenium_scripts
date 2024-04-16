package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SixteenthTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php#");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement box_1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement box_2 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        box_1.sendKeys("name@example.com");
        box_2.sendKeys("56468463");
        WebElement button_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
        button_1.click();
        Thread.sleep(5000);
        WebElement box_5 = driver.findElement(By.xpath("//*[@id=\\\"email\\\"]\""));
        String Email = box_5.getAttribute("value");
        System.out.println("result = "+Email);
        if (Email.equals("")) {
            System.out.println("Form Submit Sucess");
        }
        driver.quit();
    }
}
