package org.hcl.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKey {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@type='text']"));
		
		Actions action =new Actions(driver);
		action.keyDown(txtUserName, Keys.SHIFT).sendKeys("nani shift key").keyUp(txtUserName, Keys.SHIFT).perform();
		
		
		
	}
}
