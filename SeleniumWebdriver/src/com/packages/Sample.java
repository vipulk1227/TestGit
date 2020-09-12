package com.packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://msrtc.maharashtra.gov.in/");



		// To click on the date field
		WebElement dateField=driver.findElement(By.id("journeydate"));
		dateField.click();


		List<WebElement> list3=driver.findElements(By.xpath("//select[@class='datepick-new-year']/option"));	   
		System.out.println(list3.size());

		for(WebElement de:list3)
		{
			if(de.getText().equals("2021"))
			{
				de.click();
			}
		}
		
		List<WebElement> list2=driver.findElements(By.xpath("//select[@class='datepick-new-month']/option"));
		System.out.println(list2.size());

		for(WebElement cd:list2)
		{
			if(cd.getText().equals("November"))
			{
				cd.click();
			}
		}

		List<WebElement> list=driver.findElements(By.xpath("//table[@class='datepick']/tbody/tr/td"));
		System.out.println(list.size());

		for(WebElement ab:list)
		{
			if(ab.getText().equals("15"))
			{
				ab.click();
			}


		



		}
	}
}
