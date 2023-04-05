package org.hcl.test.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptDropDown {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		WebElement multiSelect = driver.findElement(By.name("selenium_commands"));
		
		// TO CHECK WEATHER THE MULTIPLE OPTIONS CAN BE SELECTABLE OR NOT
		
		Select s=new Select(multiSelect);
		boolean chckMultiple = s.isMultiple();
		System.out.println(chckMultiple);
		
		s.selectByIndex(4);
		s.selectByVisibleText("Wait Commands");
		s.selectByVisibleText("Navigation Commands");
		
		//TO GET ALL SELECTED OTIONS
		
		System.out.println("-----ALL SELECTED OPTIONS-------");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			WebElement element = allSelectedOptions.get(i);
			String text = element.getText();
			System.out.println(text);
			//System.out.println(element.getText()); //we can also call this
			
		}
		
		//TO GET FIRST SELECTED OPTION
		System.out.println("-------------- FIRST SELECTED OPTION-----------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		
		//DESELECT
		s.deselectByIndex(3);
		s.deselectByVisibleText("Wait Commands");
		s.deselectAll();
		
		
		
		
	}

}
