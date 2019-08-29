package testBase;

import driver.BaseDriver;
import org.testng.annotations.*;

public class BaseTest {
    public BaseTest(){}

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        BaseDriver.instantiateWebDriver();
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        BaseDriver.quitDriver();
    }
}