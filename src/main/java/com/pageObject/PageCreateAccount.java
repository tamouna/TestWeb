package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;

public class PageCreateAccount extends BasePage {

	public PageCreateAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"edit-register-mail\"]")
	WebElement email;
		
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"edit-register-first-name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"edit-register-last-name\"]")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"edit-register-country\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"edit-phone-0\"]")
	WebElement telephone;
	
	@FindBy(xpath="	//*[@id=\"edit-preferences-terms-conditions-wrapper\"]/div/label/span")
	WebElement confirmation;
	
	@FindBy(xpath="	//*[@id=\"edit-submit--2\"]")
	WebElement createAccount;
	
	public void setEmail(String eml){
		email.sendKeys(eml);		
	}
	
	public void setPassword(String psw){
		password.sendKeys(psw);		
	}
	
	public void setFirstName(String fName){
		firstName.sendKeys(fName);
	}
	
	public void setLastName(String lName){
		lastName.sendKeys(lName);
	}
	
	public void setCountry(String count){
		country.click();
		country.sendKeys(count);
	}
	
	public void setPhone(String phone){
		telephone.click();
		telephone.sendKeys(phone);
	}
	
	public void setConformation(){
		confirmation.click();
	}
	
	public void setCreateAccount(){
		createAccount.click();
	}

}
