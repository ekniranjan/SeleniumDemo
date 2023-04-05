package org.hcl.test.locators;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		
		//To create object for JAVA SCRIPT EXECUTOR
		//child interface   //web driver=Parent Interface
		JavascriptExecutor js=(JavascriptExecutor) driver; //downCasting
         
         WebElement txtPass = driver.findElement(By.name("pass"));
         
        
         js.executeScript("arguments[1].setAttribute('value','NANI')", txtPass,txtUserName);
         
         js.executeScript("arguments[0].setAttribute('value','PAss@123') ", txtPass);
        
         /*  //or
        js.executeScript("arguments[1].setAttribute('value','NANI')", txtUserName,txtPass);
         
         js.executeScript("arguments[0].setAttribute('value','PAss@123') ", txtUserName,txtPass);*/ 
         
         WebElement btnLogin = driver.findElement(By.name("login"));
         js.executeScript("arguments[0].click()", btnLogin);
		
         
         // TO GET ATTRIBUTE VALUE
         
         Object executeScript = js.executeScript("return arguments[0].getAttribute()", args);
         
         //get Attribute return type is object
         Object ob = js.executeScript("return arguments[0].getAttribute('value')", txtPass);

         //Convert object to string 
          String s=(String) ob;
          
          System.out.println(s);
         
         
         
         
         
}
}
