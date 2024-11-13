package com.thetestingacademy.tests.qa;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import com.thetestingacademy.utils.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static com.thetestingacademy.driver.DriverManager.driver;

public class TestVWOLogin_PF_DM_QA extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_DM_QA.class);

    @Test
    public void testLoginNegativeVWO() throws FileNotFoundException {
        logger.info("Starting Test in QA Environment");
        LoginPage_PF loginPage_Pf = new LoginPage_PF(driver);
        logger.info("Opening the URL");
        loginPage_Pf.openVWOLoginURL("qa");
        String error_msg = loginPage_Pf.loginToVWOInvalidCreds();
        logger.info("Verifying the Result");
        Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
        Assertions.assertThat(error_msg).isNotNull().isNotBlank().contains(PropertyReader.readKey("expected_username"));
    }
}