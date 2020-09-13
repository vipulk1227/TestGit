package com.packages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\git\\TestGit\\SeleniumWebdriver\\src\\com\\packages\\config.properties");
		Properties prop=new Properties();
		prop.load(file);

		
		
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
          
            
            
            
            WebElement email=driver.findElement(By.id("email"));
            email.sendKeys(prop.getProperty("Email"));
            
            WebElement pass=driver.findElement(By.id("pass"));
            pass.sendKeys(prop.getProperty("Pass"));
            
            
            
            WebElement log=driver.findElement(By.name("login"));
            log.click();
	}

}
