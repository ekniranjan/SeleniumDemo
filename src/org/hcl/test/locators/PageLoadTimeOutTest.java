package org.hcl.test.locators;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse-workspace\\SeleniumDay1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		                    //or
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES); 
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MILLISECONDS); // it throws TimeOutException
		
		driver.manage().window().maximize();
		//In java we have API --> Java.time
		//In java.time we have class called Instant and Instant class we hav now()
		Instant pageStartTime = Instant.now(); // now() provides present time n date
		System.out.println("Page starting time "+pageStartTime.toString());
		driver.get("https://www.instagram.com/");
		//driver.get("https://www.royalmansour.com/en/"); //this page takes 2 mins to load
		
		Instant pageEndTime = Instant.now();
		System.out.println("Page End Time "+pageEndTime.toString());
		//Duration also class Present in Java.time
		
		Duration between = Duration.between(pageStartTime, pageEndTime); //to find diff between start time n end time
		System.out.println("Page Load Out Time "+between.toMillis()+" milli seconds"); //1000 milliseconds = 1 second 
		driver.quit();
	}

}
