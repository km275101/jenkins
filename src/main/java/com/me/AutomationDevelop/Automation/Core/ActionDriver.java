package com.me.AutomationDevelop.Automation.Core;

import java.io.File;
import java.io.IOException;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionDriver {
	
	

	public static WebDriver driver;
	

	public ActionDriver(WebDriver driver) {
		this.driver = driver;
		}
	
	public static void highlightElement(WebElement element) throws InterruptedException {
        for (int i = 0; i <2; i++) {
        	Thread.sleep(2000);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
            }
        }
	
	public static void reportLog(String message) throws IOException {
		TakesScreenshot sc = (TakesScreenshot)driver;
		File srFfile = sc.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\kamlesh.maurya\\git\\jenkins\\Automation\\screenShot\\"+message+".png");
		System.out.println("Output file is :"+destFile);
		FileUtil.copyFile(srFfile, destFile);
	}
	
	}


