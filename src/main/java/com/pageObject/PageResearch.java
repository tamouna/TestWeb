package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;

public class PageResearch extends BasePage {
	
WebDriver driver;
	
	public PageResearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	@FindBy(xpath="/html/body/div[1]/div/div[1]/header/div/div/div[2]/span")
	WebElement headerHistory;
	
	public void clickMyaccount(){
		headerHistory.click();		
	}

}
