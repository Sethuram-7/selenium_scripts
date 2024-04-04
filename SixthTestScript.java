package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class SixthTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement select_1 = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        Select s = new Select(select_1);
        s.selectByValue("Haryana");
        String val = s.getFirstSelectedOption().getAttribute("value");
        Thread.sleep(5000);
        System.out.println("SelectBoxValue = "+ val);
        driver.quit();

    }
}
