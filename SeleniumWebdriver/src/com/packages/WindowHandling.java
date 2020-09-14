package com.packages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.manage().window().maximize(); 
		driver.get("http://demo.automationtesting.in/Windows.html");

		WebElement click=driver.findElement(By.partialLinkText("click"));
		click.click();
		System.out.println("Current page title is:"+driver.getTitle());

		Set <String>handle=driver.getWindowHandles();
		java.util.Iterator<String> it=handle.iterator();


		String ParentWindowId=it.next();
		String ChildWindowId=it.next();

		driver.switchTo().window(ChildWindowId);
		System.out.println("Child window tittle is:"+driver.getTitle());

		// Swtich to parent window

		driver.switchTo().window(ParentWindowId);
		System.out.println("parent window title is:"+driver.getTitle());

		driver.quit();


	}

}
