package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TwentyfifthTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        String box_1 = driver.findElement(By.xpath("/html/body/main/div/div")).getText() ;
        System.out.println(" Text is: " + box_1);
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        String box_3 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/p")).getText() ;
        System.out.println(" Text is: " + box_3);
        Thread.sleep(5000);
        driver.switchTo().frame(1);
        String box_2 = driver.findElement(By.xpath("/html/body/div/header/div[2]/h1")).getText() ;
        System.out.println(" Text is: " + box_2);
        Thread.sleep(5000);
        driver.quit();
    }
}