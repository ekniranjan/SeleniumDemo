package org.hcl.test.locators;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {
public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(ops);
	          WebDriver  driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
	          
	          
		
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement searchProd = driver.findElement(By.name("keyword"));
	searchProd.sendKeys("iphone",Keys.ENTER );
	
	//WebElement selectProd = driver.findElement(By.className("product-title"));
	WebElement selectProd = driver.findElement(By.xpath("//p[text()='Apple iPhone XR Plain Cases Spectacular Ace - Black']"));
	selectProd.click();
	String parentWindow = driver.getWindowHandle();
	System.out.println(" Parent Window Id"+parentWindow);
	                 
	Set<String> chilWindow = driver.getWindowHandles();
	System.out.println(" Child Window Id"+chilWindow);
	
	  //0=parent 1=child
	
	 // count =0 false  ,count=1 true 
	//CHild to  Another Child
//	int count=0;
//	for (String string : chilWindow) {           
//		if (count==1) {   // 1st child tab 1 
//			
//			driver.switchTo().window(string);
//		}
//		count++;
//	}
	
//	   == equal to
//	   != not equal
	for (String string : chilWindow) {
		
		if(!parentWindow.equals(string))
		{
			driver.switchTo().window(string);
		}
	}
	
//	List<String> listProd=new LinkedList<String>();
//	listProd.addAll(chilWindow);// addAll method used to convert SET to LIST
//	driver.switchTo().window(listProd.get(1));
//	
	WebElement pinCode = driver.findElement(By.id("pincode-check"));
	pinCode.sendKeys("600001");
	//WebElement pinCheck = driver.findElement(By.id("pincode-check-bttn"));
	//WebElement pinCheck = driver.findElement(By.className("col-xs-7 btn btn-xs btn-theme-secondary bordr-rad0"));
	
	WebElement pinCheck = driver.findElement(By.xpath("//span[text()='check']"));
	pinCheck.click();
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	WebElement trustpayClick = driver.findElement(By.xpath("//p[text()='TrustPay']"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", trustpayClick);
	//trustpayClick.click();
	
	
	
	
	
	
	
	
//		
//		driver.manage().window().maximize();
//		WebElement searchProd = driver.findElement(By.id("inputValEnter"));
//		searchProd.sendKeys("i phone",Keys.ENTER);
//		Thread.sleep(2000);   // NBOX - Transparent Silicon Plain Cases Compatible For iPhone 13 ( Pack of 1 )
//		WebElement selectProd = driver.findElement(By.xpath("//p[text()='Apple iPhone 12 Soft Silicon Cases Case Vault Covers - Transparent']"));
//		selectProd.click();
//		//To get Par
//		String par = driver.getWindowHandle();
//		System.out.println(par);
//		//all windows id
//		Set<String> allWindows = driver.getWindowHandles();
//		System.out.println(allWindows);
//		List<String> li=new LinkedList<String>();
//		li.addAll(allWindows);
//		driver.switchTo().window(li.get(1));
//		WebElement addCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
//		addCart.click();
//		
//		WebElement trustPay = driver.findElement(By.xpath("//p[text()='TrustPay']"));
//		trustPay.click();
//	
//		//all windows id
//				Set<String> allWindows1 = driver.getWindowHandles();
//				System.out.println(allWindows1);
//				List<String> li1=new LinkedList<String>();
//				li1.addAll(allWindows1);
//				driver.switchTo().window(li1.get(2)); 
//
//
//				WebElement txtTrustWeb = driver.findElement(By.xpath("//h2[contains(text(),'WHAT')]"));
//				//WebElement findElement = driver.findElement(By.className("accordionHeading"));
//				//String attribute = txtTrustWeb.getAttribute("value");
//				String text = txtTrustWeb.getText();
//				System.out.println(text); 
//				
//				
//		/*WebElement txtTrustWeb = driver.findElement(By.xpath("//h2[text()='WHAT DOES TRUSTPAY STAND FOR?']"));
//		String attribute = txtTrustWeb.getAttribute("value");
//		String text = txtTrustWeb.getText();
//		System.out.println(text); */
//		
//		
}
}
