package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FifteenthTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement button_1 = driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
        button_1.click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
        element.sendKeys("C:\\Users\\Sethuram\\Downloads\\sampleFile.jpeg");

    }
}
