package org.hcl.test.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\Locators\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// To Maximize the Browser
		
		driver.manage().window().maximize();
		
		// launch URL /webpage
	 /*	driver.get("https://www.facebook.com/");
		
		//To Find the Elements on the webpage
		
		WebElement txtUserName= driver.findElement(By.id("email"));
		
		//To pass the value to WebElement 
		txtUserName.sendKeys("viratKholi");
		
		WebElement txtPass= driver.findElement(By.id("pass"));
		
		txtPass.sendKeys("1234gt");
		
		WebElement btnLogin=driver.findElement(By.name("login"));
		btnLogin.click();
		*/
		
		driver.get("https://www.facebook.com/");
		
		WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createAcc.click();
		Thread.sleep(3000);
		WebElement btnRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		btnRadio.click();
		
		//TASK DAY 3
		
		//Task 1
		/*  driver.navigate().to("https://www.redbus.in/");
		
		
	    WebElement txtLocationFrom=driver.findElement(By.id("src"));
	     
	     txtLocationFrom.sendKeys("vijayawada");
	     
	     WebElement txtLocationTo=driver.findElement(By.id("dest"));
		
	     txtLocationTo.sendKeys("chennai"); */
		
		//Task 2
	    
	   /*  driver.get("https://www.google.com/");
	     
	     WebElement txtSearch=driver.findElement(By.name("q"));
	     txtSearch.sendKeys("Greens Technology"); 
	   //  WebElement txtSearchbtn=driver.findElement(By.className("gNO89b"));
	     WebElement txtSearchbtn=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")); //Relative XPATH
	     txtSearchbtn.click(); */ 
	     
		//Task 3 
		//not able to type pass 
	    /* driver.get("https://infinity.icicibank.com/corp/Login.jsp\r\n" + 
	     		"");
	     
	     WebElement txtUserName=driver.findElement(By.name("DUMMY1"));
	     txtUserName.sendKeys("testlogin");
	     
	     WebElement txtUserpass=driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
	     txtUserpass.sendKeys("123password"); */
		
		//TAsk 4
		//not able to type user id
	     
	   /*  driver.get(" https://netbanking.hdfcbank.com/");
	     
	     WebElement txtPass=driver.findElement(By.name("fldLoginUserId"));
	     txtPass.sendKeys("1234test@login"); */
	     
		
		//Task 5
	   /*  driver.get("https://www.swiggy.com/");
	     WebElement txtLocation=driver.findElement(By.id("location"));
	     
	     txtLocation.sendKeys("vijayawada"); */
	     
	     //Task 6
	     
	   /*  driver.get("https://www.snapdeal.com/login");
	     WebElement txtUsername= driver.findElement(By.id("userName"));
	     txtUsername.sendKeys("testlogin123");
	     */
	     //Task8
		
	     //unable to click button
		
		
		/* driver.get("https://www.instagram.com/accounts/login/");
	    // WebElement txtUserLogin= driver.findElement(By.xpath("//input[@type='text']"));
		 Thread.sleep(3000);
		 WebElement txtUserLogin= driver.findElement(By.name("username"));
	     txtUserLogin.sendKeys("testlogi123");
	     
	     WebElement txtUserPass= driver.findElement(By.xpath("//input[@type='password']"));
	     txtUserPass.sendKeys("testlogi123"); 
	     WebElement buttotnLogin =driver.findElement(By.xpath("//div[text()='Log in']"));
	     buttotnLogin.click();  */
	   
	     
	     
		
		//Task 10
		/* 
	     driver.get("http://adactinhotelapp.com/");
	     WebElement txtuserName=driver.findElement(By.id("username"));
	     txtuserName.sendKeys("testlogin123");
	     
	     WebElement txtuserpass=driver.findElement(By.name("password"));
	     txtuserpass.sendKeys("testlogin123");
	     
	     WebElement buttonlog=driver.findElement(By.id("login"));
	     
	     buttonlog.click(); */
	 
		//DAY 3 TASK 1
		
		/*driver.get("https://www.amazon.in/");
		WebElement txtSearch = driver.findElement(By.name("field-keywords"));
		txtSearch.sendKeys("IPHONE");
		
		WebElement txtSearch1 = driver.findElement(By.id("nav-search-submit-button"));
		txtSearch1.click();*/
		
		//Day 3 Task7
		
		
		/* driver.get("https://www.redbus.in/");
		WebElement btnIcon = driver.findElement(By.id("sign-in-icon-down"));
		btnIcon.click();
		
		WebElement btnIcon2 = driver.findElement(By.id("hc"));
		btnIcon2.click();
		Thread.sleep(3000);
		//WebElement phnNum = driver.findElement(By.xpath("(//input[@placeholder='Enter your mobile number'])[2]"));
		WebElement phnNum = driver.findElement(By.xpath("(//div[@class='mobileInput clearfix'])[2]"));
		//(//div[@class='mobileInput clearfix'])[2]
		phnNum.sendKeys("900000123"); */
		
		
		
	}
	
}
