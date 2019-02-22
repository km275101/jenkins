package com.me.AutomationDevelop.Automation;

import org.testng.annotations.Test;


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Unit test for simple App.
 */
public class AmazonTest 
{
	WebDriver driver;
	 @Test
	  public void f() throws InterruptedException {
		  
		 /* System.setProperty("webdriver.gecko.driver","/media/kammy/Local Disk/iMp/geckodriver");
		  
		  System.out.println("Debug 1");
		  DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		  System.out.println("Debug 2");
		  capabilities.setCapability("marionette", true);
		  System.out.println("Debug 3");
		  WebDriver driver = new FirefoxDriver(capabilities);
		  System.out.println("Debug 4");*/
		 
		 System.setProperty("webdriver.chrome.driver","/media/kammy/Local Disk1/iMp/chromedriver_linux64/chromedriver");
		   driver = new ChromeDriver();
		  driver.get("https://www.google.com/?gws_rd=ssl");
		  
		  /*driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("One plus 6");
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.RETURN);*/
		  
		  Thread.sleep(5000);
		  
	      String s = driver.getTitle();
	      System.out.println(s +" ------ "+ s);
	    
	      Thread.sleep(5000);
	      driver.close();
	      driver.quit();
	      
	  }

	}
