package com.packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWord {

	public static void main(String[] args) {
		// 
 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leadmart.in/");
	//1.To get current URL
	
	String pageUrl=driver.getCurrentUrl();
   System.out.println("current Url id:"+pageUrl );
   
   //validation of current URL
   
    if(pageUrl.equals("http://www.leadmart.in/"))
    {
    	System.out.println("page Url is correct");
    }
    else 
    {
    	System.out.println("page Url is incorrect");
    }
    
    //2.To get current page Title
    
    String pageTitle=driver.getTitle();
    System.out.println("current page Title is:"+pageTitle);
    
    // validation of current page Title
    
    if(pageTitle.equals("Lead mart"))
    {
    	System.out.println("page Title is correct");
    	
    }
    else {
    	System.out.println("page Title is incorrect");
    }
    
    // 3.To get current page source
    
    System.out.println(driver.getPageSource());
    
   driver.quit(); 
}
}
