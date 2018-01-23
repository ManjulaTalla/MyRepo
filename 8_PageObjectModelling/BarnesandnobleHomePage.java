package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by x223962 on 11/28/2017.
 */
public class BarnesandnobleHomePage {

    WebDriver driver;

    By homePageUserName = By.cssSelector("#userLinks > a");

    public BarnesandnobleHomePage(WebDriver driver){

        this.driver = driver;

    }

    //Get the User name from Home Page

    public String getHomePageDashboardUserName(){
        String name = driver.findElement(homePageUserName).getText();
        return driver.findElement(homePageUserName).getText();

    }

    public void navigateToBooks(){
        WebElement element = driver.findElement(By.linkText("Books"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Biography")).click();
    }

}
