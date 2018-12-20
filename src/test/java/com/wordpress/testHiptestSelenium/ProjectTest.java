package com.wordpress.testHiptestSelenium;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.exemple.Actionwords;

public class ProjectTest {
		
	private WebDriver driver;
	private String baseURl;
	Actionwords actionwords;
		
	@Before
	public void beforeClass() {
		
		URL path=ProjectTest.class.getClassLoader().getResource("geckodriver.exe");

		//System.setProperty("webdriver.gecko.driver", "C:/Users/mouna/workspace/TestWeb/drivers/geckodriver.exe");
		 
		System.setProperty("webdriver.gecko.driver", path.getPath());
		
		driver = new FirefoxDriver();
		baseURl = "https://bbhotels:bbhotels2018@preprod-fastly.moveon-hotelbb.com/en";
		actionwords = new Actionwords(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURl);	
	}	
		
    public void creatAnAcount(String eMAILADDRESS, String fIRSTNAME, String lASTNAME, String pASSWORD, String tELEPHONE, String cOUNTRY){ 

        actionwords.createAnAccountForANewClient();
        actionwords.nextStepOfCreatingAnAccount();
        actionwords.fillInTheFormForTheNewClient(eMAILADDRESS, pASSWORD, fIRSTNAME, lASTNAME, cOUNTRY, tELEPHONE);
    }
    
    @Test
    public void testCreatAnAcountUid2535b7736f514fff82a14887a12dce06() {
        creatAnAcount("foufou@yopmail.com", "foufou", "foufou", "FoufouFoufou1&", "+33785694231", "France");	
   
}
    @After
	public void afterClass() {
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//driver.close();
	}
}