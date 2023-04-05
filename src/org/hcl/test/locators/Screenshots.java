package org.hcl.test.locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		
		WebElement xbtn = driver.findElement(By.xpath("//button[text()='×']"));
		js.executeScript("arguments[0].click()", xbtn);
		
		Thread.sleep(3000);
		WebElement scrllDown = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrllDown);
		
		Thread.sleep(2000);
		WebElement scrllUp = driver.findElement(By.id("client-logo"));
		js.executeScript("arguments[0].scrollIntoView(false)", scrllUp);
		
		//TO CREATE OBJECT FOR TAKESCREENSHOT
		
		TakesScreenshot ts=(TakesScreenshot) driver;// //down casting/type casting
		
		//Capture Screenshot
		
		//Create File
		
	      File src=scrllDown.getScreenshotAs(OutputType.FILE);
	      System.out.println(src);
	      
	      //Relocate file(screenshot) location
	      File dstFileDown= new File("E:\\eclipse-workspace\\Locators\\lib\\mYscreenshot.png");
	      
	      FileUtils.copyFile(src, dstFileDown);
	      
	      File src1=scrllUp.getScreenshotAs(OutputType.FILE);
	      System.out.println(src1);
	      
	      //Relocate file(screenshot) location
	      File dstFileUp= new File("E:\\eclipse-workspace\\Locators\\lib\\mYscreenshot1.png");
	      
	      FileUtils.copyFile(src1, dstFileUp);
	      
	      
	}

}
