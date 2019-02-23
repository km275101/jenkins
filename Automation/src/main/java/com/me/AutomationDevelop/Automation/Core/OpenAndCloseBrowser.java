package com.me.AutomationDevelop.Automation.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class OpenAndCloseBrowser {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Stating........TestNGWith Parameter");
		String path = System.getProperty("user.dir");
		System.out.println("System.getProperty(\"user.dir\") :: "+ path+"/driver");
		System.setProperty("webdriver.chrome.driver", path+"/driver/chromedriver");
		String baseUrl = "https://www.amazon.in/";
		Thread.sleep(5000);
		driver = new ChromeDriver();
		System.out.println("Opned........");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
		System.out.println("Closing Browser Thankyou !!!!");
	}
  

}
