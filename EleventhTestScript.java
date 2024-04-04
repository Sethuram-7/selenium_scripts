package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EleventhTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement button_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"));
        button_1.click();
        WebElement button_2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[1]/ul/li[1]/span[1]"));
        button_2.click();
        WebElement button_3 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[1]/ul/li[2]/span[1]"));
        button_3.click();
        Thread.sleep(5000);
        WebElement checkbox_1 = driver.findElement(By.xpath("//*[@id=\"c_bs_1\"]"));
        WebElement checkbox_2 = driver.findElement(By.xpath("//*[@id=\"c_bf_1\"]"));
        WebElement checkbox_3 = driver.findElement(By.xpath("//*[@id=\"c_bf_2\"]"));
        boolean isCheckBox1Selected = checkbox_1.isSelected();
        boolean isCheckBox2Selected = checkbox_2.isSelected();
        boolean isCheckBox3Selected = checkbox_3.isSelected();
        System.out.println("isCheckBox1Selected = " + isCheckBox1Selected);
        System.out.println("isCheckBox2Selected = " + isCheckBox2Selected);
        System.out.println("isCheckBox3Selected = " + isCheckBox3Selected);
        Thread.sleep(5000);
        WebElement button_4 = driver.findElement(By.xpath("//*[@id=\"c_io_1\"]"));
        button_4.click();
        WebElement button_5 = driver.findElement(By.xpath("//*[@id=\"c_io_2\"]"));
        button_5.click();
        WebElement button_6 = driver.findElement(By.xpath("//*[@id=\"c_io_3\"]"));
        button_6.click();
        WebElement button_7 = driver.findElement(By.xpath("//*[@id=\"c_io_4\"]"));
        button_7.click();
        Thread.sleep(5000);
        WebElement button_8 = driver.findElement(By.xpath("//*[@id=\"c_io_5\"]"));
        button_8.click();
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.PAGE_DOWN);
        WebElement button_9 = driver.findElement(By.xpath("//*[@id=\"c_io_6\"]"));
        button_9.click();
        WebElement button_10 = driver.findElement(By.xpath("//*[@id=\"c_io_7\"]"));
        button_10.click();
        WebElement button_11 = driver.findElement(By.xpath("//*[@id=\"c_io_8\"]"));
        button_11.click();
        Thread.sleep(5000);
        isCheckBox1Selected = checkbox_1.isSelected();
        isCheckBox2Selected = checkbox_2.isSelected();
        isCheckBox3Selected = checkbox_3.isSelected();
        System.out.println("isCheckBox1Selected = " + isCheckBox1Selected);
        System.out.println("isCheckBox2Selected = " + isCheckBox2Selected);
        System.out.println("isCheckBox3Selected = " + isCheckBox3Selected);
        driver.quit();
    }
}
