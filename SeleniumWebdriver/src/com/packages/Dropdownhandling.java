package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/");
		
		//Click on create Account Page
		WebElement createAccount=driver.findElement(By.linkText("Create Account"));
                createAccount.click();
	


		   WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1] "));
					
		             Select bDay=new Select(day);
					bDay.selectByValue("12");
					//bDay.selectByIndex(12);
					// bDay.selectByVisibleText("12");
		

	}

}
