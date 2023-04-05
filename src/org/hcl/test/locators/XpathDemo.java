package org.hcl.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// To Maximize the Browser
		
				driver.manage().window().maximize();
				
		// -------------CONTAINS TEXT X-PATH -------------------		
		   // tagName[contains(text(),'partialTextValue']
		
		WebElement findElement2 = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String text2 = findElement2.getText();
		System.out.println(text2);
		
		//--------------TEXT XPATH -------------------
		    // tagName[text()='textValue']
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		//To get the text value from Web Element
		String text = findElement.getText();
		System.out.println(text);
		findElement.click();
		driver.navigate().back();
		
		
		//---------------CONTAIN ATTRIBUTE XPATH ----------------
		    //tagName[contains(@attributeName,'PartialAttributeValue')]
		
		WebElement txtUsername = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		txtUsername.sendKeys("Nani 123");
		
		
		// TO GET ATTRIBUTE VALUE FROM WEBELEMENT
		   // getAttribute("value")
		
		String attribute = txtUsername.getAttribute("value");
		System.out.println(attribute);
		
		
	}

}
