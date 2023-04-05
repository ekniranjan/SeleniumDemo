package org.hcl.test.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.Geko.driver", "E:\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(ops);
//		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.get("https://www.goodreturns.in/gold-rates/chennai.html");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("(//table[@cellpadding='1'])[1]"));
		
		List<WebElement> listRows = table.findElements(By.tagName("tr"));
		  // 5%2
		for (int i = 0; i <=listRows.size() ; i++) {
			
			if (i%2==0) {
				
			
			WebElement rowData = listRows.get(i);
			String text = rowData.getText();
			System.out.println(text);
			}
//			List<WebElement> singleData = rowData.findElements(By.xpath("(//td[text()='Gram'])[1]"));
//	
//			for (int j = 0; j < singleData.size(); j++) {
//				
//				WebElement dataElement = singleData.get(j);
//				String text1 = dataElement.getText();
//				
//				System.out.println(text1);
//			}
			
		}
		
		
		
	
		/*
		WebElement table = driver.findElement(By.id("customers"));
		//to get all data from table 
		String text2 = table.getText();
		System.out.println(text2);
		//From Table we choosing Headins its return type is List<WebElement>
		//List<WebElement>tHeading = table.findElements(By.tagName("th")); //use findElements not FindElement
		
		System.out.println(" ================ Table Headings=========");
		// To get Multiple Headings
		List<WebElement> tbleList = table.findElements(By.tagName("th"));
	
		for (int i = 0; i < tbleList.size(); i++) {
			WebElement listWebElement = tbleList.get(i);
			String text = listWebElement.getText();
			
			System.out.println(text);
			if(text.equals("Country"))
			{
				System.out.println(text+" Get particular heading value");
			}
			
		}
		System.out.println("=====Rows=======");
		List<WebElement> listRow = table.findElements(By.tagName("tr"));
		System.out.println("Size of Row==="+  listRow.size());
		for (int i = 0; i < listRow.size(); i++) {
			WebElement rowWebElement = listRow.get(i);
			List<WebElement> listData = rowWebElement.findElements(By.tagName("td"));
			for (int j = 0; j < listData.size(); j++) {
				WebElement dataWebElement = listData.get(j);
				String text3 = dataWebElement.getText();
				System.out.println(text3);
			}
		//	String text1 = rowWebElement.getText();
			//System.out.println(text1);
			
		}
		
		//Get Particular Data
		System.out.println(" Choose particular value===============");
		List<WebElement> listFindElements = table.findElements(By.tagName("tr"));
		for (int i = 0; i < listFindElements.size(); i++) {
			WebElement lisTwebElement = listFindElements.get(i);
			List<WebElement> listData = lisTwebElement.findElements(By.tagName("td"));
			for (int j = 0; j < listData.size(); j++) {
				WebElement datawebElement = listData.get(j);
				String text5 = datawebElement.getText();
				
				if ( text5.equals("Roland Mendel")) {
					System.out.println(text5);
				}
				
			} 
			
			//String text4 = lisTwebElement.getText();
			//System.out.println(lisTwebElement);
		}
		
		*/
	}
}
