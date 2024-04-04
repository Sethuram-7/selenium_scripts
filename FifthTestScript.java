package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
public class FifthTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement button_1 = driver.findElement(By.xpath("//*[@id=\"hobbies\"]"));
        WebElement button_2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[7]/div/div/div[2]/input"));
        button_1.click();
        Thread.sleep(5000);
        boolean isButton1Selected = button_1.isSelected();
        boolean isButton2Selected = button_2.isSelected();
        System.out.println("isButton1Selected = "+ isButton1Selected);
        System.out.println("isButton2Selected = "+ isButton2Selected);
        driver.quit();
    }
}
