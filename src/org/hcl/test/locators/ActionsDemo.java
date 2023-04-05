package org.hcl.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		// ------MOUSE OVER ACTION -------------
		   // Actions ObjectName=new Actions(WebDriver refName);
		
		WebElement optCourses = driver.findElement(By.xpath("//div[text()='Courses ']"));
		
		//Create object for Actions class
		Actions action=new Actions(driver);
		
		action.moveToElement(optCourses).perform();//perform is pre defined method we need to call perforom() to move mouse
		
		WebElement optOracle = driver.findElement(By.xpath("//span[contains(text(),'Oracle (48)')]"));
		
		action.moveToElement(optOracle).perform();
		
		WebElement allCourses = driver.findElement(By.xpath("(//a[contains(text(),'View')])[3]"));
		
		allCourses.click();
		
		
		
		
	}

}
