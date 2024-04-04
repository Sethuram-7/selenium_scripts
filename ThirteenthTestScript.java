package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ThirteenthTestScript {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php?#");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        int row = 3;
        int column = 4;
        WebElement box_1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr["+row+"]/td["+column+"]"));
        System.out.println(box_1.getText());
        driver.quit();
    }
}
