package org.hcl.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
				 
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.demo.guru99.com/test/drag_drop.html");
				
				//source
				
				WebElement sourc = driver.findElement(By.id("credit2"));
				
				//TARGET 
				WebElement destination = driver.findElement(By.id("bank"));
				
				// CREATE OBJECT FOR ACTIONS CLASS
				
				Actions actions =new Actions(driver);
				
				//DRAG AND DROP
				
				actions.dragAndDrop(sourc, destination).perform();
				
}
}
