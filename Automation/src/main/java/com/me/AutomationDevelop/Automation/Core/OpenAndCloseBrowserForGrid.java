package com.me.AutomationDevelop.Automation.Core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
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
		//DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
		//capabilities.setJavascriptEnabled(true);
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//capabilities.setPlatform(Platform.WIN8_1);
		//capabilities.setBrowserName("chrome");
		String baseUrl = "https://www.amazon.in/";
		try {
			System.out.println(baseUrl);
			driver = new RemoteWebDriver(new URL("http://192.168.2.8:4444/wd/hub"), options);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
