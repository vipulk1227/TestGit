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
    WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
     searchbox.click();
     searchbox.sendKeys("t-shirt");
     WebElement submit=driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']"));
     submit.click();
     
     
     
     
     // Thread.sleep(3000);
     //driver.close();
	}

}
