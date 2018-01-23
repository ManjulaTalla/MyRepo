package com.company;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class DownloadMusinFile {
    public static void main(String args[]){
        Screen myScreen;
        System.setProperty("webdriver.ie.driver","src/IEDriverServer.exe");

        WebDriver driver = new InternetExplorerDriver();


        driver.get("https://www.last.fm/music/+free-music-downloads");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        try{
            myScreen = new Screen();
            Pattern P1 = new Pattern("src/Download.png");
            Pattern P2 = new Pattern("src/Savelinkas.png");
            Pattern P3 = new Pattern("src/Desktop.png");
            Pattern P4 = new Pattern("src/Save.png");

            myScreen.rightClick(P1);
            myScreen.click(P2);
            myScreen.click(P2);
            myScreen.click(P3);
            myScreen.type("C:\\Music Assignment");
            myScreen.click(P4);
            myScreen.click(P4);

        } catch (FindFailed e) {
            e.printStackTrace();

        }



    }



}
