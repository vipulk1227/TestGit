package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionhandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://msrtc.maharashtra.gov.in/");
		
		WebElement eng=driver.findElement(By.linkText("English"));
          eng.click();
		
        WebElement service=driver.findElement(By.linkText("Services"));
		  //service.click();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(service).build().perform();
	}

}
