package com.company;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


public class ValidateCredentialsTest {

    WebDriver driver;

    BarnesandnobleLoginPage objLogin;

    BarnesandnobleHomePage objHomePage;




    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");

        driver = new InternetExplorerDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://barnesandnoble.com");

    }

    /**
     * <p>
     * Login to application
     * <p>
     * Verify the home page using Dashboard message
     */

    @Test(priority = 0)
    public void test_Home_Page_Appear_Correct() {

        //Create Login Page object

        objLogin = new BarnesandnobleLoginPage(driver);

        //login to application

        objLogin.login("nnaik0806@gmail.com", "@Passw0rd1");

        // go the next page

        objHomePage = new BarnesandnobleHomePage(driver);

        //Verify home page after login with user id and password.

        Assert.assertTrue("Welcome, Nishant".equalsIgnoreCase(objHomePage.getHomePageDashboardUserName()));

        //navigate to book page

        objHomePage.navigateToBooks();


    }
}
