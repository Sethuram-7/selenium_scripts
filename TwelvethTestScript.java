package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TwelvethTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement button_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        WebElement button_2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
        WebElement button_3 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[5]/input"));
        button_1.click();
        Thread.sleep(5000);
        boolean isButton1Selected = button_1.isSelected();
        boolean isButton2Selected = button_2.isSelected();
        boolean isButton3Selected = button_3.isSelected();
        System.out.println("isButton1Selected = " + isButton1Selected);
        System.out.println("isButton2Selected = " + isButton2Selected);
        System.out.println("isButton3Selected = " + isButton3Selected);
        Thread.sleep(5000);
        button_2.click();
        isButton1Selected = button_1.isSelected();
        isButton2Selected = button_2.isSelected();
        isButton3Selected = button_3.isSelected();
        System.out.println("isButton1Selected = " + isButton1Selected);
        System.out.println("isButton2Selected = " + isButton2Selected);
        System.out.println("isButton3Selected = " + isButton3Selected);
        Thread.sleep(5000);
        button_3.click();
        isButton1Selected = button_1.isSelected();
        isButton2Selected = button_2.isSelected();
        isButton3Selected = button_3.isSelected();
        System.out.println("isButton1Selected = " + isButton1Selected);
        System.out.println("isButton2Selected = " + isButton2Selected);
        System.out.println("isButton3Selected = " + isButton3Selected);
        driver.quit();
    }
}
