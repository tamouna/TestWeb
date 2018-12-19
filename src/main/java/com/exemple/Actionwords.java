package com.exemple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageObject.PagePopCreateNewClient;
import com.wordpress.testHiptestSelenium.Configuration;

public class Actionwords {
	
	WebDriver driver;
	

    public void createAnAccountForANewClient() {
        // TODO: Implement action: "Click on My Account"
    	driver = Configuration.driver();
    	PagePopCreateNewClient page1 = new PagePopCreateNewClient(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	page1.clickOnMyAccountButton();
    	
        throw new UnsupportedOperationException();
        
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
        // TODO: Implement action: "Click on By ticking this box"
        // TODO: Implement action: "Click on Create my account"
    	
        throw new UnsupportedOperationException();
    }

    public void fillInTheFormTheWebsite(String utilisateur, String motDePasse) {
        // TODO: Implement action: String.format("In the filed Utilisateur and Mot de passe set: 
        // -%s
        // -%s", Utilisateur, MotDePasse)
        // TODO: Implement action: "Click on OK"
        throw new UnsupportedOperationException();
    }

    public void nextStepOfCreatingAnAccount() {
        // TODO: Implement action: "Click to "
        throw new UnsupportedOperationException();
    }
}