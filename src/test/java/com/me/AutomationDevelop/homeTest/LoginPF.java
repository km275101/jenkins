package com.me.AutomationDevelop.homeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.me.AutomationDevelop.Automation.Core.Initialize;


public class LoginPF extends Initialize{
	@Test
	public void LoginAmazon()  {
		login.clickYourOrders();
		login.LoginExcel();
		pdp.enterProductName();
		pdp.clickSearchButton();
	
}
}
