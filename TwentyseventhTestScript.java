package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

public class TwentyseventhTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement button_1 = driver.findElement(By.xpath("//*[@id=\"datetimepicker2\"]"));
        button_1.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement date = driver.findElement(By.cssSelector("span[class='flatpickr-day today']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(date);
        actions.sendKeys("\n");
        WebElement time_1 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/input"));
        time_1.sendKeys("09");
        WebElement time_2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/input"));
        time_2.sendKeys("10");
        WebElement time_3 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/span[2]"));
        time_3.click();
        driver.quit();
    }
}
