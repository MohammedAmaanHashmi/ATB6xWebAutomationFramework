package com.thetestingacademy.base;

import com.thetestingacademy.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
    //To call the start the Webdriver;
    //Down the WebDriver
    //Start Webdriver start

    @BeforeMethod
    public void setup() {
        DriverManager.init();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.down();
    }
}
