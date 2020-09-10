package com.packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorPath {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     
     // Finding particular product
    /*WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      searchbox.sendKeys("iphone");
     
     WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']"));
      searchButton.click();*/
      
    WebElement accountLink=driver.findElement(By.xpath("//span[@class='nav-line-2 nav-short-width']"));
      accountLink.click();
     
    WebElement loginField=driver.findElement(By.xpath("//input[@id='ap_email']"));
      //WebElement loginField=driver.findElement(By.name("email"));
      
      loginField.sendKeys("vipul@gmail.com");
      
     // Thread.sleep(3000);
     //driver.close();
	}

}
