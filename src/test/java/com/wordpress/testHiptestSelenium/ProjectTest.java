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
    
    /*@Test
    public void testCreatAnAcountUid2535b7736f514fff82a14887a12dce06() {
        creatAnAcount("foufou@yopmail.com", "foufou", "foufou", "FoufouFoufou1&", "+33785694231", "France");	
   
}*/
    
    public void webTotalCheckinOnline(String firstName, String lastName, String phoneNumber, String email, String nationality, String newEmail, String newPhone, String password, String hotelName, String dateCheckin, String dateCheckout, String nbRoom, String nbAdults, String nbChildren, String room1, String room2, String room3, String option1, String option2, String option3, String nbOption1, String nbOption2, String nbOption3, String adultsRoom2, String adultsRoom1, String adultsRoom3, String childrenRoom1, String childrenRoom2, String childrenRoom3, String firstNameGuest1, String firstNameGuest2, String firstNameGuest3, String lastNameGuest1, String lastNameGuest2, String lastNameGuest3, String cardNumber, String expiryDate, String cvc, String nameCard, String cardLegalCheck, String notification, String checkLegalPayement, String legalCOIdentity, String legalTunnel, String bookingModification, String checkStayLoggedIn, String address, String zipcode, String city, String country, String citizenship, String ageChildrenRoom1, String ageChildrenRoom2, String ageChildrenRoom3) {
        // Tags: Auto:1
        // site web : réalisation du checkin online pour l'ensemble des chambres de la réservation (répétition du scénario NoAccountduringJ2NotPaidMyBookingModification)
        actionwords.webBookingUserNotConnectedNotPaid(hotelName, dateCheckin, dateCheckout, nbRoom, nbAdults, nbChildren, room1, room2, room3, option1, option2, option3, nbOption1, nbOption2, nbOption3, firstName, lastName, phoneNumber, email, legalTunnel, adultsRoom1, adultsRoom3, childrenRoom1, childrenRoom2, childrenRoom3, lastNameGuest3, lastNameGuest2, lastNameGuest1, firstNameGuest1, firstNameGuest2, firstNameGuest3, adultsRoom2, expiryDate, cvc, cardNumber, nameCard, cardLegalCheck, address, zipcode, city, country, citizenship, ageChildrenRoom1, ageChildrenRoom2, ageChildrenRoom3);
        actionwords.webCheckinOnlineStep5();
        actionwords.webCheckCheckinOnlineMyBookingButton();
        actionwords.webCheckCheckinOnlineEmail();
        actionwords.webCheckinOnlineMyBookingButtonClick(room1);
        actionwords.webCheckinOnlineIdentityModification(newEmail, newPhone);
        actionwords.webCheckinOnlineIdentityChoiceNotification(notification);
        actionwords.webCheckinOnlineIdentityLegal(legalCOIdentity);
        actionwords.webCheckinOnlineIdentityToPaiementClick();
        actionwords.webCheckinOnlinePaiement(cardNumber, cvc, expiryDate, nameCard, checkLegalPayement);
        actionwords.webCheckCheckinOnlineNoButton(room1);
        actionwords.webCheckCheckinOnlineDeactiveButton(room1);
        actionwords.webCheckCheckinOnlineDeactiveEmail();
        actionwords.webCheckinOnlineResendCode(room1);
        actionwords.webCheckCheckinOnlineEmailResendCode();
        actionwords.webCheckinOnlineMyBookingButtonClick(room2);
        actionwords.webCheckinOnlineIdentityChoiceNotification(notification);
        actionwords.webCheckinOnlineIdentityLegal(legalCOIdentity);
        actionwords.webCheckinOnlineIdentityToPaiementClick();
        actionwords.webCheckinOnlinePaiement(cardNumber, cvc, expiryDate, nameCard, checkLegalPayement);
        actionwords.webCheckCheckinOnlineNoButton(room1);
        actionwords.webCheckCheckinOnlineNoButton(room2);
        actionwords.webCheckCheckinOnlineDeactiveButton(room2);
        actionwords.webCheckCheckinOnlineDeactiveEmail();
    }

    @Test 
    public void testWebTotalCheckinOnlineMultiRoomMulltiNightOptionFrAdultsUidae782c04501040e993ccc581405503f0() {
        webTotalCheckinOnline("prenomJDD1", "nomJDD1", "+33677889966", "email@yopmail.com", "au choix", "newemail@yopmail.com", "+33611223344", "NA", "Madrid Fuenlabrada", "J", "J+2", "2", "4'", "0", "Double Room", "Family Room", "NA", "BREAKFAST", "NA", "NA", "\'4\'", "NA", "NA", "\'2\'", "\'2\'", "\'0\'", "\'0\'", "\'0\'", "\'0\'", "guest1", "guest2", "NA", "guest1", "guest2", "NA", "\'5136333333333335\'", "10/2020", "\'737\'", "carte credit", "yes", "no", "yes", "yes", "yes", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA", "NA");
    }
    
    @After
	public void afterClass() {
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	//driver.close();
	}
}