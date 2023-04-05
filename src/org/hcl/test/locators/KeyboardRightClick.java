package org.hcl.test.locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardRightClick {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement getGmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//create object for Action class
		
		Actions actions=new Actions(driver);
		
		//To  Perform RIghT Click action
		
		actions.contextClick(getGmail).perform();
		
		//Create Object for Robot Class to Perform Keyboard Actions
		
		Robot r =new Robot();
		for (int i = 0; i < 3; i++) {
		
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
