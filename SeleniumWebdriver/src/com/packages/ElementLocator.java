package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
       /* 
         // finding element by id
        WebElement email=driver.findElement(By.id("email"));
         email.sendKeys("vipulk@gmail.com"); 
        
        WebElement password=driver.findElement(By.id("pass"));
         password.sendKeys("12345");
         
         // finding element by name
          WebElement loginButton=driver.findElement(By.name("login"));
         loginButton.click();

        // finding element by class
        WebElement forgotAccount=driver.findElement(By.className("_6ltj"));
         forgotAccount.click();
         
        // finding element by link text
        WebElement forgot=driver.findElement(By.linkText("Forgotten account?"));
         forgot.click();*/		
        
        // finding element by part link test
        WebElement forgott=driver.findElement(By.partialLinkText("account"));
         forgott.click();
         
         
         
	}

}
