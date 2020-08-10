package com.nutshellApps.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class screen1Page {
	
	WebDriver ldriver;
	public screen1Page(WebDriver rdriver) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how = How.XPATH, using="//*[@id=\"menu\"]/div/ul/li[4]/a")
	@CacheLookup
	WebElement lnkApps;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"folder_25\"]/div[1]/div[2]")
	@CacheLookup
	WebElement folderCharlesUkpai;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"folder_27\"]/div[1]/div[2]")
	@CacheLookup
	WebElement folderTutorial;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"microapp_165\"]/div[1]/div[2]")
	@CacheLookup
	WebElement iconHelloWorld;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"canvas-preview\"]")
	@CacheLookup
	WebElement lnkPreview; 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"Name field\"]")
	@CacheLookup
	WebElement txtName;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"microapp-screen\"]/div/div[3]/div/input[2]")
	WebElement btnsayHello;
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//*[@id=\"microapp-screen\"]/div/div[2]/div/input[2]")
	WebElement btnsendEmail;
	
	public void clickApps() {
		lnkApps.click();
	}
	
	public void clickfolderCharlesUkpai() {
		Actions action = new Actions(ldriver);
		action.doubleClick(folderCharlesUkpai).perform();
	}
	
	public void clickfolderTutorial() {
		Actions action = new Actions(ldriver);
		action.doubleClick(folderTutorial).perform();
	}
	
	public void clickIconHelloWorld() {
		Actions action = new Actions(ldriver);
		action.doubleClick(iconHelloWorld).perform();
	}
	
	public void clickPreview() {
		lnkPreview.click();
	}
	
	public void enterName(String eName) {
		txtName.sendKeys(eName);
	}
		
	public void clicksayHelloSubmit() {
		btnsayHello.click();
	}
	
	public void clicksendEmailSubmit() {
		btnsendEmail.click();
	}
}
