package com.packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://msrtc.maharashtra.gov.in/");
		
		
		WebElement from=driver.findElement(By.xpath("//input[@id='from_txt']"));
		  from.sendKeys("kolhapur");
		
		WebElement to=driver.findElement(By.xpath("//input[@id='to_txt']"));
		  to.sendKeys("shahuwadi");
		
		WebElement dateField=driver.findElement(By.id("journeydate"));
		dateField.click();
		
		WebElement months=driver.findElement(By.className("datepick-new-month"));
		 Select dmonth=new Select(months);
		 dmonth.selectByVisibleText("November");
		
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@class='datepick']/tbody/tr/td"));
           System.out.println(list.size());
           
          
        for(WebElement ab:list)
        {
            if(ab.getText().equals("13"))
            {
            	ab.click();
            }
        }
        	 
      	
        List<WebElement> list2=driver.findElements(By.xpath("//select[@id='busservicetype']/option"));
        	System.out.println(list2.size()); 
        	
        	
        for(WebElement bd:list2)
        {
        	if(bd.getText().equals("Semi Luxury"))
        	{
        	    bd.click();
        	}
        }
        
        
       WebElement button=driver.findElement(By.xpath("//input[@id='submit']"));
        button.click();
	}

}
