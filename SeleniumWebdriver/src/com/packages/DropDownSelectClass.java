package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
      
	WebElement create=driver.findElement(By.linkText("Create New Account"));
	        create.click();
	        
	     //Enter First name
	    WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
	      first.sendKeys("vipul");
	
	    WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
	      last.sendKeys("khutale");
	}

}
