package org.hcl.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownNScrollUp {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\firefoxDriver.exe");
		 
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		
		//CLOSE AD BANNER
		WebElement xbtn = driver.findElement(By.xpath("//button[text()='×']"));
		xbtn.click();
		
		WebElement scrllDown = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
		
		// TO CREATE OBJECT FOR JAVA SCRIPT
		JavascriptExecutor  js=(JavascriptExecutor) driver; //down casting/type casting
		// SCROLL DOWN
		//js.executeScript("arguments[0].scrollIntoView()" , args)
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrllDown);
		Thread.sleep(3000);
		
		//SCROLL UP
		WebElement scrllUp = driver.findElement(By.id("client-logo"));
	
		js.executeScript("arguments[0].scrollIntoView(false)", scrllUp);
	}
}
