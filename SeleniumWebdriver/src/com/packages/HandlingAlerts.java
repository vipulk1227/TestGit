package com.packages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement sub=driver.findElement(By.name("proceed"));
		   sub.click();
		   
		 Alert alt=driver.switchTo().alert();
		   System.out.println("the text above the alert box  is:"+alt.getText());
		    Thread.sleep(3000);
		     alt.accept();
		
		
	}

}
