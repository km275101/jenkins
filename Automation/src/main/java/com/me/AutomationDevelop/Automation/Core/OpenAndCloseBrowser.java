package com.me.AutomationDevelop.Automation.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class OpenAndCloseBrowser {
	
public static	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException {
		System.out.println("Starting........TestNGWith Parameter");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C://SW And ImpDocs//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();     
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setJavascriptEnabled(true);*/
		System.out.println("user dir "+ path+"\\chromedriver");
		//System.setProperty("webdriver.chrome.driver", path+"/chromedriver");
		String baseUrl = "https://www.amazon.in/";
		Thread.sleep(5000);
		//driver = new ChromeDriver();
		//driver = new RemoteWebDriver(capabilities);
		//Capabilities actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		
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
