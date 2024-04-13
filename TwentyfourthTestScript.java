package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TwentyfourthTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(10000);
    WebElement b = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        b.click();
    String oW = driver.getWindowHandle();

    Set<String> windows = driver.getWindowHandles();

        for (String w : windows) {
        if(!oW.equalsIgnoreCase(w)) {

            driver.switchTo().window(w);


            WebElement e = driver.findElement
                    (By.xpath("/html/body/main/div/div/h1"));
            System.out.println("Text in new window is: " + e.getText());
            driver.close();
            break;
        }
    }

        driver.switchTo().window(oW);

    WebElement e1 = driver.findElement
            (By.xpath("/html/body/main/div/div/div[2]/h1"));
        System.out.println("Text in parent window is: " + e1.getText());
        driver.quit();
}
}
