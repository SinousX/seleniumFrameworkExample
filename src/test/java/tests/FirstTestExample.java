package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestExample {

    @Test
    void firstTestExample(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V1/index.php");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='barone']")).isDisplayed(), "Gtpl Bank header is NOT displayed");
        driver.findElement(By.name("uid")).sendKeys("mngr218416");
        driver.findElement(By.name("password")).sendKeys("qybyqUv");
        driver.findElement(By.name("btnLogin")).click();
        Assert.assertTrue(driver.findElement(By.className("menusubnav")).isDisplayed(), "User is NOT logged in");
        driver.quit();
    }
}
