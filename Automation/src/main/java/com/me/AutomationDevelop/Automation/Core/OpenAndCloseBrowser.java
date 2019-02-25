package com.me.AutomationDevelop.Automation.Core;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class OpenAndCloseBrowser {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Stating........TestNGWith Parameter");
		String path = System.getProperty("user.dir");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);
		System.out.println("System.getProperty(\"user.dir\") :: "+ path+"/chromedriver");
		//System.setProperty("webdriver.chrome.driver", path+"/chromedriver");
		String baseUrl = "https://www.amazon.in/";
		Thread.sleep(5000);
		//driver = new ChromeDriver();
		driver = new RemoteWebDriver(capabilities);
		Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		
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
