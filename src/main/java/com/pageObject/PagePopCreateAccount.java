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
	
	@FindBy(xpath="//*[@id=\"user-menu-block-click-here-link\"]")
	WebElement element;
	
	public void clickCreateMyaccount(){
		System.out.println("test5");
		//element = driver.findElement(By.xpath("//*[@id=\"user-menu-block-click-here-link\"]"));
		System.out.println("test6");
		element.click();
		System.out.println("test7");

		
	}

}
