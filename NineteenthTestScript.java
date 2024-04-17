package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class NineteenthTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement box_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button"));
        box_1.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(5000);
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(5000);
        alert.accept();
        driver.quit();
    }
}
