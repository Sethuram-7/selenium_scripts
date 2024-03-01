package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class ThirdTestScript {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://percentagecalculator.net/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement box_1 = driver.findElement(By.xpath("/html/body/main/form[1]/fieldset[1]/input"));
        WebElement box_2 = driver.findElement(By.xpath("/html/body/main/form[1]/fieldset[1]/nobr/input"));
        WebElement button_1 = driver.findElement(By.xpath("/html/body/main/form[1]/fieldset[2]/input[1]"));
        WebElement result = driver.findElement(By.xpath("/html/body/main/form[1]/fieldset[2]/input[2]"));
        box_1.sendKeys("10");
        box_2.sendKeys("505");
        button_1.click();
        Thread.sleep(5000);
        String result_val = result.getAttribute("value");
System.out.println("result_val = "+result_val);
driver.quit();
    }

}
