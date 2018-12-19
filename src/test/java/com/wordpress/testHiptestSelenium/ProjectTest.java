package com.wordpress.testHiptestSelenium;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.exemple.Actionwords;


public class ProjectTest {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		String baseURl;
		Configuration configuration;
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/mti/workspace/testHiptestSelenium/drivers/geckodriver.exe");
	    
		driver = new FirefoxDriver();
		baseURl = "https://bbhotels:bbhotels2018@preprod-fastly.moveon-hotelbb.com/en";
		driver.manage().window().maximize();
		Configuration.setdriver(driver);
		Configuration.open(baseURl);
		
	}

    public void creatAnAcount(String eMAILADDRESS, String fIRSTNAME, String lASTNAME, String pASSWORD, String tELEPHONE, String cOUNTRY) {
		Actionwords actionwords = new Actionwords();

        actionwords.createAnAccountForANewClient();
        actionwords.nextStepOfCreatingAnAccount();
        actionwords.fillInTheFormForTheNewClient(eMAILADDRESS, pASSWORD, fIRSTNAME, lASTNAME, cOUNTRY, tELEPHONE);
    }

    public void testCreatAnAcountUid2535b7736f514fff82a14887a12dce06() {
        creatAnAcount("foufou@yopmail.com", "foufou", "foufou", "FoufouFoufou1&", "+33785694231", "France");	
   
}
}