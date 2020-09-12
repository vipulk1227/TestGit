package com.packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com");

		// Click on Create Account
		WebElement newAccount=driver.findElement(By.linkText("Create Account"));
		newAccount.click();

		// Enter Full Name
		WebElement fullName=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));  
		fullName.sendKeys("vipul khutale");

		// Enter RediffID
		WebElement rediffId=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input"));
		rediffId.sendKeys("vipulk.0909");

		// To check RediffID is correct or Not
		WebElement check=driver.findElement(By.xpath("//input[@class='btn_checkavail']"));
		check.click();

		// Enter password
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Vipul@4545");

		// Retype password
		WebElement rPassword=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input"));
		rPassword.sendKeys("Vipul@4545");



		// Enter Alternate email address
		WebElement aEmail=driver.findElement(By.xpath("//div[@id='div_altemail']/table/tbody/tr/td[3]/input"));
		aEmail.sendKeys("vipul@gmail.com");


		// If you don't have alternate email id,then select checkbox
		//WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));    




		// Select country code
		/*        
	  List<WebElement> list=driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));
	      System.out.println(list.size());

	      for(WebElement a:list)
	      {
	    	  if(a.getText().equals("1"))
	    	  {
	    		  a.click();
	    	  }
	      } */


		//Enter Mobile no

		WebElement mob=driver.findElement(By.xpath("//input[@id='mobno']"));
		mob.sendKeys("9876543210");


		// Select Birth Day

		List<WebElement> list1=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]/option"));
		System.out.println("The total date is stored is:"+list1.size());

		for(WebElement b:list1)
		{
			if(b.getText().equals("12"))
			{
				b.click();
			}
		}


		//Select Birth Month

		List<WebElement> list2=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]/option"));
		System.out.println("The total months stored is:"+list2.size());

		for(WebElement c:list2)
		{	if(c.getText().equals("SEP"))
		{
			c.click();
		}
		}

		//Select Birth Year

		List<WebElement> list3=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]/option"));
		System.out.println("The total no of years stored are:"+list3.size());

		for(WebElement d:list3)
		{
			if(d.getText().equals("1992"))
			{
				d.click();
			}
		}


		// Select Gender [By default Male is selected]

		WebElement radioButton=driver.findElement(By.xpath("//input[@value='m']"));
		System.out.println(radioButton.isSelected());
		//radioButton.click();

		if(radioButton.isSelected())
		{
			System.out.println(" Male radio button is selected");
		}

		else 
		{

			radioButton.click();
		}


		//Enter Country Name

		List<WebElement> list4=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr[26]/td[3]/select/option"));
		System.out.println("The total no of countries are:"+list4.size()); 

		for(WebElement e:list4)
		{
			if(e.getText().equals("India"))
			{
				e.click();
			}
		}

		//Enter City Name

		List<WebElement> list5=driver.findElements(By.xpath("//table[@id='tblcrtac']/tbody/tr[28]/td/div/table/tbody/tr/td[3]/select/option"));
		System.out.println("The total no of city are:"+list5.size());

		for(WebElement f:list5)
		{
			if(f.getText().equals("Kolhapur"))
			{
				f.click();
			}
		}


		//Click on Submit Button

		WebElement sub=driver.findElement(By.xpath("//input[@id='Register']"));
		sub.click();
	}

}



