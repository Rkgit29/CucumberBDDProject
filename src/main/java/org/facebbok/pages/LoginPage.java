package org.facebbok.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;


    public void openURL() throws Exception{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.facebook.com/");
    }
    public void enterUsername(){
        driver.findElement(By.id("email")).sendKeys("rakesh@gmail.com");
    }
    public void enterPassword() {
        driver.findElement(By.id("pass")).sendKeys("rakesh@123");
    }
    public void clickLoginbutton() {
        System.out.println("Login button clicked");
    }
    public void verfyLogin() {
        System.out.println("verified test case");
    }
}


