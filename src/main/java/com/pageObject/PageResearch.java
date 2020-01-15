package com.pageObject;

import java.time.LocalDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;
import com.common.WebUtils;

public class PageResearch extends BasePage {
	
WebDriver driver;
	
	public PageResearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		// Madrid Fuenlabrada B&B Hotel
	}
		
	@FindBy(xpath="/html/body/div[1]/div/div[1]/header/div/div/div[2]/span")
	WebElement headerHistory;
	
	//@FindBy(xpath="//input[@id='edit-destination']")
	//WebElement destination;
	
	@FindBy(xpath="//input[@id='edit-from-date-input']")
	WebElement dateEntree;
	
	@FindBy(xpath="//div[@id='edit-inner-info']")
	WebElement guests;
	
	@FindBy(xpath="//input[@id='edit-search-submit']")
	WebElement searchButton;
	
	public void clickMyaccount(){
		headerHistory.click();
		System.out.println("test1");
		
	}
	
	public void entreTheHotelName(String hotelName){
		WebElement destination = driver.findElement(By.xpath("//input[@id='edit-destination']"));

		destination.click();
		destination.sendKeys(hotelName);
		
		System.out.println("//strong[contains(text(),'" + hotelName + "')]");
		

				
		
	}
	
	public void clickAddGuests(){
		guests.click();
		
	}
	
	public void dateEntree(String firstDay){
		dateEntree.click();
		String var = "22";
		LocalDate dateValue = WebUtils.checkDateFormat(firstDay);
		if (firstDay.equals("J")){
			WebElement dateOne = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']"));
			dateOne.click();
		}else{
			WebElement dateOne = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'" + var + "')]"));
		}
		
	}
	
	public void dateSortie(String lastDay){
		dateEntree.click();
		String var = "22";
		//LocalDate dateValue = WebUtils.checkDateFormat(firstDay);
		if (lastDay.equals("J")){
			WebElement dateOne = driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']"));
			dateOne.click();
		}else{
			WebElement dateOne = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default'][contains(text(),'" + var + "')]"));
			dateOne.click();
		}
		
	}
	
	
	
	public void clickSearchButton(){
		searchButton.click();
		
	}

}
