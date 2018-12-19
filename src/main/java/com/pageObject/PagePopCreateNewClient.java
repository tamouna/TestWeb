package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wordpress.testHiptestSelenium.BasePage;

public class PagePopCreateNewClient extends BasePage{

	public PagePopCreateNewClient(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='btn-search']")
	WebElement MyAccountButton;
	
	
	public void clickOnMyAccountButton(){
		MyAccountButton.click();
	}

}
