package com.thetestingacademy.tests.TestVWOLogin_PF;

import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestVWOLogin_PF {

    @Test
    public void testLoginNegativeVWO() throws FileNotFoundException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        LoginPage_PF loginPage_Pf = new LoginPage_PF(driver);
        String error_msg = loginPage_Pf.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        driver.quit();
    }
}
