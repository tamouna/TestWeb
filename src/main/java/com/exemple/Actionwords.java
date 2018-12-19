package com.exemple;

import org.openqa.selenium.WebDriver;

import com.common.BasePage;
import com.pageObject.PageCreateAccount;
import com.pageObject.PagePopCreateAccount;
import com.pageObject.PageResearch;
public class Actionwords {
	
	BasePage basePage;
	WebDriver driver;

	public Actionwords(WebDriver driver) {
		this.driver = driver;
		basePage = new BasePage(driver);
	}

    public void createAnAccountForANewClient() {
        // TODO: Implement action: "Click on My Account"
    	PageResearch pageResearch = new PageResearch(driver);
    	pageResearch.clickMyaccount();
        //throw new UnsupportedOperationException();
        
    }

    public void fillInTheFormForTheNewClient(String eMAILADDRESS, String pASSWORD, String fIRSTNAME, String lASTNAME, String cOUNTRY, String tELEPHONE) {
        // TODO: Implement action: "Fill in the form : 
        // - EMAIL ADDRESS
        // - PASSWORD
        // - FIRST NAME
        // - LAST NAME
        // - COUNTRY
        // - TELEPHONE 
        // "
    	PageCreateAccount pageCreateAccount = new PageCreateAccount(driver);
    	pageCreateAccount.setEmail(eMAILADDRESS);
    	pageCreateAccount.setPassword(pASSWORD);
    	pageCreateAccount.setFirstName(fIRSTNAME);
    	pageCreateAccount.setLastName(lASTNAME);
    	pageCreateAccount.setCountry(cOUNTRY);
    	pageCreateAccount.setPhone(tELEPHONE);
    	
        // TODO: Implement action: "Click on By ticking this box"
        // TODO: Implement action: "Click on Create my account"
    	pageCreateAccount.setConformation();
    	pageCreateAccount.setCreateAccount();
    }


    public void nextStepOfCreatingAnAccount() {
        // TODO: Implement action: "Click to "
    	PagePopCreateAccount popAcount = new PagePopCreateAccount(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	popAcount.clickCreateMyaccount();
        //throw new UnsupportedOperationException();
    }
}