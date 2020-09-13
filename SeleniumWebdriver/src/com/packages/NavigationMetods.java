package com.packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMetods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		driver.navigate().to("https://mail.rediff.com/");
		
		//driver.navigate().back();
		
		//driver.navigate().forward();
		
		//driver.navigate().refresh();

	}

}
