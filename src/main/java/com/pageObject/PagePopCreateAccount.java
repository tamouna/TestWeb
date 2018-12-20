package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;

public class PagePopCreateAccount extends BasePage {

	public PagePopCreateAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//@FindBy(xpath="//*[@id=\"user-menu-block-click-here-link\"]")
	@FindBy(xpath="//*[@id='user-menu-block-click-here-link']")
	WebElement element;
	
	public void clickCreateMyaccount(){
		//element = driver.findElement(By.xpath("//*[@id=\"user-menu-block-click-here-link\"]"));
		element.click();
	}

}
