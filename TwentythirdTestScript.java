package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TwentythirdTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/modal-dialogs.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement button_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
        button_1.click();
        Thread.sleep(5000);
        WebElement button_2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div/div/div[3]/button"));
        button_2.click();
        Thread.sleep(5000);
        WebElement button_3 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        button_3.click();
        Thread.sleep(5000);
        WebElement button_4 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/div/div/div[3]/button"));
        button_4.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
