package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class EigtheenthTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement box_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
        box_1.click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "2");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(10000);
        WebElement Newtab_1 = driver.findElement(By.xpath("/html/body/main/div/div/h1"));
        System.out.println(Newtab_1.getText());
        driver.quit();
    }
}