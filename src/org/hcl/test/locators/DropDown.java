package org.hcl.test.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement cretBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		js.executeScript("arguments[0].click()", cretBtn);
		
		Thread.sleep(3000);
		
		WebElement monthOption = driver.findElement(By.id("month"));
		
		//create Select Class
		
		Select s=new Select(monthOption);
		//s.selectByIndex(5);
		s.selectByValue("10");//attribute value
		//s.selectByVisibleText("May");
		//s.selectByIndex(6); //index position 6=july
		
		List<WebElement> optionsMonth = s.getOptions();
		System.out.println("Month Options");
		
		//using loop to get values one by one 
		
		for (int i = 0; i < optionsMonth.size(); i++) {
			
			WebElement webElement = optionsMonth.get(i);
			
			// Convert List to String
			String monthString = webElement.getText();
			System.out.println(monthString);
		}
		
		WebElement dayOptions = driver.findElement(By.id("day"));
		
		Select daySelect=new Select(dayOptions);
		
		daySelect.selectByIndex(9);
		//daySelect.selectByValue("27");
		//daySelect.selectByVisibleText("30");
		
		//System.out.println(optionsMonth);
		
		List<WebElement> dayOptionsList = daySelect.getOptions();
		System.out.println("Day Options  ");
		
		for (WebElement dayWebElement : dayOptionsList) {
		
			String dayString=dayWebElement.getText();
			System.out.println(dayString);
			
		}
		// Year Drop Down
		WebElement yearOption = driver.findElement(By.id("year"));
		Select yearSelect= new Select(yearOption);
		
		yearSelect.selectByIndex(20);
		//yearSelect.selectByValue("1949");
		//yearSelect.selectByVisibleText("2000");
		
		List<WebElement> yearOptionsList = yearSelect.getOptions();
		System.out.println("Year options");
		for (int i = 0; i < yearOptionsList.size(); i++) {
			WebElement yearElement = yearOptionsList.get(i);
			//List to String Conversion
			String yearString=yearElement.getText();
			System.out.println(yearString);
		}
		System.out.println("Year For Each Loop");
		for (WebElement webElement : yearOptionsList) {
			String yearEach=webElement.getText();
			System.out.println(yearEach);
			
		}
		}
	}


