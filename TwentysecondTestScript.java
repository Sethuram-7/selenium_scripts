package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TwentysecondTestScript {
    public static  void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Users/Sethuram/OneDrive/Documents/JavaScript%20Prompt.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement button_1 = driver.findElement(By.xpath("/html/body/button"));
        button_1.click();
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
        wt.until(ExpectedConditions.alertIsPresent());
        Alert alrt = driver.switchTo().alert();
        alrt.sendKeys("Harry Potter");
        Thread.sleep(15000);
        alrt.accept();
        Thread.sleep(15000);
        System.out.println(alrt.getText());
        driver.quit();
    }
}
