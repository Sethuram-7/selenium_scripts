package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TwentysixthTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        String box = driver.findElement(By.xpath("/html/body/main/div/div")).getText();
        System.out.println(" Text is: " + box);
        driver.switchTo().defaultContent();
        driver.quit();
    }
}