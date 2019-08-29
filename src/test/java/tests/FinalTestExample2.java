package tests;

import bankProject.HomePage;
import driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import testBase.BaseTest;

public class FinalTestExample2 extends BaseTest {

    @Test
    void withAllElement(){
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.openHomePage().isBankHeaderPresent(), "Gtpl Bank header is NOT displayed");
        Assert.assertTrue(homePage.login("mngr218416", "qybyqUv").isSideMenuDisplayed(), "User is NOT logged in");
    }
}
