package com.nutshellApps.testCase;

import java.io.IOException;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.nutshellApps.pageObjects.LoginPage;
import com.nutshellApps.pageObjects.screen1Page;

public class TC_Screen1Test_001 extends BaseClass {
	
	@Test
	public void Screen1() throws InterruptedException, IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		
		lp.setPassword(password);
	
		lp.clickSubmit();
		
		//Thread.sleep(3000);
		
		screen1Page addName = new screen1Page(driver);
		Thread.sleep(3000);
		addName.clickApps();
		
		Thread.sleep(3000);
		
		addName.clickfolderCharlesUkpai();
		
		Thread.sleep(3000);
		
		addName.clickfolderTutorial();
		
		Thread.sleep(3000);
		
		addName.clickIconHelloWorld();
		Thread.sleep(50000);
		
		addName.clickPreview();
		
		Thread.sleep(30000);
		
		Set<String> handle = driver.getWindowHandles();//Switch to the new preview window
		//System.out.println(handle);
		String secondWinHandle = driver.getWindowHandle(); handle.remove(secondWinHandle);
		driver.switchTo().window(secondWinHandle); //Switch to new window
		
		addName.enterName("Charkes Ukpai");
		
		addName.clicksayHelloSubmit();
		
		addName.clicksendEmailSubmit();

		Thread.sleep(3000);
		
		boolean res = driver.getPageSource().contains("/eDocs-AppBuilder/img/editor/preview/preview-r.png");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
