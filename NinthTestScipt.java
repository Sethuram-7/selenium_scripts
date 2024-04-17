package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class NinthTestScipt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(10000);
        WebElement box_1 = driver.findElement(By.xpath("//*[@id=\"fullname\"]"));
        WebElement box_2 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement box_3 = driver.findElement(By.xpath("//*[@id=\"address\"]"));
        WebElement box_4 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        box_1.sendKeys("Full Name");
        box_2.sendKeys("name@example.com");
        box_3.sendKeys("tdfytf, sghvch, sfdcx, hysdfyv");
        box_4.sendKeys("56468463");
        WebElement button_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[5]/input"));
        button_1.click();
        Thread.sleep(5000);
        WebElement box_5 = driver.findElement(By.xpath("//*[@id=\"fullname\"]"));
        String Full_Name = box_5.getAttribute("value");
        System.out.println("result = "+Full_Name);
        if(Full_Name.equals("")) {
            System.out.println("Form Submit Success");
        }
        driver.quit();
    }
}
