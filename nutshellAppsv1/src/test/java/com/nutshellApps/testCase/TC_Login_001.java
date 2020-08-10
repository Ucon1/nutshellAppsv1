package com.nutshellApps.testCase;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.nutshellApps.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass{
	
	@Test
	public void Login()
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
	
		if(driver.getTitle().equals("Nutshell Apps Dashboard"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
