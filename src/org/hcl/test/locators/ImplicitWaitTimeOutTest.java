package org.hcl.test.locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitTimeOutTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//      or
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //this same waiting time applicable for all findelements in this webdriver session 
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//EXplicit time wait
//		WebDriverWait exp= new WebDriverWait(driver, Duration.ofSeconds(20));
//		WebElement textUser = exp.until(ExpectedConditions.visibilityOfElementLocated(By.name("")));
//		
//		textUser.sendKeys("tesTEXP");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize( new Dimension(1000, 1000));
		Wait waits=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(Throwable.class);
		//
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("Nani text 1");
		
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("Nani text 2");
	}

}
