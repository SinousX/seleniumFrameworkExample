package tests;

import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.BaseTest;

public class FirstTestNgTest2 extends BaseTest {

    @Test
    void firstTestNgTest2(){
        WebDriver driver = BaseDriver.getDriver();
        driver.get("http://demo.guru99.com/V1/index.php");
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='barone']")).isDisplayed(), "Gtpl Bank header is NOT displayed");
        driver.findElement(By.name("uid")).sendKeys("mngr218416");
        driver.findElement(By.name("password")).sendKeys("qybyqUv");
        driver.findElement(By.name("btnLogin")).click();
        Assert.assertTrue(driver.findElement(By.className("menusubnav")).isDisplayed(), "User is NOT logged in");
    }
}
