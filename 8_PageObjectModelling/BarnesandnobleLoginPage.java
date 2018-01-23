package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BarnesandnobleLoginPage {

    WebDriver driver;

    By emailId = By.id("email");

    By password = By.id("password");

    By titleText =By.className("barone");

    By login = By.cssSelector("#loginForm > div.modal__body.focus > div:nth-child(4) > div > div > button");

    By signIn = By.linkText("Sign In");



    public BarnesandnobleLoginPage(WebDriver driver){

        this.driver = driver;

    }

    //Set user name in textbox

    public void selectEmail(String strUserName){
        driver.switchTo().frame(driver.findElement(By.cssSelector("body > div.modal > div > iframe")));
        driver.findElement(emailId).click();
        driver.findElement(emailId).sendKeys(strUserName);
    }

    //click on signin

    public void clickSignIn(){

        driver.findElement(signIn).click();

    }

    //Set password in password textbox

    public void setPassword(String strPassword){

       driver.findElement(password).sendKeys(strPassword);

    }

    //Click on login button

    public void clickSecureSignIn(){

        driver.findElement(login).click();

    }



    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void login(String strUserName,String strPasword){

        this.clickSignIn();

        this.selectEmail(strUserName);

        //Fill password

         this.setPassword(strPasword);

        //Click Login button

         this.clickSecureSignIn();

    }

}
