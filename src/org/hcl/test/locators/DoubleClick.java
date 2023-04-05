package org.hcl.test.locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@type='text']"));
		txtUserName.sendKeys("Nani Hello");
		
		
		// Create Object for Action Class
		 Actions action=new Actions(driver);
		 
		//To PerForm Double Click
		action.doubleClick(txtUserName).perform();
         
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);          //To Control copy n paste
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		r.keyPress(KeyEvent.VK_TAB);  // To go Next TAB
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
	}

}
