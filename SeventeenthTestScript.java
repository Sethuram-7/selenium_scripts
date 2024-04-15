package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SeventeenthTestScript {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions capabilities = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "C:\\Users\\Sethuram\\Downloads\\seleniumfiles");
        capabilities.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement button_1 = driver.findElement(By.xpath("//*[@id=\"downloadButton\"]"));
        button_1.click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
        element.sendKeys("C:\\Users\\Sethuram\\Downloads\\sampleFile.jpeg");
        driver.quit();
    }
}
