package com.me.AutomationDevelop.Automation.Core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class OpenAndCloseBrowserForGrid {
	public static RemoteWebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException, MalformedURLException {
		System.out.println("Stating........TestNGWith Parameter");
		/*String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "E://SW//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();     */
		DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
		capabilities.setJavascriptEnabled(true);
		capabilities.setPlatform(Platform.WIN8_1);
		capabilities.setBrowserName("chrome");
		String baseUrl = "https://www.amazon.in/";
		driver = new RemoteWebDriver(new URL("http://192.168.2.8:4444/wd/hub"), capabilities);
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
