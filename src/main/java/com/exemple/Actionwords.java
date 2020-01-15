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
    	pageCreateAccount.setPhone(tELEPHONE);
    	pageCreateAccount.setCountry(cOUNTRY);

    	
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
    
    public void signIn(String email, String password, String checkStayLoggedIn) {
        // TODO: Implement action: "Clic on my account"
        // TODO: Implement action: "Clic on Login"
        // TODO: Implement action: String.format("Enter the email address = %s", email)
        // TODO: Implement action: String.format("Enter the password = %s", password)
        // TODO: Implement action: String.format("Check the Stay logged in box : %s", check_stay_logged_in)
        // TODO: Implement action: "Click on Sign in"
        throw new UnsupportedOperationException();
    }

    public void createAccountPath(String freeText) {
        // TODO: Implement action: "Clic on my account"
        // TODO: Implement action: "Clic on Login"
        // TODO: Implement action: "Clic on Create your account"
        throw new UnsupportedOperationException();
    }

    public void searchAHotelFromHomePage(String where, String dateCheckIn, String dateCheckOut, String nbRooms, String nbAdults, String nbChildren) {
        // TODO: Implement action: " Go to the B&B home page"
    	
        // TODO: Implement action: String.format("Select the search criteria :
        //  - Where : %s
        //  - Check in : %s
        //  - Check out : %s
        //  - Rooms : %s
        //  - Adults : %s
        //  - Children : %s", where, dateCheckIn, dateCheckOut, nbRooms, nbAdults, nbChildren)
        // TODO: Implement action: "Clic on button \"Search\""
    	
    	PageResearch pageResearch = new PageResearch(driver);
    	pageResearch.entreTheHotelName(where);
    }

    public void forgottenPasswordPath() {
        // TODO: Implement action: "Clic on my account"
        // TODO: Implement action: "Clic on Login"
        // TODO: Implement action: "Clic on Forgotten password?"
        throw new UnsupportedOperationException();
    }

    public void signOut() {
        clickOnTheToprightAccountButton();
        // TODO: Implement action: "Click on Log out in the pop-in"
        throw new UnsupportedOperationException();
    }

    public void connectToSalesforce(String uRL, String login, String password) {
        // TODO: Implement action: String.format("Connect to URL %s using Login = %s and Password = %s", URL, Login, Password)
        throw new UnsupportedOperationException();
    }

    public void connectToYopmailMailbox(String email) {
        // TODO: Implement action: "Launch a web browser and connect to URL \"http://www.yopmail.com/\" "
        // TODO: Implement action: String.format("In the textbox, fill the email address : %s ", email)
        // TODO: Implement action: "Click on \"Vérifier les mails\""
        throw new UnsupportedOperationException();
    }

    public void startARoomBooking(String room) {
        // TODO: Implement action: String.format("In the hotel card, select the room = %s by clicking on the matching \"Add to cart\" button", room)
        // TODO: Implement action: "Click on \"Your cart\" green zone "
        // TODO: Implement result: "Check that a \"Choose your options\" window is displayed, where a pop-in indicates:
        // - the chosen hotel
        // - the check-in and check-out dates
        // - the chosen room
        // - the booking amount
        // - a green button that allows to skip this \"Choose your options\" step"
        throw new UnsupportedOperationException();
    }

    public void procedureConnectToVerticalBooking(String url, String username, String login, String urlwebmail, String loginBal, String pwdBal) {
        // TODO: Implement action: String.format("Connect to URL : %s", url)
        // TODO: Implement action: String.format("Click on Login, then in CRS/Modules section, fill the following credentials : 
        // Username : %s
        // Password : %s
        // Then click on Login button
        // The procedure is completed when connection is accepted. If not, follow the steps below.", username, login)
        // TODO: Implement action: "When the user hasn't logged in yet to Vertical Booking using this workstation, connection is rejected and a message with a Submit button is displayed. 
        // Click on this Submit button to send a validation message to the functionnal mailbox of Kereval's B&B project."
        // TODO: Implement action: String.format("Connect to %s using the workstation that needs to access Vertical Booking, then authenticate to  the functionnal mailbox :
        // - login = %s
        // - password = %s", urlwebmail, login_bal, pwd_bal)
        // TODO: Implement action: "Get the latest mail that the mailbox should have received. It contains a validation link that will allow the current workstation to connect to Salesforce.
        // Click on this link to open Salesforce URL"
        // TODO: Implement action: String.format("Click on Login, then in CRS/Modules section, fill the following credentials :  
        // - Username : %s 
        // - Password : %s 
        // Then click on Login button", username, login)
        throw new UnsupportedOperationException();
    }

    public void checkAvailabilityVerticalBookingWIP(String hotel, String roomType, String startDate, String endMonth) {
        openExtranetverticalbookingcom();
        // TODO: Implement action: "Check that you are in the Group: B & B DEMO CHAIN ​​Otherwise click the Group button in the top menu ofthe application"
        // TODO: Implement action: "From the Extranet Vertical Booking portal, on the left menu click on \"Avail."
        clickOnAvailAndBookingRulesThenAvailabiliyByProperty();
        fillInTheAvailabilityPeriodStartDateEndMonthThenClickOnShow("", "");
        selectHotelHotelName(hotel);
        // TODO: Implement action: String.format("Select from the Room filter list : %s", Room_Type)
        // TODO: Implement action: String.format("Check in the graphs generated for each month the availability of a sufficient number of chamber type %s", Room_Type)
        throw new UnsupportedOperationException();
    }

    public void completeABookingVerticalBookingChecking(String rechercheType, String startDate, String endDate, String hotelList, String reservationCode) {
        // TODO: Implement action: "From the Extranet Vertical Booking portal, on the left menu click on \"Reservation Check-in\""
        // TODO: Implement action: "Contrôlez que vous être dans le Group: B&B DEMO CHAIN Sinon cliquez sur le bouton Group dans le menu supérieur de l'application"
        // TODO: Implement action: String.format("Renseignez le type de recherche %s
        // Renseignez les informations complémentaires : 
        // Start date = %s
        // End date = %s
        // Hotel list = %s
        // Reservation code = %s", RechercheType, Start_Date, End_Date, Hotel_List, Reservation_Code)
        // TODO: Implement action: "Cliquez sur Submit"
        // TODO: Implement action: String.format("Dans la liste de résultat en bas de la page cliquez sur le Code %s correspondant à votre recherche", Reservation_Code)
        // TODO: Implement action: "Vérifier les informations de réservation:
        // - Détail sur la chambre, la durée, les tarifs et les options
        // -Détail sur le canal et la date de la réservation
        // -Détail sur le client Guest detail
        // -Détail sur le type de paiement
        // "
        throw new UnsupportedOperationException();
    }

    public void checkRatePlanVerticalBooking(String hotel, String rateType, String rateLevel, String information) {
        // TODO: Implement action: "Contrôlez que vous être dans le Group: B&B DEMO CHAIN Sinon cliquez sur le bouton Group dans le menu supérieur de l'application"
        // TODO: Implement action: "Depuis le portail Extranet Vertical Booking, dans le menu gauche cliquez sur \"Avail. And Rates\""
        // TODO: Implement action: "Cliquez sur \"Products - Rates\" puis \"Edit products (Rate plans)\""
        // TODO: Implement action: "Sélectionnez les options de visibilité All.
        // "
        // TODO: Implement action: String.format("Sélectionnez l'hotel %s dans la liste des hôtels", Hotel)
        // TODO: Implement action: "Vérifiez la liste des Rates disponibles"
        // TODO: Implement action: String.format("Sélectionnez le Détail du Rate %s en cliquant sur le bouton correspondant au {RateLevel}: P/ProductRate, G/RateGrid, D/ConditionDerivé", Rate)
        // TODO: Implement action: String.format("Vérifier l'information %s", Information)
        throw new UnsupportedOperationException();
    }

    public void completeABookingFastNoCheck(String email, String hotelName, String checkinDate, String checkoutDate, String adultsNumber, String childrenNumber, String roomDescription, String roomsNumber, String optionRequest, String enableIAmOccupant, String occupantFirstname, String occupantLastname, String leisureOrBusiness, String subscription, String cardholderName, String cardNumber, String expirationDate, String cryptogram, String options) {
        // TODO: Implement action: " Go to the B&B home page"
        // TODO: Implement action: String.format("Select the search criteria :  
        // - Where : %s  
        // - Check in : %s  
        // - Check out : %s  
        // - Rooms : %s  
        // - Adults : %s  
        // - Children : %s", hotel_name, check-in_date, check-out_date, rooms_number, adults_number, children_number)
        // TODO: Implement action: "Clic on button \"Search\""
        // TODO: Implement action: String.format("In the hotel card, select the room = %s by setting its amount on 1", room_description)
        // TODO: Implement action: "Click on \"Book now\" green zone "
        // TODO: Implement result: "Check that a \"Choose your options\" window is displayed, where a pop-in indicates: 
        // - the chosen hotel 
        // - the check-in and check-out dates 
        // - the chosen room 
        // - the booking amount 
        // - a green button that allows to skip this \"Choose your options\" step"
        // TODO: Implement action: String.format("Fill the following request in the \"I have a special request\" textbox : %s", option_request)
        // TODO: Implement action: String.format("Select the following options : %s", options)
        clickTheGreenButtonInTheHotelPopinGoToToNextStep();
        // TODO: Implement action: String.format("In Who's travelling section, set the following properties:
        // - I am the occupant of the room : %s
        // - Firstname : %s
        // - Lastname : %s
        // - You realise this stay as : %s
        // - I subscribe to B&B Hotels Newsletter : %s", enable_I_am_occupant, occupant_firstname, occupant_lastname, leisure_or_business, subscription)
        checkBoxIAcceptTheTermsOfConditionsOfBBHotelsUserCreationFromBooking("");
        clickOnNextStep();
        // TODO: Implement action: String.format("Fill the payment information :
        // - Cardholder name : %s
        // - Card number : %s
        // - Expiration date : %s
        // - Cryptogram : %s", cardholder_name, card_number, expiration_date, cryptogram)
        clickOnBookNow();
        throw new UnsupportedOperationException();
    }

    public void startAContactRequest() {
        clickOnTheToprightAccountButton();
        // TODO: Implement action: "Click on Contact our customer service"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart1OneRoom(String roomDescription, String rateCode, String garantee, String amount) {
        // TODO: Implement action: String.format("In the hotel card, select the following room by increasing its amount = 
        // - Description : %s 
        // - Rate code : %s
        // - Garantee : %s
        // - Amount : %s", room_description, rate_code, garantee, amount)
        // TODO: Implement result: "Check that the room is added in the \"Book now\" popin, with its description, capacity and price"
        // TODO: Implement action: "Click on \"Book now\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart2(String options, String amountOptions, String specialRequest) {
        // TODO: Implement result: "Check that the current step is 2 (Options), and a \"Choose your options\" section is displayed"
        // TODO: Implement result: "Check that a pop-in indicates:  
        // - the chosen hotel   
        // - the check-in and check-out dates   
        // - the chosen rooms  
        // - the booking amount   
        // - a green button that allows to skip this \"Choose your options\" step"
        // TODO: Implement result: "Check that the rooms and the amount are still the same as before"
        // TODO: Implement action: String.format("Select the following options : %s with the respective amounts = %s", options, amount_options)
        // TODO: Implement result: "Check that the selected options, their amount and their price are added under the rooms in the popin"
        // TODO: Implement result: "Check that the total amount is updated as options are added, and its value is correct"
        // TODO: Implement action: String.format("Fill the special request = %s", special_request)
        // TODO: Implement action: "Click on \"Next step\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart3OneRoomWebAccount(String userIsOccupant, String user, String password) {
        // TODO: Implement result: "Check that the current step is 3 (Contact details), and a Contact details\" window is displayed with: 
        // - a new customer form and a \"sign in and save time\" link  when no user is currently logged in, or a Welcome back section with user information when one is currently logged in 
        // - a Who's travelling section 
        // - a B&B newsletter subscription checkbox 
        // - a terms acceptance checkbox"
        // TODO: Implement result: "Check that \"I am the occupant of the room\" is enabled"
        // TODO: Implement result: "Check that a pop-in indicates:   
        // - the chosen hotel   
        // - the check-in and check-out dates    
        // - the chosen room 
        // - the chosen options    
        // - the booking amount    
        // - a green button that allows to process to \"Next step\""
        // TODO: Implement action: String.format("If no user is currently logged in, click on \"Sign in and save time\" to sign in with 
        // user = %s 
        // and password = %s", user, password)
        // TODO: Implement result: "Check that the form now displays a Welcom back section with the logged in user information"
        // TODO: Implement action: String.format("Set \"I am the occupant of the room\" on %s
        // ", user_is_occupant)
        // TODO: Implement action: "If \"I am the occupant of the room\" is disabled, fill valid values for Firstname and Lastname"
        // TODO: Implement action: "Check the box \"I accept Terms of conditions by B&B Hotels\""
        // TODO: Implement action: "Click on \"Next step\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart4Begin() {
        // TODO: Implement result: "Check that the current step is 4 (Payment), and a \"Payment and reservation\" section is displayed with
        // - the total price
        // - the payment options"
        // TODO: Implement result: "Check that a pop-in indicates:    
        // - the chosen hotel    
        // - the check-in and check-out dates     
        // - the chosen rooms  
        // - the chosen options  
        // - the booking amount     
        // - a green button that allows to \"Book now\""
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart4CreditCardGarantee(String cardholderName, String cardNumber, String expirationDate, String cryptogram) {
        // TODO: Implement action: "Select option \"Arrival later than 19:00\""
        // TODO: Implement result: "Check that credit card usual fields are displayed"
        // TODO: Implement action: String.format("Fill the following values:
        // - Cardholder name  = %s
        // - Card number = %s
        // - Expiration date = %s
        // - Cryptogram = %s", cardholder_name, card_number, expiration_date, cryptogram)
        // TODO: Implement action: "Click on \"Book now\""
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart4OnlinePayment(String cardholderName, String cardNumber, String expirationDate, String cryptogram) {
        // TODO: Implement action: "Select option \"Online payment\""
        // TODO: Implement result: "Check that credit card usual fields are displayed"
        // TODO: Implement action: String.format("Fill the following values: 
        // - Cardholder name  = %s
        // - Card number = %s 
        // - Expiration date = %s 
        // - Cryptogram = %s", cardholder_name, card_number, expiration_date, cryptogram)
        // TODO: Implement action: "Click on \"Book now\""
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart1SeveralRooms(String roomDescription1, String rateCode1, String garantee1, String amount1, String roomDescription2, String rateCode2, String garantee2, String amount2, String roomDescription3, String rateCode3, String garantee3, String amount3) {
        // TODO: Implement action: String.format("In the hotel card, select the following room by increasing its amount :
        // - Description : %s 
        // - Rate code : %s
        // - Garantee : %s
        // - Amount : %s", room_description_1, rate_code_1, garantee_1, amount_1)
        // TODO: Implement result: "Check that the room is added in the \"Book now\" popin, with its description, capacity and price"
        // TODO: Implement action: String.format("Select the following room by increasing its amount : 
        // - Description : %s 
        // - Rate code : %s
        // - Garantee : %s
        // - Amount : %s", room_description_2, rate_code_2, garantee_2, amount_2)
        // TODO: Implement result: "Check that the room is added in the \"Book now\" popin, with its description, capacity and price"
        // TODO: Implement action: String.format("Select the following room by increasing its amount :  
        // - Description : %s  
        // - Rate code : %s 
        // - Garantee : %s 
        // - Amount : %s", room_description_3, rate_code_3, garantee_3, amount_3)
        // TODO: Implement result: "Check that the room is added in the \"Book now\" popin, with its description, capacity and price"
        // TODO: Implement action: "Click on \"Book now\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart3SeveralRoomsWebAccount(String user, String password) {
        // TODO: Implement result: "Check that the current step is 3 (Options), and a Contact details\" window is displayed with:  
        // - a new customer form and a \"sign in and save time\" link  when no user is currently logged in, or a Welcome back section with user information when one is currently logged in  
        // - a Who's travelling section  
        // - a B&B newsletter subscription checkbox  
        // - a terms acceptance checkbox"
        // TODO: Implement result: "Check that \"I am the occupant of the room\" button is enabled for the first room, and disabled for the others"
        // TODO: Implement result: "Check that the Firstname and Lastname fields are displayed for each room, except the first one"
        // TODO: Implement action: "Check that a pop-in indicates:   
        // - the chosen hotel    
        // - the check-in and check-out dates     
        // - the chosen rooms  
        // - the chosen options     
        // - the booking amount     
        // - a green button that allows to process to \"Next step\""
        // TODO: Implement action: String.format("If no user is currently logged in, click on \"Sign in and save time\" to sign in with 
        // user = %s 
        // and password = %s", user, password)
        // TODO: Implement result: "Check that the form now displays a Welcom back section with the logged in user information"
        // TODO: Implement action: "Enable the button \"I am the occupant of the room\" for whatever room, and fill valid values in Firstname and Lastname fields for each other rooms"
        // TODO: Implement action: "Check the box \"I accept Terms of conditions by B&B Hotels\""
        // TODO: Implement action: "Click on \"Next step\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart3OneRoomCRMAccount(String userIsOccupant) {
        // TODO: Implement result: "Check that the current step is 3 (Contact details), and a Contact details\" window is displayed with:  
        // - a new customer form and a \"sign in and save time\" link  when no user is currently logged in, or a Welcome back section with user information when one is currently logged in  
        // - a Who's travelling section  
        // - a B&B newsletter subscription checkbox  
        // - a terms acceptance checkbox"
        // TODO: Implement result: "Check that \"I am the occupant of the room\" is enabled"
        // TODO: Implement result: "Check that a pop-in indicates:    
        // - the chosen hotel    
        // - the check-in and check-out dates     
        // - the chosen room  
        // - the chosen options     
        // - the booking amount    
        // - a green button that allows to process to \"Next step\""
        // TODO: Implement action: "Sign out if a user is currently logged in"
        // TODO: Implement action: "Fill the account fields : - Email = whatever valid email which is not an existing account. Email is to remember. 
        // - I want to create an account = Disabled
        // Fill other mandatory fields with valid values."
        // TODO: Implement action: String.format("Set \"I am the occupant of the room\" on %s", user_is_occupant)
        // TODO: Implement action: "If \"I am the occupant of the room\" is disabled, fill valid values for Firstname and Lastname"
        // TODO: Implement action: "Check the box \"I accept Terms of conditions by B&B Hotels\""
        // TODO: Implement action: "Click on \"Next step\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart3SeveralRoomsCRMAccount() {
        // TODO: Implement result: "Check that the current step is 3 (Options), and a Contact details\" window is displayed with:   
        // - a new customer form and a \"sign in and save time\" link  when no user is currently logged in, or a Welcome back section with user information when one is currently logged in   
        // - a Who's travelling section   
        // - a B&B newsletter subscription checkbox   
        // - a terms acceptance checkbox"
        // TODO: Implement result: "Check that \"I am the occupant of the room\" button is enabled for the first room, and disabled for the others"
        // TODO: Implement result: "Check that the Firstname and Lastname fields are displayed for each room, except the first one"
        // TODO: Implement result: "Check that a pop-in indicates:     
        // - the chosen hotel     
        // - the check-in and check-out dates      
        // - the chosen room   
        // - the chosen options      
        // - the booking amount    
        // - a green button that allows to process to \"Next step\""
        // TODO: Implement action: "Sign out if a user is currently logged in"
        // TODO: Implement action: "Fill the account fields : - Email = whatever valid email which is not an existing account. Email is to remember. 
        // - I want to create an account = Disabled
        // Fill other mandatory fields with valid values."
        // TODO: Implement action: "Enable the button \"I am the occupant of the room\" for whatever room, and fill valid values in Firstname and Lastname fields for each other rooms"
        // TODO: Implement action: "Check the box \"I accept Terms of conditions by B&B Hotels\""
        // TODO: Implement action: "Click on \"Next step\" button"
        throw new UnsupportedOperationException();
    }

    public void completeABookingPart5Confirmation() {
        // TODO: Implement result: "Check that a \"Reservation confirmed\" window is displayed, with the following information:
        // - User firstname and lastname
        // - Reservation number - This number is to remember for later checking
        // - Hotel name
        // - Check-in and check-out dates
        // - Number of nights
        // - Amount payed/to pay for each payment method
        // - Map with hotel location
        // - Booking detail, with a enabled \"Cancel\" button for each cancellable room"
        // TODO: Implement result: "Check that the user has received an email with these information"
        throw new UnsupportedOperationException();
    }

    public void completeABookingWebAccountChecking(String email, String password) {
        // TODO: Implement action: String.format("If the user %s is not logged in, Sign in to account using email = %s and password = %s", email, email, password)
        // TODO: Implement action: "In the user popin menu, click the link \"My bookings\""
        // TODO: Implement result: "Check that the completed booking is displayed in the list, with the following information:
        // - Hotel name
        // - Reservation number
        // - Check-in and check-out dates, number of nights
        // - Occupant name, if different than current user (?)
        // - Booked rooms description and price
        // - Selected options with price
        // - A \"Cancel my booking\" button for each cancellable room
        // - The payed amount
        // - The amount to pay
        // - The total price
        // - The special request in Details section"
        throw new UnsupportedOperationException();
    }

    public void completeABookingBookingNumberCheckingAccessUsingBookingNumber(String bookingNumber, String country, String otherFieldCountryDependant, String otherFieldValue) {
        // TODO: Implement action: "In the user popin menu, click the link \"My bookings\""
        // TODO: Implement result: "Check that \"My bookings\" window is displayed"
        // TODO: Implement action: String.format("Select the country concerned by the reservation : %s", country)
        // TODO: Implement action: String.format("Fill the following data:
        // - Booking number : %s
        // - %s : %s", booking_number, other_field_country_dependant, other_field_value)
        // TODO: Implement action: "Click the button \"Check booking\" "
        // TODO: Implement result: "Check that the completed booking is displayed  with the following information: 
        // - Hotel name - Reservation number 
        // - Check-in and check-out dates, number of nights 
        // - Occupant name,
        // - Booked rooms description and price 
        // - Selected options with price 
        // - A \"Cancel my booking\" button for each cancellable room 
        // - The payed amount 
        // - The amount to pay 
        // - The total price 
        // - The special request in Details section"
        throw new UnsupportedOperationException();
    }

    public void completeABookingSalesforceChecking(String email) {
        // TODO: Implement action: String.format("Click on \"Accounts\", then fill the email address %s in the search box \"Search persons account and more\"", email)
        // TODO: Implement action: "Click on the found account name"
        // TODO: Implement result: "The user information is displayed in the main window"
        checkThatUserAccountPropertiesAreTheSameAsSalesforceValues();
        // TODO: Implement action: "Click Booking/Master bookings to get information about current/past bookings for this user. Click on the booking to get details about it."
        // TODO: Implement result: "Check that the new booking properties are the same as filled in the web site"
        // TODO: Implement action: "Click on Payments to get information about a payment. Click on the payment to get details about it."
        // TODO: Implement result: "Check that the new payment properties are the same as filled in the web site"
        throw new UnsupportedOperationException();
    }

    public void procedureConnectToSalesforce() {
        connectToSalesforce("https://hotelbb--preprod.cs88.my.salesforce.com/", "tra.moveon@kereval.com", "KerevalBB_0318");
        // TODO: Implement result: "When the user hasn't logged in yet to Salesforce using this workstation, a message with a verification code to fill is displayed. "
        // TODO: Implement action: String.format("Connect to %s using the workstation that needs to access Salesforce, then authenticate to  the functionnal mailbox : - login = %s - password = %s", urlwebmail, login_bal, pwd_bal)
        // TODO: Implement result: "Get the latest mail that the mailbox should have received. It contains a validation code that will allow the current workstation to connect to Salesforce. "
        // TODO: Implement action: "Copy/past this code into the the verification code field, then Submit"
        // TODO: Implement result: "You are now logged in to Salesforce"
        throw new UnsupportedOperationException();
    }

    public void updateUserInformation(String firstname, String lastName, String phone, String phone2, String birthDate, String address, String zipcode, String city, String country, String nationality, String invoiceAddressEnable, String invoiceCompagny, String invoiceAddress, String invoiceZipcode, String invoiceCity, String invoiceCountry) {
        // TODO: Implement action: String.format(" Fill the account fields: 
        // - First name= %s 
        // - Last name= %s 
        // - Telephone= %s 
        // - Telephone 2 = %s
        // - Date of birth= %s 
        // - Address= %s 
        // - Zipcode= %s
        // - City= %s
        // - Country = %s
        // - Nationality = %s
        // - Different invoice address enabled = %s
        // - Invoice company = %s
        // - Invoice address = %s
        // - Invoice zipcode = %s
        // - Invoice city = %s
        // - Invoice country =  %s", firstname, Last_name, phone, phone_2, birth_date, address, zipcode, City, Country, Nationality, invoice_address_enable, invoice_compagny, invoice_address, invoice_zipcode, invoice_city, invoice_country)
        throw new UnsupportedOperationException();
    }

    public void checkTheListeOfServicesOnHotelCard(String servicesEquipements) {
        // TODO: Implement action: String.format("Check on hotel card, the list of equipements and services : %s", services_equipements)
        throw new UnsupportedOperationException();
    }

    public void checkTheNumberOfRoomsIndicatedOnTheLeftOfTheRecommendedRoom(String nbRoom) {
        // TODO: Implement result: String.format("Check that the number of rooms indicated on the left of the recommended room is %s", nb_room)
        throw new UnsupportedOperationException();
    }

    public void clickOnAddAdditionalPhoneNumber() {

    }

    public void clickOnCreateMyAccount() {
        // TODO: Implement action: "Click on Create my account"
        throw new UnsupportedOperationException();
    }

    public void fillTheSecondTelephoneNumber(String telephone2) {
        // TODO: Implement action: String.format("Fill the second telephone number : %s
        // ", telephone_2)
        throw new UnsupportedOperationException();
    }

    public void fillTheFirstTelephoneNumber(String telephone1) {
        // TODO: Implement action: String.format("Fill the first telephone number : %s
        // ", telephone_1)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheTelephoneNumbersAreRejectedTheUserAccountIsNotCreated() {
        // TODO: Implement result: "Check that the telephone numbers are rejected, the user account is not created"
        throw new UnsupportedOperationException();
    }

    public void checkBoxIAcceptTheTermsOfConditionsOfBBHotelsUserCreation(String checkTermsAcceptance) {
        // TODO: Implement action: String.format("Check box \"I accept the Terms of conditions of B&B Hotels\" : %s", checkTermsAcceptance)
        throw new UnsupportedOperationException();
    }

    public void clickOnNextStep() {
        // TODO: Implement action: "Click on Next step"
        throw new UnsupportedOperationException();
    }

    public void skipChooseYourOptionsStepByClickingTheGreenButtonInTheHotelPopin() {
        // TODO: Implement action: "Skip \"Choose your options\" step by clicking the green button in the hotel pop-in"
        throw new UnsupportedOperationException();
    }

    public void clickOnSaveYourChangesUpdateUser() {
        // TODO: Implement action: "Click on Save your changes"
        throw new UnsupportedOperationException();
    }

    public void clickOnTheConnectionButtonThenOnMyPersonalConnectionSettingsInTheDisplayedPopin() {
        // TODO: Implement action: "Click on the connection button, then on \"My personal & connection settings\" in the displayed pop-in"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheUserIsRedirectedToTheHomePageTheUserFirstnameIsWrittenInTheConnectionButtonOnTheTopRightCornerShowingThatHeIsNowConnected(String firstname) {
        // TODO: Implement result: String.format("Check that the user is redirected to the home page. The user %s is written in the connection button on the top right corner, showing that he is now connected.", firstname)
        throw new UnsupportedOperationException();
    }

    public void getTheNewUserAccountInformationUsingTheEmailValue(String email) {
        // TODO: Implement action: String.format("Get the new user account information using the email value : %s", email)
        throw new UnsupportedOperationException();
    }

    public void missingValueIsFramedInRedMessageWrittenWhenPhoneNumberIsMissingAccountCreationIsNotAllowed() {
        // TODO: Implement result: "Missing value is framed in red , account creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void clickOnHelpAndSupportCenter() {
        // TODO: Implement action: "Click on Help and Support center"
        throw new UnsupportedOperationException();
    }

    public void checkTheCaptchaBox() {
        // TODO: Implement action: "Check the captcha box"
        throw new UnsupportedOperationException();
    }

    public void clickOnSubmit() {
        // TODO: Implement action: "Click on Submit"
        throw new UnsupportedOperationException();
    }

    public void checkTheBoxSendMeACopyOfTheMessageByEmail() {
        // TODO: Implement action: "Check the box \"Send me a copy of the message by email\" "
        throw new UnsupportedOperationException();
    }

    public void uncheckTheBoxSendMeACopyOfTheMessageByEmail() {
        // TODO: Implement action: "Uncheck the box \"Send me a copy of the message by email\""
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageYourMessageHasBeenSentIsDisplayedInThePopin() {
        // TODO: Implement result: "Check that the message \"Your message has been sent\" is displayed in the pop-in"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheZipcodeFieldIsFramedInRedRequestCreationIsNotAllowed() {
        // TODO: Implement result: "Check that the zipcode field is framed in red, request creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void getTheContactRequestSentByUserEmailRecordTypeCustomersRequestFeedbackTypeInformationRequest(String email) {
        // TODO: Implement action: String.format("Get the contact request sent by user %s :     
        // - RecordType : Customers Request/ Feedback
        // - Type : Information request", email)
        throw new UnsupportedOperationException();
    }

    public void checkThatAnErrorMessageIsDisplayedRequestCreationIsNotAllowed() {
        // TODO: Implement result: "Check that an error message is displayed, request creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void openTheInboxFolderOfTheMailboxEmail(String email) {
        // TODO: Implement action: String.format("Open the Inbox folder of the mailbox %s", email)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheLastnamefirstnameaddressadditionalAddressmessageBodyAreWrittenAsInTheContactRequest(String lastname, String firstname, String address, String additionalAddress, String messageBody) {
        // TODO: Implement result: String.format("Check that the 
        // lastname =  %s
        // firstname = %s
        // address = %s
        // additional_address = %s
        // message_body = %s  
        // are written as in the contact request", lastname, firstname, address, additional_address, message_body)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheLastnamefirstnameaddressadditionalAddressmessageBodyAreFilledInTheRequestIsTheSameInSalesforce(String lastname, String firstname, String address, String additionalAddress, String messageBody) {
        // TODO: Implement result: String.format("Check that the 
        // lastname = %s
        // firstname = %s
        // address = %s
        // additional address = %s
        // message body = %s
        // are filled in the request is the same in Salesforce", lastname, firstname, address, additional_address, message_body)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessagesYourMessageHasBeenSentAndYouWillReceiveACopyOfYourMessageAtEmailAreDisplayedInAPopin(String email) {
        // TODO: Implement action: String.format("Check that the messages \"Your message has been sent\" and \"You will receive a copy of your message at %s\" are displayed in a pop-in.", email)
        throw new UnsupportedOperationException();
    }

    public void fillTheRequestFieldsFAQ(String hotelLocation, String reason, String firstname, String lastname, String email, String phone, String messageSubject, String messageBody) {
        // TODO: Implement action: String.format("Fill the request fields:   
        // - Your request concerns a hotel located in = %s   
        // - Contact reason = %s 
        // - First name = %s   
        // - Lastname = %s   
        // - Email address = %s  
        // - Telephone = %s   
        // - Message subject = %s   
        // - Your message = %s", hotel_location, reason, firstname, lastname, email, phone, message_subject, message_body)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageBodyIsWrittenAsInTheContactRequest(String messageBody) {
        // TODO: Implement result: String.format("Check that the message body is written as in the contact request = %s", message_body)
        throw new UnsupportedOperationException();
    }

    public void clickOnTheToprightAccountButton() {
        // TODO: Implement action: "Click on the top-right account button"
        throw new UnsupportedOperationException();
    }

    public void theTabFAQOnHelpAndSupportPageDisplays() {
        // TODO: Implement result: "The tab FAQ on Help and Support page displays"
        throw new UnsupportedOperationException();
    }

    public void getTheContactRequestSentByUserEmailRecordTypeCustomersRequestFeedbackTypeForAGeneralRequestTypeIsInformationRequestForAFeedbackRegardingYourStayRequestTypeIsCustomerFeedbacksForABookingConfirmationRequestTypeIsBookingConfirmationForAProblemWithBookingRequestTypeIsCustomerClaimForADuplicateInvoiceRequestTypeIsDuplicateInvoiceForAForgottenObjectRequestTypeIsLostProperty(String email) {
        // TODO: Implement action: String.format("Get the contact request sent by user %s :
        //     - RecordType : Customers Request/ Feedback
        //     - Type : 
        //         - For a General request : type is Information request
        //         - For a Feedback regarding your stay request : type is Customer feedbacks
        //         - For a Booking confirmation request : type is Booking confirmation
        //         - For a Problem with booking request : type is Customer claim
        //         - For a Duplicate invoice request : type is Duplicate invoice
        //         - For a Forgotten object request : type is Lost property", email)
        throw new UnsupportedOperationException();
    }

    public void fillTheRequestFieldsFAQ2(String hotelLocation, String reason, String firstname, String lastname, String email, String phone, String address, String additionalAddress, String zipecode, String country, String messageSubject, String date, String messageBody, String city) {
        // TODO: Implement action: String.format("Fill the request fields:
        // - Your request concerns a hotel located in = %s
        // - Contact reason = %s
        // - First name = %s
        // - Lastname = %s
        // - Email address = %s
        // - Telephone = %s
        // - Address = %s
        // - Additional address details = %s
        // - Zipcode = %s
        // - Country = %s
        // - City = %s
        // - Message subject = %s
        // - Your stay date = %s
        // - Your message = %s", hotel_location, reason, firstname, lastname, email, phone, address, additional_address, zipecode, country, city, message_subject, date, message_body)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheEmailAddressFieldIsFramedInRedRequestCreationIsNotAllowed() {
        // TODO: Implement result: "Check that  the email address field is framed in red, request creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRequestPropertiesValuesAreTheSameAsValuesInSalesforce(String hotelLocation, String reason, String firstname, String lastname, String email, String phone, String address, String zipcode, String country, String city, String messageSubject, String messageBody, String date, String additionalAddress) {
        // TODO: Implement result: String.format("Check that the request properties values are the same as values in Salesforce 
        // - hotel located in = %s 
        // - Contact reason = %s 
        // - First name = %s 
        // - Lastname = %s 
        // - Email address = %s 
        // - Telephone = %s 
        // - Address = %s 
        // - Additional address details = %s 
        // - Zipcode = %s 
        // - Country = %s 
        // - City = %s 
        // - Message subject = %s 
        // - Your stay date = %s 
        // - Your message = %s", hotel_location, reason, firstname, lastname, email, phone, address, additional_address, zipcode, country, city, message_subject, date, message_body)
        throw new UnsupportedOperationException();
    }

    public void fillTheRequestFieldsFAQ3(String email, String phone, String address, String additionalAddress, String zipcode, String country, String messageSubject, String stayDate, String messageBody, String hotelLocation, String reason) {
        // TODO: Implement action: String.format("Fill the request fields: 
        // - Your request concerns a hotel located in = %s 
        // - Contact reason = %s 
        // - First name = %s 
        // - Lastname = %s 
        // - Email address = %s 
        // - Telephone = %s 
        // - Address = %s 
        // - Additional address details = %s 
        // - Zipcode = %s 
        // - Country = %s 
        // - City = %s 
        // - Message subject = %s 
        // - Your stay date = %s 
        // - Your message = %s", hotel_location, reason, firstname, lastname, email, phone, address, additional_address, zipcode, country, city, message_subject, stay_date, message_body)
        throw new UnsupportedOperationException();
    }

    public void checkThatEmptyFieldsAreFramedInRedRequestCreationIsNotAllowed() {
        // TODO: Implement result: "Check that empty fields are framed in red, request creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheCurrentContactRequestIsNotCreatedInSalesforce(String firstname, String lastname, String email) {
        // TODO: Implement result: String.format("Check that the current contact request is not created in Salesforce 
        // email = %s
        // firstname = %s
        // lastname = %s", email, firstname, lastname)
        throw new UnsupportedOperationException();
    }

    public void checkThatThePhoneNumberFieldIsFramedInRedRequestCreationIsNotAllowed() {
        // TODO: Implement result: "Check that  the phone number field is framed in red, request creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void fillTheRequestFieldsFAQ4(String hotelLocation, String reason, String firstname, String lastname, String email, String phone, String messageSubject, String messageBody) {
        // TODO: Implement action: String.format("Fill the request fields:   
        //  - Your request concerns a hotel located in = %s    
        // - Contact reason = %s  
        // - First name = %s    
        // - Lastname = %s    
        // - Email address = %s   
        // - Telephone = %s    
        // - Message subject = %s    
        // - Your message = %s", hotel_location, reason, firstname, lastname, email, phone, message_subject, message_body)
        throw new UnsupportedOperationException();
    }

    public void fillTheRequestFieldsYourRequestConcernsAHotelLocatedInHotelLocationContactReasonReasonFirstNameFirstnameLastnameLastnameEmailAddressEmailTelephonePhoneZipcodeZipcodeMessageSubjectMessageSubjectYourMessageMessageBody(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        // TODO: Implement action: String.format("Fill the request fields:   
        //  - Your request concerns a hotel located in = %s    
        // - Contact reason = %s  
        // - First name = %s    
        // - Lastname = %s    
        // - Email address = %s   
        // - Telephone = %s
        // - Zipcode = {zipcode}    
        // - Message subject = %s    
        // - Your message = %s", p0, p1, p2, p3, p4, p5, p6, p7)
        throw new UnsupportedOperationException();
    }

    public void fillTheFieldsFAQ5(String hotelLocation, String reason, String firstname, String lastname, String email, String phone, String messageSubject, String messageBody) {
        // TODO: Implement action: "Fill the fields FAQ 5 : 
        // - hotel location 
        // - reason 
        // - firstname 
        // - lastname 
        // - email 
        // - phone 
        // - message subject 
        // - message body "
        throw new UnsupportedOperationException();
    }

    public void clickOnTheSelectThematicListboxToChangeTheCurrentFAQView(String thematic) {
        // TODO: Implement action: String.format("Click on the Select thematic : %s listbox to change the current FAQ view", thematic)
        throw new UnsupportedOperationException();
    }

    public void thePageContentIsUpdatedRelatedToTheCurrentThematic(String thematic) {
        // TODO: Implement result: String.format("The page content is updated, related to the current thematic : %s", thematic)
        throw new UnsupportedOperationException();
    }

    public void clickOnEitherAQuestionLabelOrTheRelatedSymboxOnItsRight(String question) {
        // TODO: Implement action: "Click on either a question label or the related \"+\" symbox on its right"
        throw new UnsupportedOperationException();
    }

    public void theChosenQuestionIsExpandedAndTheAnswerIsDisplayedBelowTheSymbolIsReplacedByASymbol(String question) {
        // TODO: Implement result: String.format("The question : %s
        // is expanded and the answer is displayed below. The \"+\" symbol is replaced by a \"-\" symbol.", question)
        throw new UnsupportedOperationException();
    }

    public void selectTheFAQThematicThenClickOnSeeInformationLinkForEachSubthematicBeforeMyStay() {
        // TODO: Implement action: "Select the FAQ thematic, then click on \"See information\" link for each sub-thematic (\"Before my stay\", ...)"
        throw new UnsupportedOperationException();
    }

    public void forEachSubthematicFocusIsSetOnTheSubthematicListOfQuestions() {
        // TODO: Implement result: "For each sub-thematic, focus is set on the sub-thematic list of questions"
        throw new UnsupportedOperationException();
    }

    public void belowTheListOfQuestionsClickTheGreyLinkToAccessThePreviousnextThematic() {
        // TODO: Implement action: "Below the list of questions, click the grey link to access the previous/next thematic"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheDisplayedListOfQuestionsIsRelatedToTheCurrentThematic() {
        // TODO: Implement result: "Check that the displayed list of questions is related to the current thematic"
        throw new UnsupportedOperationException();
    }

    public void checkThatAEarly5DaysRateIsAlwaysDisplayedWithTheNotCancellableNotRefoundableGuarantee() {
        // TODO: Implement result: "Check that a Early 5 days rate is always displayed with the \"Not cancellable, not refoundable\" guarantee"
        throw new UnsupportedOperationException();
    }

    public void checkThatARACKRateIsAlwaysDisplayedWithTheCreditCardGuaranteeGuarantee() {
        // TODO: Implement result: "Check that a RACK rate is always displayed with the \"Credit Card Guarantee\" guarantee"
        throw new UnsupportedOperationException();
    }

    public void clickOnCancelMyBooking() {
        // TODO: Implement action: "Click on Cancel my booking"
        throw new UnsupportedOperationException();
    }

    public void clickOnSeeCancellationPolicy() {
        // TODO: Implement action: "Click on \"See cancellation policy\""
        throw new UnsupportedOperationException();
    }

    public void onYourAccountInTheUserPopinMenuClickTheLinkMyBookingsAndSelectYourBooking(String password, String email) {
        // TODO: Implement action: "On your account, in the user popin menu, click the link \"My bookings\" and select your booking"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheCancelOptionIsDisplay() {
        // TODO: Implement result: "Check that the cancel option is display"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheCancellationPolicyIsDisplay() {
        // TODO: Implement result: "Check that the cancellation policy is display"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheCancelBookingIsDisplayInCancelledPart() {
        // TODO: Implement result: "Check that the cancel booking is display in Cancelled part"
        throw new UnsupportedOperationException();
    }

    public void checkThatCancellationIsDisplayInVerticalBookingAndSalesforce() {
        // TODO: Implement result: "Check that cancellation is display in Vertical Booking and Salesforce"
        throw new UnsupportedOperationException();
    }

    public void checkInPMSThatTheBookingIsCancel() {
        // TODO: Implement action: "Connect to PMS using URL : https://customertest-hotelbb-pms.leanhotelsystem.com , username = david.boisseau , password = BBhotels2018#"
        // TODO: Implement action: "Search for the correct hotel (hotel list is next to the user options)"
        // TODO: Implement result: "Check in PMS that the booking is cancelled (booking state is \"Cancelada\")"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageYourBookingHasBeenCancelledOnXXXXXXXXWithTheTestDayIsDisplay() {
        // TODO: Implement result: "Check that the message \"Your booking has been cancelled on XX/XX/XXXX\" with the test day is display"
        throw new UnsupportedOperationException();
    }

    public void checkOnlyRoomsAreCancel() {
        // TODO: Implement result: "Check only \"cancellable\" rooms are cancel"
        throw new UnsupportedOperationException();
    }

    public void clickOnCheckBooking() {
        // TODO: Implement action: "Click on Check booking"
        throw new UnsupportedOperationException();
    }

    public void clickOnMyAccount() {
        // TODO: Implement action: "Click on My account"
        throw new UnsupportedOperationException();
    }

    public void selectTheCountryAndFillTheBookingNumberAndTheEmailAdressOfTheBooking() {
        // TODO: Implement action: "Select the country and fill the booking number and the email adress of the booking"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheCancelOptionIsNotDisplay() {
        // TODO: Implement result: "Check that the cancel option is not display"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheOptionsScreenIsDisplayed() {
        // TODO: Implement result: "Check that the Options screen is displayed"
        throw new UnsupportedOperationException();
    }

    public void clickOnBookNow() {
        // TODO: Implement action: "Click on Book now"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheOptionOptionNameIsOptionType(String optionName, String optionType) {
        // TODO: Implement action: String.format("Check that the option %s is %s", option_name, option_type)
        throw new UnsupportedOperationException();
    }

    public void selectAnAmountOfRoomsAmountRoomsWhereRoomcodeRoomcodeAndRatecodeRatecode(String amountRooms, String roomcode, String ratecode) {
        // TODO: Implement action: String.format("Select an amount of rooms = %s where roomcode = %s and ratecode = %s", amount_rooms, roomcode, ratecode)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheOptionOptionNameIsOptionType1ForTheFirstRoom(String optionName, String optiontype1) {
        // TODO: Implement action: String.format("Check that the option %s is %s for the first room ", option_name, option-type1)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheOptionOptionNameIsOptionType2ForTheSecondRoom(String optionName, String optionType2) {
        // TODO: Implement action: String.format("Check that the option %s is %s for the second room", option_name, option_type2)
        throw new UnsupportedOperationException();
    }

    public void goToTheBBHomePage() {
        // TODO: Implement action: "Go to the B&B home page"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheGeolocationAutorisationPopupIsDisplayed() {
        // TODO: Implement result: "Check that the geolocation autorisation popup is displayed"
        throw new UnsupportedOperationException();
    }

    public void dontAcceptTheGeolocation() {
        // TODO: Implement action: "Don't accept the geolocation"
        throw new UnsupportedOperationException();
    }

    public void preconditionsFirstAccessGeolocationNotAcceptedForWebTestLeaveBBWebsiteDeleteSiteDataAndCacheWebContentForAppAccessTheDeviceOrApplicationSettingForIOsOrAndroidAndDisableGeolocationAuthorization() {
        // TODO: Implement action: "Preconditions :
        // First access  : geolocation not accepted
        // For Web test : leave B & B website delete site data and cache web content
        // For App : Access the device or application setting (for iOs or Android) and disable geolocation authorization"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheLinkNextToMeForTonightBelowTheSearchBarIsNotDisplayedIfTheLinkIsAvailableClickAndCheckTheManagementOfTheNongeolocation() {
        // TODO: Implement result: "Check that the link \"Next to me for tonight\" below the search bar is not displayed
        // if the link is available click and check the management of the non-geolocation"
        throw new UnsupportedOperationException();
    }

    public void preconditionsGeolocationAccepted() {
        // TODO: Implement action: "preconditions :
        // Geolocation accepted"
        throw new UnsupportedOperationException();
    }

    public void clickOnTheLinkNextToMeForTonight() {
        // TODO: Implement action: "Click on the link \"Next to me for tonight\" "
        throw new UnsupportedOperationException();
    }

    public void checkThatTheResultPageWithFullScreenMapIsDisplayed() {
        // TODO: Implement result: "Check that the result page with full screen map is displayed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheLinkNextToMeForTonightOnTheMapBelowTheSearchBarIsDisplayed() {
        // TODO: Implement result: "Check that the link \"Next to me for tonight\" below the search bar is displayed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheResultPageIsDisplayed() {
        // TODO: Implement action: "Check that the result page is displayed : search result on a map combined with a list + best price"
        throw new UnsupportedOperationException();
    }

    public void checkHotelsResultsOnTheMapHotels(String hotels) {
        // TODO: Implement result: String.format("Check hotels résults on the map : %s", hotels)
        throw new UnsupportedOperationException();
    }

    public void informationForTheTestStartTypingTheEventIndicatedForTheTestInTheFieldWhereThenSelectTheEventFromTheProposedListOfResults() {
        // TODO: Implement action: "Information : For the test start typing the event indicated for the test in the field \"where\" then select the event from the proposed list of results"
        throw new UnsupportedOperationException();
    }

    public void informationForTheTestStartTypingTheAdresseIndicatedForTheTestInTheFieldWhereThenSelectTheAdresseFromTheProposedListOfResults() {
        // TODO: Implement action: "Information : For the test start typing the adresse indicated for the test in the field \"where\" then select the adresse from the proposed list of results"
        throw new UnsupportedOperationException();
    }

    public void informationForTheTestStartTypingTheCPIndicatedForTheTestInTheFieldWhereThenSelectTheCPFromTheProposedListOfResults() {
        // TODO: Implement action: "Information : For the test start typing the CP indicated for the test in the field \"where\" then select the CP from the proposed list of results"
        throw new UnsupportedOperationException();
    }

    public void informationForTheTestStartTypingTheCityIndicatedForTheTestInTheFieldWhereThenSelectTheCityFromTheProposedListOfResults() {
        // TODO: Implement action: "Information : For the test start typing the city indicated for the test in the field \"where\" then select the city from the proposed list of results"
        throw new UnsupportedOperationException();
    }

    public void informationForTheTestStartTypingTheCountryIndicatedForTheTestInTheFieldWhereThenSelectTheCountryFromTheProposedListOfResults() {
        // TODO: Implement action: "Information : For the test start typing the country indicated for the test in the field \"where\" then select the country from the proposed list of results"
        throw new UnsupportedOperationException();
    }

    public void checkHotelsHotelsAreDisplayed(String hotels) {
        // TODO: Implement result: String.format("Check hotels \"%s\" are displayed", hotels)
        throw new UnsupportedOperationException();
    }

    public void fromTheHomePageClickOnTheButtonMoreDestinations() {
        // TODO: Implement action: "From the home page click on the button \"More destinations\""
        throw new UnsupportedOperationException();
    }

    public void checkHotelsCardHotelsIsDisplayed(String hotels) {
        // TODO: Implement result: String.format("Check hotels card \"%s\" is displayed", hotels)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheLinkFindAHotelOnTheMapBelowTheSearchBarIsNotDisplayedOrIfTheLinkIsAvailableClickAndCheckTheManagementOfTheNongeolocation() {
        // TODO: Implement result: "Check that the link \"Find a hotel on the map\" below the search bar is not displayed or if the link is available click and check the management of the non-geolocation"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheSearchIsLaunchedTheCustomerIsRedirectedToTheResultPage(String where, String dateCheckIn, String dateCheckOut) {
        // TODO: Implement result: "Check that the search is launched, the customer is redirected to the result page"
        throw new UnsupportedOperationException();
    }

    public void checkThatByDefaultTheValueForOptionnalFieldsRooms1Adult1Children0(String rooms, String adult, String children) {
        // TODO: Implement result: String.format("Check that by default the value for optionnal fields :
        //  - Rooms = %s
        //  - Adult = %s
        //  - Children = %s", rooms, adult, children)
        throw new UnsupportedOperationException();
    }

    public void fromTheSearchBarOfTheHomePageSelectRoomsNbRoom(String nbRoom) {
        // TODO: Implement action: String.format(" From the search bar of the home page :
        //  - Sélect Rooms = %s", nb_room)
        throw new UnsupportedOperationException();
    }

    public void selectACombinationOfAdultAndChildNumberAndCheckTheNbMinOfAdult(String minAdult) {
        // TODO: Implement action: " select a combination of adult and child number"
        // TODO: Implement result: String.format("check that the min Adults = %s", min_adult)
        throw new UnsupportedOperationException();
    }

    public void selectACombinationOfAdultAndChildNumberAndCheckTheMaxTraveller(String maxTravelers) {
        // TODO: Implement action: " select a combination of adult and child number"
        // TODO: Implement result: String.format("check that the max travelers (Adults +Children) = %s", max_travelers)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheHotelCardIsDisplayed(String where) {
        // TODO: Implement result: "Check that the hotel card is displayed"
        throw new UnsupportedOperationException();
    }

    public void checkInTheRoomListChooseYourRoomsTheRoomRoomWordingIsNotAvailable(String roomWording) {
        // TODO: Implement result: String.format("Check in the room list (choose your rooms) the room %s is not available", room_wording)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRoomRoomWordingIsPresentInTheUnavailableRoomList(String roomWording) {
        // TODO: Implement result: String.format(" Check that the room : %s is present in the unavailable room list", room_wording)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheDisplayOrderOfTheServicesOrRoomcodesCorrespondsToTheFollowingListOrder(String order) {
        // TODO: Implement action: String.format("Check that the display order of the services (or roomcodes) corresponds to the following list: : %s", order)
        throw new UnsupportedOperationException();
    }

    public void checkOnPricePerNightAPopinDisplayedThePriceOfEachNight() {
        // TODO: Implement result: "Check on price per night, a popin displayed the price of each night"
        throw new UnsupportedOperationException();
    }

    public void checkDisplayedRoomPriceTotalPriceForAllNights1PeopleAboveTheTotalPriceThePricePerNightAveragePricePerNight() {
        // TODO: Implement result: "Check displayed room price : 
        //  - total price (for all nights/1 people)
        //  - above the total price : The price per night (average price per night)"
        throw new UnsupportedOperationException();
    }

    public void checkDisplayedRoomPriceTotalPriceFor1NightAboveTheTotalPrice1NightPerRoom() {
        // TODO: Implement result: "Check displayed room price :   - total price (for 1 night)  - above the total price : 1 night, per room"
        throw new UnsupportedOperationException();
    }

    public void checkThatAPopinDisplayedTheAmoutOfEachNight() {
        // TODO: Implement result: "Check that a popin displayed the amout of each night"
        throw new UnsupportedOperationException();
    }

    public void clicOrRollOverOnThePricePerNight() {
        // TODO: Implement action: "Clic or roll over on the price per night"
        throw new UnsupportedOperationException();
    }

    public void fromVerticalBoockingCheckRatePlanForHotelHotelNameAvailAndRatesProductRatesEditProductsRatePlans(String hotelName) {
        // TODO: Implement action: String.format("From VerticalBoocking, check rate plan for hotel : %s
        //  - Avail. and Rates / Product - Rates / Edit products Rate plans", hotel_name)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheColorOfSpecialOfferIsPinkCfScreenAttachment() {
        // TODO: Implement result: "Check that the color of special offer is pink cf. screen attachment"
        throw new UnsupportedOperationException();
    }

    public void checkTheInformationDisplayedOnTheRoomRoomTypeAmountInAmountPercentAmountInValueAmountValueNameOfTheOfferNameSpecialOfferMentionMentionInitialPriceInitialPriceDiscountedPriceDiscountedPriceConditionCondition(String roomType, String amountPercent, String amountValue, String nameSpecialOffer, String mention, String initialPrice, String discountedPrice, String condition) {
        // TODO: Implement result: String.format("Check the information displayed on the room %s
        //  - Amount in % : %s
        //  - Amount in value : %s 
        //  - Name of the offer : %s
        //  - Mention : %s
        //  - initial price : %s
        //  - discounted price : %s
        //  - + condition : %s", room_type, amount_percent, amount_value, name_special_offer, mention, initial_price, discounted_price, condition)
        throw new UnsupportedOperationException();
    }

    public void signUpToNewsletter() {
        // TODO: Implement action: "On the footer, click on Sign up to newsletter"
        throw new UnsupportedOperationException();
    }

    public void checkThatThePopinSubscribeToBBNewslettersIsDisplayed() {
        // TODO: Implement result: "Check that the pop-in Subscribe to B&B newsletters is displayed "
        throw new UnsupportedOperationException();
    }

    public void checkThatTheColorOfBestPriceIsBlueCfScreenAttachment() {
        // TODO: Implement action: "Check that the color of Best price is blue cf. screen attachment"
        throw new UnsupportedOperationException();
    }

    public void checkTheInformationDisplayedOnTheRoomRoomTypeAmountInValueNbNightXPriceForStandardNightRackPriceNbNightXDiscountedPriceDiscountedPriceMentionMentionConditionCondition(String roomType, String rackPrice, String discountedPrice, String mention, String condition) {
        // TODO: Implement result: String.format("Check the information displayed on the room : %s
        //  - Amount in value = nb night x price for standard night : %s  + nb night x discounted price : %s
        //  - Mention : %s
        //  - condition : %s", room_type, rack_price, discounted_price, mention, condition)
        throw new UnsupportedOperationException();
    }

    public void fillTheFieldsNewsletter(String name, String surname, String email) {
        // TODO: Implement action: String.format("Fill the fields :
        // - NAME = %s
        // - SURNAME =%s
        // - EMAIL= %s", name, surname, email)
        throw new UnsupportedOperationException();
    }

    public void sinceVerticalBoockingCheckRatePlanForHotelHotelNameAvailAndRatesProductRatesEditProductsRatePlans(String hotelName) {
        // TODO: Implement action: String.format("Since VerticalBoocking, check rate plan for hotel : %s
        //  - Avail. and Rates / Product - Rates / Edit products Rate plans", hotel_name)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheColorOfEventRateIsGreenCfscreenAttachement() {
        // TODO: Implement result: "Check that the color of Event Rate is green cf.screen attachement"
        throw new UnsupportedOperationException();
    }

    public void checkTheInformationDisplayedOnTheRoomRoomTypeNameOfTheEventEventWordingRoomPriceInitialPriceMentionMentionConditionCondition(String roomType, String eventWording, String initialPrice, String mention, String condition) {
        // TODO: Implement result: String.format("Check the information displayed on the room %s
        //  - Name of the event : %s
        //  - Room price : %s
        //  - Mention : %s
        //  - Condition : %s", room_type, event_wording, initial_price, mention, condition)
        throw new UnsupportedOperationException();
    }

    public void inVerticalBoockingCheckRatePlanForHotelHotelNameAvailAndRatesProductRatesEditProductsRatePlans(String hotelName) {
        // TODO: Implement action: String.format("In VerticalBoocking, check rate plan for hotel : %s
        //  - Avail. and Rates / Product - Rates / Edit products Rate plans", hotel_name)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageSubscribeConfirmedIsDisplayed() {
        // TODO: Implement result: "Check that the message \"Subscribe confirmed\" is displayed"
        throw new UnsupportedOperationException();
    }

    public void checkTheInformationDisplayedOnTheRoomRoomTypeCheckDisplayedInfoOfPackageIncludedPackageInfo(String roomType, String packageInfo) {
        // TODO: Implement result: String.format("Check the information displayed on the room : %s
        //  - Check displayed info of package included : %s", room_type, package_info)
        throw new UnsupportedOperationException();
    }

    public void checkInformationDisplayedInTheRoomBlockBedTypeBedTypeCapcityMaxCapaMaxPictogramPictosAPhotoPhotoListOfFeaturesFeatures(String bedType, String capaMax) {
        // TODO: Implement result: String.format("Check information displayed in the room block :
        //  - Bed type : %s
        //  - Capacity max : %s
        //  - A list of features
        //  - A list of deals, and for each a label and whether the booking is cancellable or not
        //  - The price for the stay per deal
        //  - A room selection box per deal", bed_type, capa_max)
        throw new UnsupportedOperationException();
    }

    public void checkInTheRoomListChooseYourRoomsTheRoomRoomWordingIsDisplayed(String roomWording) {
        // TODO: Implement result: String.format("Check in the room list (choose your rooms) the room %s is displayed.", room_wording)
        throw new UnsupportedOperationException();
    }

    public void clickOnTheRoomFilterList() {
        // TODO: Implement action: "Click on the room filter list "
        throw new UnsupportedOperationException();
    }

    public void selectHotelHotelName(String hotelName) {
        // TODO: Implement action: String.format("Select hotel %s", hotel_name)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheSubscriptionToNewsletterIsWellRecordInSalesforce() {
        // TODO: Implement result: "Check that the subscription to newsletter is well record in Salesforce"
        throw new UnsupportedOperationException();
    }

    public void openExtranetverticalbookingcom() {
        // TODO: Implement action: "Open extranet.verticalbooking.com"
        throw new UnsupportedOperationException();
    }

    public void fromTheExtranetVerticalBookingPortalOnTheLeftMenuClickOnAvail() {
        // TODO: Implement action: "From the Extranet Vertical Booking portal, on the left menu click on Avail."
        throw new UnsupportedOperationException();
    }

    public void fillInTheAvailabilityPeriodStartDateEndMonthThenClickOnShow(String startDate, String endMonth) {
        // TODO: Implement action: String.format("Fill in the availability period: %s, %s
        // Then click on Show", Start_Date, End_Month)
        throw new UnsupportedOperationException();
    }

    public void checkThatYouAreInTheGroupBBDEMOCHAINOtherwiseClickTheGroupButtonInTheTopMenuOftheApplication() {
        // TODO: Implement result: "Check that you are in the Group: B & B DEMO CHAIN ​​Otherwise click the Group button in the top menu ofthe application"
        throw new UnsupportedOperationException();
    }

    public void clickOnAvailAndBookingRulesThenAvailabiliyByProperty() {
        // TODO: Implement action: "Click on \"Avail. and booking rules\"  then \"Availabiliy By Property\""
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRoomTypesDefinedInVerticalBookingCorrespondToTheTypesOfRoomsDisplayedInTheHotelItsPossibleToHaveRoomTypesUnavailableUnfoldTheListToSeeTheCompleteList() {
        // TODO: Implement result: "Check that the room types defined in verticalBooking correspond to the types of rooms displayed in the hotel
        // (It's possible to have room types unavailable. Unfold the list to see the complete list)"
        throw new UnsupportedOperationException();
    }

    public void changeTheDeviceInTheHeader(String device) {
        // TODO: Implement action: "Change the device in the header"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheConvertionCorrespond(String device) {
        // TODO: Implement result: "Check that the convertion correspond"
        throw new UnsupportedOperationException();
    }

    public void checkInTheRoomListChooseYourRoomsTheRoomPriceCurrencyCorrespondToTheUserSelectionInTheHeader(String where) {
        // TODO: Implement result: "Check in the room list (choose your rooms) the room price currency correspond to the user sélection in the header"
        throw new UnsupportedOperationException();
    }

    public void changeTheLocationIpIdentification(String location) {
        // TODO: Implement action: "Change the location (ip identification)"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheDeviceSelectedDefaultCorrespondToTheUserGeolocationPossibleToHaveToRefreashF5ThePage(String location) {
        // TODO: Implement result: "Check that the device selected (default) correspond to the user géolocation.
        // (Possible to have to refreash F5 the page)"
        throw new UnsupportedOperationException();
    }

    public void checkInTheRoomListChooseYourRoomsTheRoomPriceCurrencyCorrespond(String currency) {
        // TODO: Implement result: String.format("Check in the room list (choose your rooms) the room price currency correspond to %s", currency)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRoomsCapacityInTheRecommendationIsEqualhigherThanTheNumberOfPersonsAdultsChildrenSetInTheSearchCriteria(String nbAdult, String nbRoom, String nbChildren) {
        // TODO: Implement result: "Check that the rooms capacity in the recommendation is equal/higher than the number of persons (adults + children) set in the search criteria"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRoomPriceInTheRecommendationIsEquallowerThanTheOtherPricesGivenInTheRoomListBelowTheRecommendation() {
        // TODO: Implement result: "Check that the room price in the recommendation is equal/lower than the other prices given in the room list below the recommendation"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRecommendationDisplaysRoomsInTheOrderDefinedWithinTheExcelFileWhenPricesAreEqualsHttpsdocsgooglecomspreadsheetsd1u51ikhHTQdoSQniUSb5jxc0bu9djBdd0e7Jk7bPRkuAeditgid340695039() {
        // TODO: Implement result: "Check that the recommendation displays rooms in the order defined within the Excel file when prices are equals (https://docs.google.com/spreadsheets/d/1Gxjd__PlBRBtT7ktWAH3Af7DHqCFnzopY1vc6jTG1qs/edit#gid=1399285832)"
        throw new UnsupportedOperationException();
    }

    public void checkThatAMessageIsDisplayedShowingThatNoRoomIsAvailableOnThisDate(String where, String dateCheckIn, String dateCheckOut) {
        // TODO: Implement result: "Check that a message is displayed showing that no room is available on this date"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheSubsciptionToNewsletterIsNotRecordInSalesforce() {
        // TODO: Implement action: "Check that the subsciption to newsletter is not record in Salesforce"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheOnlyAvailableDoubleRoomR12IsShownInRecommendationdespiteTheNumberOfTheRoomOnTheLeftIsLowerThanTheNumberOfSearchedRooms(String where, String dateCheckin, String dateCheckout, String nbRoom) {
        // TODO: Implement result: "Check that the only available double room (R12) is shown in recommendation,despite the number of the room on the left is lower than the number of searched rooms"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheEmptyFieldIsFramedInRedSubmitIsNotAllowed() {
        // TODO: Implement result: "Check that the empty field is framed in red, Submit is not allowed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheResultDisplaysTheR12RoomWithASpecificWordingAsTheNumberOfRooms1DoesNotMatchTheSearchCriteria2AndTheCapacity2DoesNotMatchTheNumberOfPersons3(String where, String dateCheckin, String dateCheckout, String nbAdults, String nbChildren, String nbRooms) {
        // TODO: Implement result: "Check that the result displays the R12 room with a specific wording, as the number of rooms (1) does not match the search criteria (2) and the capacity(2) does not match the number of persons(3)"
        throw new UnsupportedOperationException();
    }

    public void checkThatMyAccountIsDisplayedInPlaceOfEmail(String email) {
        // TODO: Implement result: String.format("Check that My account is displayed in place of %s", email)
        throw new UnsupportedOperationException();
    }

    public void checkThatSubmitIsNotAllowed() {
        // TODO: Implement action: "Check that Submit is not allowed"
        throw new UnsupportedOperationException();
    }

    public void clickOnButtonMyAccountThenOnMyAccountLink() {
        // TODO: Implement action: "Click on button My account, then on My account link"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheSignInToMyAccountPageDisplays() {
        // TODO: Implement result: "Check that the Sign in to my account page displays"
        throw new UnsupportedOperationException();
    }

    public void checkThatFirstnameUserIsDisplayedInTheToprightAccountButton(String firstname) {
        // TODO: Implement result: "Check that firstname User is displayed in the top-right account button"
        throw new UnsupportedOperationException();
    }

    public void clickTheGreenButtonInTheHotelPopinGoToToNextStep() {
        // TODO: Implement action: "Click the green button in the hotel pop-in go to to next step"
        throw new UnsupportedOperationException();
    }

    public void clickOnTheSignOutButton() {
        // TODO: Implement action: "Click on the Sign out button"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheWelcomeBackPageDisplaysWithTheUserPersonnalData(String firstname, String email) {
        // TODO: Implement result: "Check that the Welcome back page displays, with the user personnal data"
        throw new UnsupportedOperationException();
    }

    public void clickOrSignInAndSaveTime() {
        // TODO: Implement action: "Click \"Or sign in and save time\""
        throw new UnsupportedOperationException();
    }

    public void checkThatALoginToYourAccountPopupIsDisplayed() {
        // TODO: Implement result: "Check that a \"Login to your account\" pop-up is displayed"
        throw new UnsupportedOperationException();
    }

    public void getTheUserAccountEmailInformationInSalesforce(String email) {
        // TODO: Implement action: String.format("Get the user account %s information in Salesforce", email)
        throw new UnsupportedOperationException();
    }

    public void clickOnTheSignInButton() {
        // TODO: Implement action: "Click on the Sign in button"
        throw new UnsupportedOperationException();
    }

    public void fillTheFollowingValuesYourEmailEmailPasswordPassword(String email, String password) {
        // TODO: Implement action: String.format("Fill the following values:
        // - Your email = %s
        // - Password = %s", email, password)
        throw new UnsupportedOperationException();
    }

    public void checkThatAWelcomeBackUserPopinWithTheUserInformationIsDisplayed(String firstname, String lastname) {
        // TODO: Implement result: "Check that a Welcome back user popin with the user information is displayed"
        throw new UnsupportedOperationException();
    }

    public void checkThatPersonalInformationAreTheSameAsSalesforceValues(String email, String lastname, String firstname) {
        // TODO: Implement result: "Check that Personal information are the same as Salesforce values"
        throw new UnsupportedOperationException();
    }

    public void emptyFieldIsFramedInRedSignInIsNotAllowed() {
        // TODO: Implement result: "Empty field is framed in red, sign in is not allowed"
        throw new UnsupportedOperationException();
    }

    public void wrongFieldIsFramedInRedSignInIsNotAllowed() {
        // TODO: Implement result: "Wrong field is framed in red, sign in is not allowed"
        throw new UnsupportedOperationException();
    }

    public void clickOnTheFAQOnTheHeader() {
        // TODO: Implement action: "Click on the FAQ on the header  "
        throw new UnsupportedOperationException();
    }

    public void clickOnAllContactOnTheFooter() {

    }

    public void checkThatIncorrectFieldIsFramedInRedSubmitIsNotAllowed() {
        // TODO: Implement action: "Check that incorrect field is framed in red, Submit is not allowed"
        throw new UnsupportedOperationException();
    }

    public void clickOnModifyInformation() {
        // TODO: Implement action: "Click on Modify  information"
        throw new UnsupportedOperationException();
    }

    public void checkThatAWelcomeBackUserIsDisplayedShowingUserPersonalInformations(String firstname, String lastname, String country, String phone, String invoiceCountry, String differentEnableInvoice) {
        // TODO: Implement result: "Check that a Welcome back User is displayed, showing user personal informations"
        throw new UnsupportedOperationException();
    }

    public void emptyFieldIsFramedInRedUpdateIsNotAllowed() {
        // TODO: Implement result: "Empty field is framed in red, update is not allowed"
        throw new UnsupportedOperationException();
    }

    public void updateTheAccountFieldsUpdateFromBooking(String firstname, String lastname, String telephone, String country, String enableDifferentInvoice, String invoiceCountry) {
        // TODO: Implement action: String.format("Update the account fields: 
        // - First name= %s 
        // - Last name= %s 
        // - Telephone= %s 
        // - Country = %s
        // - Different invoice address enabled = %s
        // - Invoice country =  %s", firstname, lastname, telephone, country, enable_different_invoice, invoice_country)
        throw new UnsupportedOperationException();
    }

    public void replaceTheZipcodeValueZipcode(String zipcode) {
        // TODO: Implement action: String.format("Replace the Zipcode value = %s", zipcode)
        throw new UnsupportedOperationException();
    }

    public void zipcodeFieldIsFramedInRedUpdateIsNotAllowed() {
        // TODO: Implement result: "Zipcode field is framed in red, update is not allowed"
        throw new UnsupportedOperationException();
    }

    public void enableOptionDifferentInvoiceAddressUserAccount() {
        // TODO: Implement action: "Enable option Different invoice address"
        throw new UnsupportedOperationException();
    }

    public void replaceTheZipcodeValueForTheDifferentInvoiceAddressZipcodeZipcode(String zipcode) {
        // TODO: Implement action: String.format("Replace the zipcode value for the different invoice address : zipcode = %s", zipcode)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageTheChangesHaveBeenSavedIsDisplayed() {
        // TODO: Implement action: "Check that the message \"The changes have been saved\" is displayed"
        throw new UnsupportedOperationException();
    }

    public void disableTheDifferentInvoiceAddressUsingTheButtonOnTheRightOfTheLabel() {
        // TODO: Implement action: "Disable the \"Different invoice address\"using the button on the right of the label"
        throw new UnsupportedOperationException();
    }

    public void clickOnSaveMyModificationsToRestoreTheAccount() {
        // TODO: Implement action: "Click on Save my modifications to restore the account"
        throw new UnsupportedOperationException();
    }

    public void checkThatAllInvoiceFieldsValuesAreEmptyInSalesforceForThisUser() {
        // TODO: Implement result: "Check that all invoice fields values are empty in Salesforce for this user"
        throw new UnsupportedOperationException();
    }

    public void getTheUserEmailAccountInformationUsingTheEmailValue(String email) {
        // TODO: Implement action: String.format("Get the user %s account information using the email value", email)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsUpdateFromBooking2(String invoiceCompany, String invoiceAddress, String invoiceZipcode, String invoiceCity, String invoiceCountry) {
        // TODO: Implement action: String.format(" Fill the account fields:  
        // - Invoice company = %s 
        // - Invoice address = %s 
        // - Invoice zipcode = %s 
        // - Invoice city = %s 
        // - Invoice country =  %s", invoice_company, invoice_address, invoice_zipcode, invoice_city, invoice_country)
        throw new UnsupportedOperationException();
    }

    public void replaceTheFollowingValuesFirstnameFirstnameLastnameLastname(String firstname, String lastname) {
        // TODO: Implement action: String.format("Replace the following values:
        // - Firstname = %s
        // - Lastname= %s", firstname, lastname)
        throw new UnsupportedOperationException();
    }

    public void getTheNewUserAccountInformationUsingTheEmailValueEmail(String email) {
        // TODO: Implement action: String.format("Get the new user account information using the email value %s", email)
        throw new UnsupportedOperationException();
    }

    public void checkThatUserAccountPropertiesFirstnameAndLastnameAreTheSameAsSalesforceValues() {
        // TODO: Implement result: "Check that user account properties Firstname and Lastname are the same as Salesforce values"
        throw new UnsupportedOperationException();
    }

    public void clickOnTheLinkAddAdditionalPhoneNumberIfASecondPhoneNumberIsNotFilledYet() {
        // TODO: Implement action: "Click on the link \"Add additional phone number\" if a second phone number is not filled yet"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheUserAccountUpdateValueIsTheSameAsTheValueInSalesforce() {
        // TODO: Implement result: "Check that the user account update value is the same as the value in Salesforce"
        throw new UnsupportedOperationException();
    }

    public void checkThatEmptyFieldIsFramedInRedUpdateIsNotAllowed() {
        // TODO: Implement result: "Check that empty field is framed in red, update is not allowed"
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsFirstNameFirstnameLastNameSurnameTelephoneTelephoneDateOfBirthDateOfBirthAddressAddressZipcodeZipcodeCityCityCountryCountryNationalityNationalityDifferentInvoiceAddressEnabledEnableDifferentInvoiceInvoiceAddressInvoiceAddressInvoiceZipcodeInvoiceZipcodeInvoiceCityInvoiceCityInvoiceCountryInvoiceCountry(String firstname, String lastname, String phone, String dateBirth, String address, String zipcode, String city, String country, String nationality, String differentEnableAddressInvoice, String invoiceAddress, String invoiceZipcode, String invoiceCity, String invoiceCountry) {
        // TODO: Implement action: String.format("Fill the account fields: 
        // - First name= %s 
        // - Last name= %s 
        // - Telephone= %s 
        // - Date of birth= %s 
        // - Address= %s 
        // - Zipcode= %s
        // - City= %s
        // - Country = %s
        // - Nationality = %s
        // - Different invoice address enabled = %s
        // - Invoice address = %s
        // - Invoice zipcode = %s
        // - Invoice city = %s
        // - Invoice country =  %s", firstname, lastname, phone, date_birth, address, zipcode, city, country, nationality, different_enable_address_invoice, invoice_address, invoice_zipcode, invoice_city, invoice_country)
        throw new UnsupportedOperationException();
    }

    public void dateOfBirthFieldIsFramedInRedUpdateIsNotAllowed() {
        // TODO: Implement result: "Date of birth field is framed in red, update is not allowed"
        throw new UnsupportedOperationException();
    }

    public void replaceTheDateOfBirthValueDateOfBirth(String dateBirth) {
        // TODO: Implement action: String.format("Replace the Date of birth value = %s", date_birth)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsInvoiceCompanyInvoiceCompanyInvoiceAddressInvoiceAddressInvoiceZipcodeInvoiceZipcodeInvoiceCityInvoiceCityInvoiceCountryInvoiceCountry(String invoiceCompany, String invoiceAddress, String invoiceZipcode, String invoiceCity, String invoiceCountry) {
        // TODO: Implement action: String.format(" Fill the account fields: 
        // - Invoice company = %s
        // - Invoice address = %s
        // - Invoice zipcode = %s
        // - Invoice city = %s
        // - Invoice country =  %s", invoice_company, invoice_address, invoice_zipcode, invoice_city, invoice_country)
        throw new UnsupportedOperationException();
    }

    public void checkThatAtLeastOneEmailAddressFieldIsFramedInRedAddressIsNotUpdated() {
        // TODO: Implement result: "Check that  at least one email address field is framed in red, address is not updated"
        throw new UnsupportedOperationException();
    }

    public void clickOnModifyMyLogin() {
        // TODO: Implement action: "Click on Modify my Login"
        throw new UnsupportedOperationException();
    }

    public void clickOnConnectionSettings() {
        // TODO: Implement action: "Click on Connection settings"
        throw new UnsupportedOperationException();
    }

    public void fillTheFollowingValuesNewEmailAddressNewEmailAddressConfirmNewEmailAddressConfirmEmailAddress(String emailNew, String confirmNewEmail) {
        // TODO: Implement action: String.format("Fill the following values:
        // - New email address = %s
        // - Confirm new email address = %s", email_new, confirm_new_email)
        throw new UnsupportedOperationException();
    }

    public void checkThatThereIsNoDuplicateAccountWithEmailAddressNewEmailAddress(String newAddressEmail) {
        // TODO: Implement result: String.format("Check that there is no duplicate account with email address = %s", new_address_email)
        throw new UnsupportedOperationException();
    }

    public void redErrorMessageIsDisplayedEmailUpdateIsNotAllowed(String email) {
        // TODO: Implement result: "Red error message is displayed, email update is not allowed."
        throw new UnsupportedOperationException();
    }

    public void clickOnModifyMyPassword() {
        // TODO: Implement action: "Click on Modify my password"
        throw new UnsupportedOperationException();
    }

    public void checkThatAtLeastOnePasswordFieldIsFramedInRedPasswordIsNotUpdated() {
        // TODO: Implement result: "Check that at least one password field is framed in red, password is not updated"
        throw new UnsupportedOperationException();
    }

    public void fillTheFollowingValuesActualPasswordActualPasswordNewPasswordNewPasswordConfirmNewPasswordConfirmPassword(String actualPassword, String newPassword, String confirmNewPassword) {
        // TODO: Implement action: String.format("Fill the following values:  
        // - Actual password = %s
        // - New password = %s
        // - Confirm new password = %s", actual_password, new_password, confirm_new_password)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageActualPasswordDoesNotMatchIsDisplayedPasswordIsNotUpdated() {
        // TODO: Implement result: "Check that the message \"Actual password does not match\" is displayed, password is not updated"
        throw new UnsupportedOperationException();
    }

    public void fillTheFollowingValuesActualPasswordPssw0rd2NewPasswordPssw0rd3ConfirmNewPasswordPssw0rd3() {
        // TODO: Implement action: "Fill the following values:  
        // - Actual password = P@ssw0rd2 
        // - New password = P@ssw0rd3 
        // - Confirm new password = P@ssw0rd3"
        throw new UnsupportedOperationException();
    }

    public void checkThatAAnErrorMessageDisplays() {
        // TODO: Implement result: "Check that a an error message displays"
        throw new UnsupportedOperationException();
    }

    public void fillTheFollowingValueEmailEmail(String email) {
        // TODO: Implement action: String.format("Fill the following value : email = %s", email)
        throw new UnsupportedOperationException();
    }

    public void clickOnSaveAndSignIn() {
        // TODO: Implement action: "Click on Save and sign in"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheUserEmailIsWellLoggedIn(String email) {
        // TODO: Implement result: String.format("Check that the user %s is well logged in", email)
        throw new UnsupportedOperationException();
    }

    public void checkThatAMessageIndicatesTheConnectionParameterHaveBeenReset() {
        // TODO: Implement result: "Check that a message indicates the connection parameter have been reset"
        throw new UnsupportedOperationException();
    }

    public void checkThatANewMailIsReceivedWithSenderBBHotelsAndTitleReplacementLoginInformationForUserEmailAtBBHotelsDigital(String email) {
        // TODO: Implement result: String.format("Check that a new mail is received with sender = \"B&B Hotels\" and title = \"Replacement login information for user %s at BB Hotels Digital\"", email)
        throw new UnsupportedOperationException();
    }

    public void clickOnTheLinkInTheMail() {
        // TODO: Implement action: "Click on the link in the mail"
        throw new UnsupportedOperationException();
    }

    public void confirmThisPasswordInTheConfirmNewPasswordTextbox() {
        // TODO: Implement action: "Confirm this password in the confirm new password textbox"
        throw new UnsupportedOperationException();
    }

    public void checkThatThePersonalAndConnectionSettingsWindowIsDisplayedWithAMessageIndicatingThatTheChangesHaveBeenSaved() {
        // TODO: Implement result: "Check that the personal and connection settings window is displayed, with a message indicating that the changes have been saved"
        throw new UnsupportedOperationException();
    }

    public void inTheNewPasswordTextboxEnterTheNewPasswordNewpassword(String newPassword) {
        // TODO: Implement action: String.format("In the new password textbox, enter the new password = %s", new_password)
        throw new UnsupportedOperationException();
    }

    public void checkThatAConnectionSettingsWindowIsOpenedCreateNewPassword() {
        // TODO: Implement result: "Check that a connection settings window is opened (Create new password)"
        throw new UnsupportedOperationException();
    }

    public void clickOnSaveMyModification() {
        // TODO: Implement action: "Click on Save my modification"
        throw new UnsupportedOperationException();
    }

    public void fillTheTextboxesActualPasswordNewpasswordNewPasswordPssw0rd4ConfirmNewPasswordPssw0rd4(String newpassword) {
        // TODO: Implement action: String.format("Fill the textboxes:
        // - Actual password = %s
        // - New password = P@ssw0rd4
        // - Confirm new password = P@ssw0rd4", newpassword)
        throw new UnsupportedOperationException();
    }

    public void clickTheButton() {
        // TODO: Implement action: "Click the \"Search\" button"
        throw new UnsupportedOperationException();
    }

    public void checkThatBBHotelDisneylandParisHotelCardIsDisplayed() {
        // TODO: Implement result: "Check that B&B Hotel Disneyland Paris hotel card is displayed"
        throw new UnsupportedOperationException();
    }

    public void clickTheHeartIconOnTheToprightNextToTheHotelName() {
        // TODO: Implement action: "Click the heart icon on the top-right next to the hotel name"
        throw new UnsupportedOperationException();
    }

    public void clicOnTheUserIconAndSelectMyFavoriteHotel() {
        // TODO: Implement action: "Clic on the user icon, and select My favorite hotel"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheHotelBBHotelDisneylandParisIsAddedInTheFavoriteHotelList() {
        // TODO: Implement result: "Check that the hotel B&B Hotel Disneyland Paris is added in the favorite hotel list"
        throw new UnsupportedOperationException();
    }

    public void fillTheValueHotelNameInTheSearchBar(String hotelName) {
        // TODO: Implement action: String.format("Fill the value = %s in the search bar", hotel_name)
        throw new UnsupportedOperationException();
    }

    public void checkThatSuggestedHotelsStartDisplayingWhenFillingTheHotelNameInTheSeachBar() {
        // TODO: Implement result: "Check that suggested hotels start displaying when filling the hotel name in the seach bar"
        throw new UnsupportedOperationException();
    }

    public void amongTheSuggestedHotelsSelectDisneylandParisBBHotel() {
        // TODO: Implement action: "Among the suggested hotels, select \"Disneyland Paris B&B Hotel\""
        throw new UnsupportedOperationException();
    }

    public void clickOnOurHotelsMenu() {
        // TODO: Implement action: "Click on \"Our hotels\" menu"
        throw new UnsupportedOperationException();
    }

    public void clickOnMyBookings() {
        // TODO: Implement action: "Click on My bookings"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheBookingIsWellRegisteredWithTheCorrectInformationBookingDateHotelNameHotelAddressHotelPhoneNumberHotelEmailCheckinAndCheckoutDateNumberOfNightsroomspersonsTotalPriceRestToPayCancellationInformation() {
        // TODO: Implement action: "Check that the booking is well registered, with the correct information: 
        // - Booking date 
        // - Hotel name 
        // - Hotel address 
        // - Hotel phone number 
        // - Hotel email 
        // - Check-in and check-out date 
        // - Number of nights/rooms/persons 
        // - Total price 
        // - Rest to pay 
        // - Cancellation information"
        throw new UnsupportedOperationException();
    }

    public void clicOnNextStep() {
        // TODO: Implement action: "Clic on Next step"
        throw new UnsupportedOperationException();
    }

    public void checkThatUserAccountPropertiesAreTheSameAsSalesforceValues() {
        // TODO: Implement result: "Check that user account properties are the same as Salesforce values"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheAccountIsCreatedAndTheUserIsLoggedIn() {
        // TODO: Implement result: "Check that the account is created and the user is logged in"
        throw new UnsupportedOperationException();
    }

    public void checkThatThereIsNoErrorMessageDueToFirstnameOrLastnameInvalidChars() {
        // TODO: Implement result: "Check that there is no error message due to Firstname or Lastname invalid chars"
        throw new UnsupportedOperationException();
    }

    public void goBackToTheHomepage() {
        // TODO: Implement action: "Go back to the Homepage"
        throw new UnsupportedOperationException();
    }

    public void fillAValidPasswordAndConfirmIt() {
        // TODO: Implement action: "Fill a valid password and confirm it"
        throw new UnsupportedOperationException();
    }

    public void checkInSalesforceThatTheBoxHasAWebAccountIsChecked() {
        // TODO: Implement result: "Check in Salesforce that the box \"Has a Web Account\" is checked"
        throw new UnsupportedOperationException();
    }

    public void checkTheBoxISubscribeToBBHotelsNewsletterCheckBBNewsletterIAcceptTermsOfConditionsByBBHotels(String checkBbNewsletter) {
        // TODO: Implement action: String.format("Check the box : 
        // - I subscribe to B&B Hotels Newsletter = %s
        // - I accept Terms of conditions by B&B Hotels", check_bb_newsletter)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsUserCreationBooking(String email, String firstname, String lastname, String country, String phone, String additionalPhone, String address, String zipcode, String city, String invoiceEnableAddress, String invoiceCompany, String invoiceAddress, String invoiceZipcode, String invoiceCity, String invoiceCountry, String invoiceNationality, String createAccount) {
        // TODO: Implement action: String.format("Fill the account fields :
        // - Email = %s
        // - First name = %s
        // - Last name = %s
        // - Country = %s
        // - Telephone = %s
        // - Additional phone number = %s
        // - Address = %s
        // - Zipcode = %s
        // - City = %s
        // - Different invoice address enabled = %s
        // - Different invoice company = %s
        // - Different invoice address = %s
        // - Different invoice zipcode = %s
        // - Different invoice city = %s
        // - Different invoice country = %s
        // - Different invoice nationality = %s
        // - I want to create an account = %s", email, firstname, lastname, country, phone, additional_phone, address, zipcode, city, invoice_enable_address, invoice_company, invoice_address, invoice_zipcode, invoice_city, invoice_country, invoice_nationality, create_account)
        throw new UnsupportedOperationException();
    }

    public void missingValueIsFramedInRedAccountCreationIsNotAllowed() {
        // TODO: Implement result: "Missing value is framed in red , account creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheEmailAddressFieldIsFramedInRedAccountCreationIsNotAllowed() {
        // TODO: Implement result: "Check that  the email address field is framed in red, account creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void checkThatThereIsNoDuplicateAccountWithEmailAddressUserbnbtest1spayopmailcom() {
        // TODO: Implement result: "Check that there is no duplicate account with email address user.bnb.test1.spa@yopmail.com"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheAccountCreationIsNotAllowedMessageSuchUserAlreadyExistsOnTheSitePleaseUseAnotherEmail() {
        // TODO: Implement result: "Check that  the  account creation is not allowed. Message : \"Such user already exists on the site. Please, use another email\""
        throw new UnsupportedOperationException();
    }

    public void checkThatTheUserIsNotLoggedInWithTheNewCRMAccount() {
        // TODO: Implement result: "Check that the user is not logged in with the new CRM account"
        throw new UnsupportedOperationException();
    }

    public void checkInSalesforceThatTheBoxHasAWebAccountIsUnchecked() {
        // TODO: Implement result: "Check in Salesforce that the box \"Has a Web Account\" is unchecked"
        throw new UnsupportedOperationException();
    }

    public void checkThatThePasswordFieldIsFramedInRedAccountCreationIsNotAllowed() {
        // TODO: Implement result: "Check that the password field is framed in red, account creation is not allowed"
        throw new UnsupportedOperationException();
    }

    public void enableIWantToCreateAnAccount() {
        // TODO: Implement action: "Enable \"I want to create an account\""
        throw new UnsupportedOperationException();
    }

    public void fillConfirmPasswordPassword(String password) {
        // TODO: Implement action: String.format("Fill confirm password = %s", password)
        throw new UnsupportedOperationException();
    }

    public void fillPasswordConfirmPassword(String password) {
        // TODO: Implement action: String.format("Fill password = %s", password)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsFirstNameWhateverFirstnameLastNameWhateverLastnameEmailAddressWhateverValidEmailWhichIsNotAnExistingAccountEmailIsToRememberConfirmEmailAddressWhateverValidEmailWhichIsNotAnExistingAccountEmailIsToRememberCountryWhateverCountry() {
        // TODO: Implement action: "Fill the account fields :  
        // - First name = whatever firstname
        // - Last name = whatever lastname
        // - Email address = whatever valid email which is not an existing account. Email is to remember.
        // - Confirm email address = whatever valid email which is not an existing account. Email is to remember.
        //  Country = whatever country"
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsFirstnameFirstnameLastnameLastnamePhoneTelephoneEmailAddressWhateverValidEmailWhichIsNotAnExistingAccountEmailIsToRememberConfirmEmailAddressWhateverValidEmailWhichIsNotAnExistingAccountEmailIsToRememberCountryCountryEnableCheckboxIAcceptTheTermsOfConditionsOfBBHotels(String firstname, String lastname, String phione, String country) {
        // TODO: Implement action: String.format("Fill the account fields:
        // - Firstname = %s
        // - Lastname = %s
        // - Phone = %s
        // - Email address = whatever valid email which is not an existing account. Email is to remember.
        // - Confirm email address = whatever valid email which is not an existing account. Email is to remember.
        // - Country = %s
        // - Enable checkbox I accept the Terms of conditions of B&B Hotels", firstname, lastname, phione, country)
        throw new UnsupportedOperationException();
    }

    public void fillAllowedValuesForTheseFieldsFirstNameLastNamePhoneEmailAddressUserbnbtest1spayopmailcomConfirmEmailAddressUserbnbtest1spayopmailcomCountry() {
        // TODO: Implement action: "Fill allowed values for these fields:
        // - First name
        // - Last name
        // - Phone
        // - Email address = user.bnb.test1.spa@yopmail.com
        // - Confirm Email address = user.bnb.test1.spa@yopmail.com
        // - Country"
        throw new UnsupportedOperationException();
    }

    public void checkTheBoxesBySubscribingIAcceptToReceiveByEmailAboutTheLoyaltyProgramCheckReceiveLoyaltyReceiveBBHotelsPromotionsByEmailCheckReceivePromoBbReceiveDetailsOfPartnerPromotionsCheckReceivePromoPartnerIAcceptTheTermsOfConditionsOfBBHotelsCheck(String loyaltyProgram, String promotionsBb, String partnerPromotion) {
        // TODO: Implement action: String.format("Check the boxes : 
        // - By subscribing, I accept to receive by e-mail about the loyalty program = %s
        // - Receive B&B Hotels promotions by e-mail! = %s
        // - Receive details of partner promotions = %s
        // - I accept the Terms of conditions of B&B Hotels = Check", loyalty_program, promotions_bb, partner_promotion)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsForUserCreation(String email, String password, String firstname, String lastname, String country, String phone, String additionalPhone) {
        // TODO: Implement action: String.format("Fill the account fields :
        // - Email = %s
        // - Password = %s
        // - First name = %s
        // - Last name = %s
        // - Country = %s
        // - Telephone = %s
        // - Additional phone number = %s
        // ", email, password, firstname, lastname, country, phone, additional_phone)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountMandatoryFieldsUserCreation(String email, String password, String firstname, String lastname, String country, String telephone) {
        // TODO: Implement action: String.format("Fill the account fields:
        // - Email = %s
        // - Password = %s
        // - Firstname = %s
        // - Lastname = %s
        // - Country = %s
        // - Telephone = %s
        // ", email, password, firstname, lastname, country, phone)
        throw new UnsupportedOperationException();
    }

    public void fillEmailAddressEmail(String email) {
        // TODO: Implement action: String.format("Fill email address = %s", email)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheEmailAddressFieldIsFramedInRedAccountCreationIsNotAllowedMessageUserWithSuchEmailAlreadyExists() {
        // TODO: Implement result: "Check that  the email address field is framed in red, account creation is not allowed. Message : \"User with such email already exists\""
        throw new UnsupportedOperationException();
    }

    public void fillEmailAddressUserbnbtest1spayopmailcom() {
        // TODO: Implement action: "Fill Email address = user.bnb.test1.spa@yopmail.com"
        throw new UnsupportedOperationException();
    }

    public void fillEmailAddressUserbnbtest10spayopmailcom() {
        // TODO: Implement action: "Fill Email address = user.bnb.test10.spa@yopmail.com"
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsEmailWhateverValidEmailWhichIsNotAnExistingAccountEmailIsToRememberPasswordPasswordFirstNameFirstnameLastNameLastnameCountryCountry(String password, String firstname, String lastname, String country) {
        // TODO: Implement action: String.format("Fill the account fields : 
        // - Email = whatever valid email which is not an existing account. Email is to remember. 
        // - Password = %s 
        // - First name = %s 
        // - Last name = %s 
        // - Country = %s 
        // - Phone number = %s", password, firstname, lastname, country, phone)
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsEmailWhateverValidEmailWhichIsNotAnExistingAccountEmailIsToRememberPasswordWhateverValidPasswordFirstNameWhateverFirstnameLastNameWhateverLastnameCountryWhateverCountry() {
        // TODO: Implement action: "Fill the account fields : 
        // - Email = whatever valid email which is not an existing account. Email is to remember.   
        // - Password = whatever valid password 
        // - First name = whatever firstname 
        // - Last name = whatever lastname  
        // - Country = whatever country"
        throw new UnsupportedOperationException();
    }

    public void fillTheAccountFieldsFirstnameFirstnameLastnameLastnamePhoneTelephoneEmailAddressEmailConfirmEmailAddressEmailConfirmCountryCountryDifferentInvoiceAddressEnabledYesInvoiceCountryInvoiceCountryIAcceptTheTermsOfConditionsOfBBHotelsCheckAcceptTerms(String firstname, String lastname, String phone, String email, String confirmEmail, String country, String invoiceCountry, String checkConditions) {
        // TODO: Implement action: String.format("Fill the account fields:
        // - Firstname = %s
        // - Lastname = %s
        // - Phone = %s
        // - Email address = %s
        // - Confirm email address %s
        // - Country = %s
        // - Different invoice address enabled = Yes
        // - Invoice country = %s
        // - I accept the Terms of conditions of B&B Hotels = %s
        // ", firstname, lastname, phone, email, confirm_email, country, invoice_country, check_conditions)
        throw new UnsupportedOperationException();
    }

    public void selectCurrencyOnTheHeader(String currency, String freeText) {
        // TODO: Implement action: String.format("Select Currency = %s  on the header menu", currency)
        throw new UnsupportedOperationException();
    }

    public void selectCurrencyOnTheFooter(String currency) {
        // TODO: Implement action: String.format("Select currency = %s on the footer", currency)
        throw new UnsupportedOperationException();
    }

    public void checkThatCookiesConsentPopinIsDisplayedAtTheFirstConnectionToTheWebsite() {
        // TODO: Implement result: "Check that cookies consent pop-in is displayed at the first connection to the website"
        throw new UnsupportedOperationException();
    }

    public void fillAllowedValuesForTheseFieldsPasswordFirstNameLastNameCountryPhoneNumber() {
        // TODO: Implement action: "Fill allowed values for these fields:
        // - Password
        // - First Name
        // - Last Name
        // - Country
        // - Phone number"
        throw new UnsupportedOperationException();
    }

    public void fillAllowedValuesForTheseFieldsFirstNameLastNameCountryPhoneNumber() {
        // TODO: Implement action: "Fill allowed values for these fields:  
        // - First Name  
        // - Last Name  
        // - Country 
        // - Phone number"
        throw new UnsupportedOperationException();
    }

    public void statusOfNotification(String notification) {
        // TODO: Implement action: String.format("Click on Notification are %s", Notification)
        throw new UnsupportedOperationException();
    }

    public void resultNotification(String display) {
        // TODO: Implement result: String.format("Check that notification %s appears", display)
        throw new UnsupportedOperationException();
    }

    public void connectToMyAccount() {
        // TODO: Implement action: "Click on \"Connect to my account\""
        throw new UnsupportedOperationException();
    }

    public void checkThatThePhoneNumberCannotBeFilledLettersAndSpecialCharsAreNotAllowed() {

    }

    public void preconditionDisconnected() {
        // TODO: Implement action: "You have to be disconnected"
        throw new UnsupportedOperationException();
    }

    public void connected() {
        // TODO: Implement result: "You are connected"
        throw new UnsupportedOperationException();
    }

    public void preconditionConnected() {
        // TODO: Implement action: "Precondition : You have to be connected"
        throw new UnsupportedOperationException();
    }

    public void chooseBookingShortcuts(String shortcuts) {
        // TODO: Implement action: String.format("Click on %s", shortcuts)
        throw new UnsupportedOperationException();
    }

    public void pickAnEvent() {
        // TODO: Implement action: "Pick an event"
        throw new UnsupportedOperationException();
    }

    public void checkThatAllFieldAreCorrectlyFill() {
        // TODO: Implement action: "Check that all field are correctly fill"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheWholePasswordCannotBeFilledPasswordIsLimitedTo30Chars() {

    }

    public void reviewsPage() {
        // TODO: Implement action: "Click on \"Reviews\""
        // TODO: Implement result: "The page of reviews is diplayed"
        // TODO: Implement action: "Close the page"
        // TODO: Implement result: "Go bak to the result page"
        throw new UnsupportedOperationException();
    }

    public void checkThatAllInvoiceFieldsValuesAreKeptInSalesforceForThisUser() {
        // TODO: Implement result: "Check that all invoice fields values are kept in Salesforce for this user"
        throw new UnsupportedOperationException();
    }

    public void checkLinksInAccountConfirmationMail() {
        // TODO: Implement action: "Check that the following links in the mail are working well :
        // - Make a booking
        // - Access my account
        // - GTC
        // - FAQ
        // - Legal Notice
        // - Contact us
        // - Follow us"
        throw new UnsupportedOperationException();
    }

    public void createGuest(String creationGuest, String visibleGuest) {
        // TODO: Implement action: String.format("On the %s, create a new guest", creation_guest)
        // TODO: Implement result: String.format("Check that this new guest is visible on %s", visible_guest)
        throw new UnsupportedOperationException();
    }

    public void checkInformation() {
        // TODO: Implement result: "All information have to be the same"
        throw new UnsupportedOperationException();
    }

    public void accountWebMobile(String device1, String device2, String operation) {
        // TODO: Implement action: String.format("%s an account on %s", operation, device1)
        // TODO: Implement action: String.format("Connect with this account on %s", device2)
        throw new UnsupportedOperationException();
    }

    public void checkLinksInBookingConfirmationMail() {
        // TODO: Implement result: "Check that the following links in the mail are working well : 
        // - Getting to the hotel 
        // - Access my booking
        // - Cancel my booking
        // - My account"
        // TODO: Implement result: "Check that the following links in the mail footer are working well : 
        // - GTC
        // - FAQ
        // - Legal Notice
        // - Contact us
        // - Follow us"
        throw new UnsupportedOperationException();
    }

    public void checkThatLastCharIsNotWrittenEmailFieldLengthIsLimitedTo254CharsMax() {
        // TODO: Implement result: "Check that last char is not written, email field length is limited to 254 chars max"
        throw new UnsupportedOperationException();
    }

    public void afterAFewMinutesCheckInTheGivenMailboxThatANewMailP1FromAccountemailhotelbbcomIsReceived(String p1) {
        // TODO: Implement result: "After a few minutes, check in the given mailbox that a new mail \"Account confirmation\" from account@email.hotel-bb.com is received"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheFollowingInformationIsGivenInThisMailFirstnameAndLastnameUsernameEmailAddress() {
        // TODO: Implement result: "Check that the following information is given in this mail: - Firstname and lastname - Username (email address)"
        throw new UnsupportedOperationException();
    }

    public void fillAllowedValuesForTheseFieldsFirstNameLastNamePhoneEmailAddressEmailCountry(String email) {
        // TODO: Implement action: String.format("Fill allowed values for these fields: - First Name - Last Name - Phone - Email address = %s - Country", email)
        throw new UnsupportedOperationException();
    }

    public void followTheNextStepsAndFinalizeTheBooking() {
        // TODO: Implement action: "Follow the next steps and finalize the booking"
        throw new UnsupportedOperationException();
    }

    public void setReceivedBBHotelsPromotionsByEmailCheckReceivePromoBbSetReceivedDetailsOfPartnerPromotionsCheckReceivePromoPartner(String checkReceivePromoBb, String checkReceivePromoPartner) {
        // TODO: Implement action: String.format("Set Received B&B Hotels promotions by email = %s", check_receive_promo_bb)
        // TODO: Implement action: String.format("Set Received details of partner promotions = %s", check_receive_promo_partner)
        throw new UnsupportedOperationException();
    }

    public void clickOnModifyInformations() {
        // TODO: Implement action: "Click on Modify informations"
        throw new UnsupportedOperationException();
    }

    public void updateTheAccountFieldsFirstNameFirstnameLastNameLastnameTelephoneTelephoneTelephone2Telephone2AddressAddressZipcodeZipcodeCityCityCountryCountryNationalityNationalityDifferentInvoiceAddressEnabledEnableDifferentInvoiceInvoiceCompanyInvoiceCompanyInvoiceAddressInvoiceAddressInvoiceZipcodeInvoiceZipcodeInvoiceCityInvoiceCityInvoiceCountryInvoiceCountry(String firstname, String lastname, String telephone, String telephone2, String address, String zipcode, String city, String country, String nationality, String enableDifferentInvoice, String invoiceCompany, String invoiceAddress, String invoiceZipcode, String invoiceCity, String invoiceCountry) {
        // TODO: Implement action: String.format("Update the account fields:  - First name= %s  - Last name= %s  - Telephone= %s  - Telephone 2 = %s - Address= %s  - Zipcode= %s - City= %s - Country = %s - Nationality = %s - Different invoice address enabled = %s - Invoice company = %s - Invoice address = %s - Invoice zipcode = %s - Invoice city = %s - Invoice country =  %s", firstname, lastname, telephone, telephone2, address, zipcode, city, country, nationality, enable_different_invoice, invoice_company, invoice_address, invoice_zipcode, invoice_city, invoice_country)
        throw new UnsupportedOperationException();
    }

    public void ifAvailableSetPromotionsSubscriptionsPartnerPromotionCheckReceivePromoPartnerBBPromotionCheckReceivePromoBb(String checkReceivePromoPartner, String checkReceivePromoBb) {
        // TODO: Implement action: String.format("If available, set promotions subscriptions :  - Partner promotion = %s - B&B promotion = %s", check_receive_promo_partner, check_receive_promo_bb)
        throw new UnsupportedOperationException();
    }

    public void checkThatThePageWelcomeBackUserIsDisplayed() {
        // TODO: Implement action: "Check that the page Welcome back User is displayed"
        throw new UnsupportedOperationException();
    }

    public void checkThatAnErrorMessageIsDisplayedSignInIsNotAllowed() {
        // TODO: Implement action: "Check that an error message is displayed, sign in is not allowed"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheRecommendationDisplaysRoomsInTheOrderDefinedWithinTheExcelFileWhenPricesAreEqualsHttpsdocsgooglecomspreadsheetsd1GxjdPlBRBtT7ktWAH3Af7DHqCFnzopY1vc6jTG1qseditgid1399285832() {
        // TODO: Implement action: "Check that the recommendation displays rooms in the order defined within the Excel file when prices are equals (https://docs.google.com/spreadsheets/d/1Gxjd__PlBRBtT7ktWAH3Af7DHqCFnzopY1vc6jTG1qs/edit#gid=1399285832)"
        throw new UnsupportedOperationException();
    }

    public void enableTheFilterFilterName(String filterName) {
        // TODO: Implement action: String.format("Enable the filter %s", filter_name)
        throw new UnsupportedOperationException();
    }

    public void checkThatTheDisplayedRoomsMatchTheFilterValue() {

    }

    public void afterAFewMinutesCheckInTheGivenMailboxThatANewMailBookingConfirmationFromBookingemailhotelbbcomIsReceived(String bookingConfirmation) {
        // TODO: Implement result: "After a few minutes, check in the given mailbox that a new mail \"Booking confirmation\" from booking@email.hotel-bb.com is received"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheFollowingInformationIsGivenInThisMailFirstnameAndLastnameBookingNumberHotelNameCheckingDateAndNumberOfNightsHotelDetailsYourStayMainInformationAboutTheBookingBookingNumberAndDateDateOfStayNumberOfNightsNumberOfRoomsNumberOfPeopleSpecialRequestDetailsTypeOfRoomsRoomOptionsPriceTotalPriceNameOfPersonWhoBookedPersonalDetailsBookingNumber() {
        // TODO: Implement action: "Check that the following information is given in this mail: - Firstname and lastname - Booking number - Hotel name, checking date and number of nights - Hotel details,  - Your stay : main information about the booking (booking number and date, date of stay, number of nights, number of rooms, number of people, special request)  - Details : type of room(s), room & options price, total price - Name of person who booked : personal details, booking number"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheFollowingInformationIsGivenInThisMailBookingIsCancelledFirstnameAndLastnameBookingNumberHotelNameCheckingDateAndNumberOfNightsHotelDetailsYourStayMainInformationAboutTheBookingBookingNumberAndDateDateOfStayNumberOfNightsNumberOfRoomsNumberOfPeopleSpecialRequestDetailsTypeOfRoomsRoomOptionsPriceTotalPriceNameOfPersonWhoBookedPersonalDetailsBookingNumber() {
        // TODO: Implement result: "Check that the following information is given in this mail: - Booking is cancelled - Firstname and lastname - Booking number - Hotel name, checking date and number of nights - Hotel details,  - Your stay : main information about the booking (booking number and date, date of stay, number of nights, number of rooms, number of people, special request)  - Details : type of room(s), room & options price, total price - Name of person who booked : personal details, booking number"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheFirstnameLastnameEmailAddressAndPhoneNumberAreFilledWithUserAccountValues() {
        // TODO: Implement result: "Check that the firstname, lastname, email address and phone number are filled with user account values"
        throw new UnsupportedOperationException();
    }

    public void operationABookingOnDevice1() {

    }

    public void checkInformationsOnDevice2() {

    }

    public void actionTheApplication() {

    }

    public void checkThatTheActionHasBeenDoneCorrectly(String action) {
        // TODO: Implement result: String.format("Check that the %s has been done correctly", Action)
        throw new UnsupportedOperationException();
    }

    public void checkBoxIAcceptTheTermsOfConditionsOfBBHotelsUserCreationFromBooking(String checkTermsAcceptance) {
        // TODO: Implement action: String.format("Check box \"I accept the Terms of conditions of B&B Hotels\" : %s", checkTermsAcceptance)
        throw new UnsupportedOperationException();
    }

    public void clickOnEditMyProfile() {
        // TODO: Implement action: "Click on Edit my profile"
        throw new UnsupportedOperationException();
    }

    public void checkThatTheMessageYourChangesHaveBeenTakenIntoAccountIsDisplayed() {
        // TODO: Implement action: "Check that the message \"Your changes have been taken into account\" is displayed"
        throw new UnsupportedOperationException();
    }

    public void enableOptionDifferentInvoiceAddressFromBooking() {
        // TODO: Implement action: "Enable option Different invoice address"
        throw new UnsupportedOperationException();
    }

    public void mobileMyAccountSignIn(String email, String password) {
        mobileMyAccount();
        mobileMyAccountConnectMyAccount();
        mobileSignInEmail(email);
        mobileSignInPassword(password);
    }

    public void mobileMyAccount() {
        // TODO: Implement action: "Click on \"My account\" on the right corner of the screen"
        throw new UnsupportedOperationException();
    }

    public void mobileMyAccountConnectMyAccount() {
        // TODO: Implement action: "Click on \"Connect to my account\""
        throw new UnsupportedOperationException();
    }

    public void mobileSignInEmail(String email) {
        // TODO: Implement action: String.format("Enter an email address
        // email = %s", email)
        throw new UnsupportedOperationException();
    }

    public void mobileSignInPassword(String password) {
        // TODO: Implement action: String.format("Enter the password
        // password = %s", password)
        throw new UnsupportedOperationException();
    }

    public void mobileCheckMyAccountUserConnected(String name) {
        // TODO: Implement result: String.format("The name of the user is displayed on the page \"My Account\"
        // name = %s", name)
        throw new UnsupportedOperationException();
    }

    public void mobileBookingUserConnectedPaid(String email, String password, String hotelName, String dateCheckin, String dateCheckout, String nbRoom, String nbGuest, String room1, String room2, String room3, String guest1, String guest2, String guest3, String cardNumber, String expiryDate, String cvc, String option1Room1, String option1Room2, String option1Room3, String option2Room1, String option2Room2, String option2Room3, String option3Room1, String option3Room2, String option3Room3, String cardLegalCheck) {
        mobileMyAccountSignIn(email, password);
        mobileBook();
        mobileTunnelSearchHotelName(hotelName);
        mobileTunnelDate(dateCheckin, dateCheckout);
        mobileTunnelRoomGuests(nbRoom, nbGuest);
        mobileTunnelFindClick();
        mobileTunnelChooseRoom(room1, room2, room3);
        mobileTunnelIdentityUserGuest(guest1, guest2, guest3);
        mobileTunnelOptions(option1Room1, option2Room1, option3Room1, option1Room2, option2Room2, option3Room2, option1Room3, option2Room3, option3Room3);
        mobileTunnelOnlinePaiementCC(cardNumber, expiryDate, cvc, cardLegalCheck);
    }

    public void mobileCheckCheckinOnlineMyStaysButton(String nameHotel) {
        mobileBookingDetails(nameHotel);
        // TODO: Implement result: "Check that the button to register online is present."
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineButtonClick(String room) {
        // TODO: Implement action: String.format("Click on \"Register online check-in\"
        // room = %s", room)
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineIdentityNoModificationContact() {
        // TODO: Implement action: "Click on \"Continue\""
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineIdentityChoiceNotification(String notification) {
        // TODO: Implement action: String.format("Choice the notification by SMS
        // Notification = %s", notification)
        // TODO: Implement action: "Click to continue"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineIdentityLegal(String legalCOIdentity) {
        // TODO: Implement action: String.format("Check the legal conditions
        // checkLegal = %s", legalCOIdentity)
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineIdentityMyStaysButtonStatus(String nameHotel) {
        mobileBookingDetails(nameHotel);
        // TODO: Implement result: "Check that the status of the button has changed"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineConfirmation() {
        // TODO: Implement action: "Click to continue"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineBookingCode() {
        // TODO: Implement result: "Booking code (room+access) are displayed
        // "
        throw new UnsupportedOperationException();
    }

    public void mobileBook() {
        // TODO: Implement action: "Click on \"Book\" on the menu"
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelSearchHotelName(String hotelName) {
        mobileBook();
        // TODO: Implement action: "Click on the field to fill the hotel"
        // TODO: Implement action: "Click on the search bar on \"Where do you go ?\""
        // TODO: Implement action: "Click on the search bar on \"Search a location\""
        // TODO: Implement action: String.format("Enter the name of the hotel
        // name = %s", hotelName)
        // TODO: Implement action: "Click on the hotel on the list"
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelDate(String firstDate, String endDate) {
        mobileBook();
        // TODO: Implement action: String.format("Choose the date of begin of the stay
        // firstDate = %s", firstDate)
        // TODO: Implement action: String.format("Choose the date of the end of the saty
        // endDate = %s", endDate)
        // TODO: Implement action: "Click on \"Done\""
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelRoomGuests(String nbroom, String nbguest) {
        mobileBook();
        // TODO: Implement action: "Click on the field room and guest"
        // TODO: Implement action: String.format("Select the number of the room
        // nbroom = %s", nbroom)
        // TODO: Implement action: String.format("Select the number the guest
        // guest = %s", nbguest)
        // TODO: Implement action: "Click on \"Done\" on the page \"Who stays?\""
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelFindClick() {
        // TODO: Implement action: "Click on \"Find\" button"
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelChooseRoom(String room1, String room2, String room3) {
        // TODO: Implement action: "Click on \"Choose other rooms\""
        // TODO: Implement action: String.format("Click on rooms to book
        // room 1 : %s
        // room 2 : %s
        // room 3 : %s", room1, room2, room3)
        // TODO: Implement action: "Click on \"Continue\""
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelIdentityUserGuest(String guest1, String guest2, String guest3) {
        // TODO: Implement action: "For room1 , click on \"manage guests\""
        // TODO: Implement action: String.format("Choose the sleeper of the room
        // guest = %s", guest1)
        // TODO: Implement action: "For room2, click on \"manage guests\""
        // TODO: Implement action: String.format("Choose the sleeper of the room 
        // guest = %s", guest2)
        // TODO: Implement action: "For room3, click on \"manage guests\""
        // TODO: Implement action: String.format("Choose the sleeper of the room  
        // guest = %s", guest3)
        // TODO: Implement action: "Click on \"Continue\""
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelOptions(String option1room1, String option2room1, String option3room1, String option1room2, String option2room2, String option3room2, String option1room3, String option2room3, String option3room3) {
        // TODO: Implement action: String.format("Select the option for the room
        // option1room1 = %s
        // option2room1 = %s
        // option3room1 = %s
        // option1room2 = %s
        // option2room2 = %s
        // option3room2 = %s
        // option1room3 = %s
        // option2room3 = %s
        // option3room3 = %s", option1room1, option2room1, option3room1, option1room2, option2room2, option3room2, option1room3, option2room3, option3room3)
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelOnlinePaiementCC(String cardNumber, String expiryDate, String cvc, String cardLegalCheck) {
        // TODO: Implement action: "Select \"Online payment\" on the page \"Payment method\""
        // TODO: Implement action: "Click on continue"
        // TODO: Implement action: "Select \"i agree with B&B term & conditions\""
        // TODO: Implement action: "Click on \"Credit Card\" "
        // TODO: Implement action: String.format("Fill all field of the credit card
        // Card number = %s
        // Expiry Date = %s
        // CVC = %s
        // cardLegalCheck= %s", cardNumber, expiryDate, cvc, cardLegalCheck)
        // TODO: Implement action: "Click on \"Pay\""
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelConfirmation() {
        // TODO: Implement action: "Click on \"OK\" on the confirmation page"
        throw new UnsupportedOperationException();
    }

    public void mobileBookingOfflineNotPaid(String email) {
        // TODO: Implement action: String.format("Make a reservation without the application
        // email = %s", email)
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineEmailClick() {
        // TODO: Implement action: "Click on the button for check-in online on the email"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineIdentityPaiement(String cardNumber, String expiryDate, String cvc, String cardLegalCheck) {
        // TODO: Implement action: "Select \"i agree with B&B term & conditions\""
        // TODO: Implement action: "Click on \"Credit Card\" "
        // TODO: Implement action: String.format("Fill all field of the credit card 
        // Card number = %s 
        // Expiry Date = %s 
        // CVC = %s
        // cardLegalCheck = %s", cardNumber, expiryDate, cvc, cardLegalCheck)
        // TODO: Implement action: "Click on \"Pay\""
        throw new UnsupportedOperationException();
    }

    public void mobileBookingModification() {
        // TODO: Implement action: "Modification of the booking in PMS"
        throw new UnsupportedOperationException();
    }

    public void mobileMyStays() {
        // TODO: Implement action: "Click on \"My stays\" on the menu"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineLeave() {
        // TODO: Implement action: "Close the application"
        // TODO: Implement action: "Reopen the application"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineEmail() {
        // TODO: Implement result: "Check that you receive email"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineDeactiveButton(String hotelName) {
        mobileBookingDetails(hotelName);
        // TODO: Implement result: "Check that the register online button is not clikable"
        // TODO: Implement action: "Click to return to \"My stays\" page"
        throw new UnsupportedOperationException();
    }

    public void mobileBookingDetails(String nameHotel) {
        mobileMyStays();
        // TODO: Implement action: String.format("Click on the booking
        // nameHotel = %s", nameHotel)
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineDeactiveEmail() {
        // TODO: Implement action: "Go to your mail"
        // TODO: Implement result: "Check that the button to register online is not active"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineBookingCodeEmail() {
        // TODO: Implement result: "Check in your mail that there are booking code (room + access)"
        throw new UnsupportedOperationException();
    }

    public void mobileBookingNoAccountPaid(String hotelName, String dateCheckin, String dateCheckout, String nbRoom, String nbGuest, String room1, String room2, String room3, String firstName, String lastName, String phoneNumber, String email, String guest1, String guest2, String guest3, String option1Room1, String option2Room1, String option3Room1, String option1Room2, String option2Room2, String option3room3, String option2Room3, String option1Room3, String cardNumber, String expiryDate, String cvc, String cardLegalCheck) {
        mobileBook();
        mobileTunnelSearchHotelName("namehotel");
        mobileTunnelDate(dateCheckin, dateCheckout);
        mobileTunnelRoomGuests(nbRoom, nbGuest);
        mobileTunnelFindClick();
        mobileTunnelChooseRoom(room1, room2, room3);
        mobileTunnelIdentityUser(firstName, "lasteName", email, phoneNumber);
        mobileTunnelIdentityUserGuest(guest1, guest2, guest3);
        mobileTunnelOptions(option1Room1, option2Room1, option3Room1, option1Room2, option2Room2, "option3room2", option1Room3, option2Room3, option3room3);
        mobileTunnelOnlinePaiementCC(cardNumber, expiryDate, cvc, cardLegalCheck);
    }

    public void mobileCheckinOnlineIdentityModification(String newEmail, String newPhone) {
        // TODO: Implement action: "Click on \"Modify\""
        // TODO: Implement action: String.format("Enter a new email address
        // newEmail =%s", newEmail)
        // TODO: Implement action: String.format("Enter a new phone Number
        // newPhone = %s", newPhone)
        // TODO: Implement action: "Click on \"Validate\""
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelIdentityUser(String firstName, String lastName, String email, String phoneNumber) {
        // TODO: Implement action: "Click on \"You\""
        // TODO: Implement action: String.format("Fill all field
        // firstName = %s
        // lastName = %s
        // email = %s
        // phoneNumber = %s", firstName, lastName, email, phoneNumber)
        // TODO: Implement action: "Click on \"Save\""
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineStep5() {
        // TODO: Implement action: "Click on \"Register online\""
        throw new UnsupportedOperationException();
    }

    public void mobileBookingNoAccountNotPaid(String hotelName, String dateCheckin, String dateCheckout, String nbRoom, String nbGuest, String room1, String room2, String room3, String firstName, String lastName, String email, String phoneNumber, String guest1, String guest2, String guest3, String cardNumber, String expiryDate, String cvc, String option1Room1, String option1Room2, String option1Room3, String option2Room1, String option2Room2, String option2Room3, String option3Room1, String option3Room2, String option3Room3, String cardLegalCheck) {
        mobileBook();
        mobileTunnelSearchHotelName(hotelName);
        mobileTunnelDate(dateCheckin, dateCheckout);
        mobileTunnelRoomGuests(nbRoom, nbGuest);
        mobileTunnelFindClick();
        mobileTunnelChooseRoom(room1, room2, room3);
        mobileTunnelIdentityUser(firstName, lastName, email, phoneNumber);
        mobileTunnelIdentityUserGuest(guest1, guest2, guest3);
        mobileTunnelOptions(option1Room1, option2Room1, option3Room1, option1Room2, option2Room2, option3Room2, option1Room3, option2Room3, option3Room3);
        mobileTunnelGuaranteedReservationCC(cardNumber, expiryDate, cvc, "cardLegalCheck");
    }

    public void mobileTunnelGuaranteedReservationCC(String cardNumber, String expiryDate, String cvc, String cardLegalCheck) {
        // TODO: Implement action: "Select \"Guaranteed Reservation\" on the page \"Payment method\""
        // TODO: Implement action: "Click on continue"
        // TODO: Implement action: "Select \"i agree with B&B term & conditions\""
        // TODO: Implement action: "Click on \"Credit Card\" "
        // TODO: Implement action: String.format("Fill all field of the credit card 
        // Card number = %s 
        // Expiry Date = %s 
        // CVC = %s
        //  cardLegalCheck = %s", cardNumber, expiryDate, cvc, cardLegalCheck)
        // TODO: Implement action: "Click on \"Pay\""
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineNoContact() {
        // TODO: Implement result: "Check that you stay on the page to modify email and phone"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineNoLegal() {
        // TODO: Implement action: "Click on \"Continue\""
        // TODO: Implement result: "Check that you stay in the same page "
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineMyStaysNoButton(String hotelName) {
        mobileBookingDetails(hotelName);
        // TODO: Implement result: "check that there are no button to register online"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineNoEmail() {

    }

    public void mobileBookingCancellation() {
        // TODO: Implement action: "Cancellation of the booking"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineNoBookingCode() {
        mobileBookingDetails("");
        // TODO: Implement result: "Check that there are no booking code (room+access)"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinOnlineNoPayement() {
        // TODO: Implement result: "Check that you stay on this page, no possibilty to confirm the online checkin online"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckCheckinNoModification() {
        // TODO: Implement result: "Check that is not possible de modify the booking"
        throw new UnsupportedOperationException();
    }

    public void mobileCheckinOnlineCancellation() {

    }

    public void mobileCheckCheclinOnlineNoCancellation() {
        // TODO: Implement result: "Check that impossible to cancel the booking"
        throw new UnsupportedOperationException();
    }

    public void mobileCancellation() {

    }

    public void webBookingUserNotConnectedNotPaid(String where, String dateCheckin, String dateCheckout, String nbRooms, String nbAdults, String nbChildren, String room1, String room2, String room3, String option1, String option2, String option3, String nbOption1, String nbOption2, String nbOption3, String firstName, String lastName, String phoneNumber, String email, String legalTunnel, String adultsRoom1, String adultsRoom3, String childrenRoom1, String childrenRoom2, String childrenRoom3, String lastNameGuest3, String lastNameGuest2, String lastNameGuest1, String firstNameGuest1, String firstNameGuest2, String firstNameGuest3, String adultsRoom2, String expiryDate, String cvc, String cardNumber, String nameCard, String cardLegalCheck, String address, String zipcode, String city, String country, String citizenship, String ageChildrenRoom1, String ageChildrenRoom2, String ageChildrenRoom3) {
        searchAHotelFromHomePage(where, dateCheckin, dateCheckout, nbRooms, nbAdults, nbChildren);
        webTunnelChooseRoom(room1, room2, room3);
        webTunnelOptions(option1, option2, option3, nbOption1, nbOption2, nbOption3);
        webTunnelIdentityuser(firstName, lastName, phoneNumber, email, address, zipcode, city, country, citizenship);
        webTunnelRoomComposition(childrenRoom1, childrenRoom2, childrenRoom3, adultsRoom1, adultsRoom2, adultsRoom3, ageChildrenRoom1, ageChildrenRoom2, ageChildrenRoom3);
        webTunnelRoomGuest(firstNameGuest1, firstNameGuest2, firstNameGuest3, lastNameGuest3, lastNameGuest2, lastNameGuest1);
        webTunnelLegalConditions(legalTunnel);
        webTunnelGuaranteedReservationCC(expiryDate, cvc, cardNumber, nameCard, cardLegalCheck);
    }

    public void webTunnelChooseRoom(String room1, String room2, String room3) {
        // TODO: Implement action: String.format("Select the room n°1
        // room1 = %s", room1)
        // TODO: Implement action: String.format("Select the room n°2
        // room2 = %s", room2)
        // TODO: Implement action: String.format("Select the room n°3
        // room3 = %s", room3)
        // TODO: Implement action: "Click on \"Book now\""
        throw new UnsupportedOperationException();
    }

    public void webTunnelOptions(String option1, String option2, String option3, String nbOption1, String nbOption2, String nbOption3) {
        // TODO: Implement action: String.format("Select options for your booking
        // option1 = %s
        // option2 = %s
        // option3 = %s", option1, option2, option3)
        // TODO: Implement action: String.format("Select the number of each option
        // nbOption1 = %s
        // nbOption2 = %s
        // nbOption3 = %s", nbOption1, nbOption2, nbOption3)
        // TODO: Implement action: "Click on \"next step\""
        throw new UnsupportedOperationException();
    }

    public void webTunnelIdentityuser(String firstName, String lastName, String phoneNumber, String email, String address, String zipcode, String city, String country, String citizenship) {
        // TODO: Implement action: String.format("Fill all field 
        // firstName = %s
        // lastName = %s
        // phoneNumber= %s
        // email= %s
        // address = %s
        // zipcode = %s
        // city= %s
        // country= %s
        // citizenship= %s", firstName, lastName, phoneNumber, email, address, zipcode, city, country, citizenship)
        throw new UnsupportedOperationException();
    }

    public void webTunnelRoomComposition(String childrenRoom1, String childrenRoom2, String childrenRoom3, String adultsRoom1, String adultsRoom2, String adultsRoom3, String ageChildrenRoom1, String ageChildrenRoom2, String ageChildrenRoom3) {
        // TODO: Implement action: String.format("For each room select the number of children and adults
        // childrenRoom1 = %s
        // childrenRoom2 = %s
        // childrenRoom3 = %s
        // adultsRoom1 = %s
        // adultsRoom2 = %s
        // adultsRoom3 = %s
        // ageChildrenRoom1 = %s
        // ageChildrenRoom2 = %s
        // ageChildrenRoom3 = %s", childrenRoom1, childrenRoom2, childrenRoom3, adultsRoom1, adultsRoom2, adultsRoom3, ageChildrenRoom1, ageChildrenRoom2, ageChildrenRoom3)
        throw new UnsupportedOperationException();
    }

    public void webTunnelLegalConditions(String legalTunnel) {
        // TODO: Implement action: String.format("check ou uncheck the box for legal conditions
        // status = %s", legalTunnel)
        // TODO: Implement action: "Click on \"Next Step\"
        // "
        throw new UnsupportedOperationException();
    }

    public void webTunnelGuaranteedReservationCC(String expiryDate, String cvc, String cardNumber, String nameCard, String cardLegalCheck) {
        // TODO: Implement action: String.format("Fill all field
        // cvc = %s
        // expiryDate = %s
        // cardNumber = %s
        // nameCard = %s
        // cardLegalCheck = %s", cvc, expiryDate, cardNumber, nameCard, cardLegalCheck)
        // TODO: Implement action: "Click on \"book now\""
        throw new UnsupportedOperationException();
    }

    public void webTunnelRoomGuest(String firstNameGuest1, String firstNameGuest2, String firstNameGuest3, String lastNameGuest3, String lastNameGuest2, String lastNameGuest1) {
        // TODO: Implement action: String.format("For each room, enter the name of the guest
        // firstNameGuest1 = %s
        // lastNameGuest1 = %s
        // firstNameGuest2 = %s
        // lastNameGuest2 = %s
        // firstNameGuest3 = %s
        // lastNameGuest3 = %s", firstNameGuest1, lastNameGuest1, firstNameGuest2, lastNameGuest2, firstNameGuest3, lastNameGuest3)
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineStep5() {
        // TODO: Implement action: "Click on \"Online Checkin\"
        // "
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineMyBookingButtonClick(String room) {
        // TODO: Implement action: String.format("Click on \"Register to online check-in\" for the room = %s", room)
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineIdentityModification(String newEmail, String newPhoneNumber) {
        // TODO: Implement action: "Click on \"Modify\""
        // TODO: Implement action: String.format("Enter new contact
        // newEmail = %s
        // newPhoneNumber = %s", newEmail, newPhoneNumber)
        // TODO: Implement action: "Click on \"Validate\""
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineIdentityChoiceNotification(String notification) {
        // TODO: Implement action: String.format("Check or uncheck the box to choose sms notification
        // notification = %s", notification)
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineIdentityLegal(String legalCOIdentity) {
        // TODO: Implement action: String.format("Check or uncheck legal conditions
        // legal =%s", legalCOIdentity)
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlinePaiement(String cardNumber, String cvc, String expiryDate, String nameCard, String checkLegalPayement) {
        // TODO: Implement action: String.format("Fill all field
        // cardNumber = %s
        // cvc = %s
        // expirydate = %s
        // nameCard = %s
        // checkLegal = %s", cardNumber, cvc, expiryDate, nameCard, checkLegalPayement)
        // TODO: Implement action: "Click on \"Pay\""
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineConfirmationClick() {
        // TODO: Implement action: "Click on \"Do my Online Checkin\""
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineIdentityToPaiementClick() {
        // TODO: Implement action: "Click on \"Continue to payement\""
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineNoButton(String room) {
        // TODO: Implement result: String.format("Check that for this room there is no button to checkin online
        // room = %s", room)
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineMyBookingButton() {
        // TODO: Implement result: "Check that for all room there are a button to realize online checkin."
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineEmail() {
        // TODO: Implement result: "Check that there buttons to realize online checkin "
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineDeactiveButton(String room) {
        // TODO: Implement action: "Click on \"See reservation details\""
        // TODO: Implement action: String.format("Check that for the room, there is no button to realize online chekcin or this button are not active
        // room = %s
        // ", room)
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineDeactiveEmail() {
        // TODO: Implement result: "Check that the button on the email are not active for the room"
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineResendCode(String room) {
        // TODO: Implement action: String.format("Click on resend my booking code for the room
        // room = %s", room)
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineEmailResendCode() {
        // TODO: Implement result: "Check that you receive an email with booking code"
        throw new UnsupportedOperationException();
    }

    public void webBookingUserNotConnectedPaid(String where, String dateCheckin, String dateCheckout, String nbRooms, String nbAdults, String nbChildren, String room1, String room2, String room3, String option1, String option2, String option3, String nbOption1, String nbOption2, String nbOption3, String firstName, String lastName, String phoneNumber, String email, String childrenRoom1, String childrenRoom2, String childrenRoom3, String adultsRoom1, String adultsRoom2, String adultsRoom3, String firstNameGuest1, String firstNameGuest2, String firstNameGuest3, String lastNameGuest1, String lastNameGuest2, String lastNameGuest3, String cvc, String expiryDate, String cardNumber, String nameCard, String cardLegalCheck) {
        searchAHotelFromHomePage(where, dateCheckin, dateCheckout, nbRooms, nbAdults, nbChildren);
        webTunnelChooseRoom(room1, room2, room3);
        webTunnelOptions(option1, option2, option3, nbOption1, nbOption2, nbOption3);
        webTunnelIdentityuser(firstName, lastName, phoneNumber, email, "", "", "", "", "");
        webTunnelRoomComposition(childrenRoom1, childrenRoom2, childrenRoom3, adultsRoom1, adultsRoom2, adultsRoom3, "", "", "");
        webTunnelRoomGuest(firstNameGuest1, firstNameGuest2, firstNameGuest3, lastNameGuest3, lastNameGuest2, lastNameGuest1);
        webTunnelOnlinePaiementCC(cvc, expiryDate, cardNumber, nameCard, cardLegalCheck);
    }

    public void webTunnelOnlinePaiementCC(String cvc, String expiryDate, String cardNumber, String nameCard, String cardLegalCheck) {
        // TODO: Implement action: String.format("Fill all field 
        // cvc = %s 
        // expiryDate = %s 
        // cardNumber = %s 
        // nameCard = %s 
        // cardLegalCheck = %s", cvc, expiryDate, cardNumber, nameCard, cardLegalCheck)
        // TODO: Implement action: "Click on \"Pay\""
        throw new UnsupportedOperationException();
    }

    public void webBookingModification() {
        // TODO: Implement action: "Modify booking"
        throw new UnsupportedOperationException();
    }

    public void webCheckinOnlineEmailClick() {
        // TODO: Implement action: "Click on \"register to online checkin\" on the email"
        throw new UnsupportedOperationException();
    }

    public void webBookingUserConnectedPaid(String email, String password, String checkStayLoggedIn, String where, String dateCheckin, String dateCheckout, String nbRooms, String nbAdults, String nbChildren, String room1, String room2, String room3, String option1, String option2, String option3, String nbOption1, String nbOption2, String nbOption3, String childrenRoom1, String childrenRoom2, String childrenRoom3, String adultsRoom1, String adultsRoom2, String adultsRoom3, String firstNameGuest1, String firstNameGuest2, String firstNameGuest3, String lastNameGuest1, String lastNameGuest2, String lastNameGuest3, String legalConditions, String cvc, String expiryDate, String cardNumber, String nameCard, String cardLegalCheck) {
        signIn(email, password, "No");
        searchAHotelFromHomePage(where, dateCheckin, dateCheckout, nbRooms, nbAdults, nbChildren);
        webTunnelChooseRoom(room1, room2, room3);
        webTunnelOptions(option1, option2, option3, nbOption1, nbOption2, nbOption3);
        webTunnelRoomComposition(childrenRoom1, childrenRoom2, childrenRoom3, adultsRoom1, adultsRoom2, adultsRoom3, "", "", "");
        webTunnelRoomGuest(firstNameGuest1, firstNameGuest2, firstNameGuest3, lastNameGuest3, lastNameGuest2, lastNameGuest1);
        webTunnelLegalConditions(legalConditions);
        webTunnelOnlinePaiementCC(cvc, expiryDate, cardNumber, nameCard, cardLegalCheck);
    }

    public void webCheckinOnlineLeave() {
        // TODO: Implement action: "Leave the page"
        // TODO: Implement action: "Return to \"My booking\""
        throw new UnsupportedOperationException();
    }

    public void webBookingOfflineNotPaid(String email) {
        // TODO: Implement action: String.format("Make a reservation without the application 
        // email = %s", email)
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineMyBookingNoButton() {
        // TODO: Implement result: "Check that there are no button for register online checkin"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineNoEmail() {
        // TODO: Implement result: "Check that there are no email to purpose online checkin"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineNoLegal() {
        // TODO: Implement result: "Check that you stay on this page, no possibilty to confirm the online checkin online"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineIdentityNoContact() {
        // TODO: Implement result: "Check that you stay on the page to modify email and phone"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineNoBookingCodeEmail() {
        // TODO: Implement result: "Check that codes are not send by email"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineNoPaiement() {
        // TODO: Implement result: "Check that you stay on this page, no possibilty to confirm the online checkin online"
        throw new UnsupportedOperationException();
    }

    public void webBookingCancellation() {
        // TODO: Implement action: "Cancellation of the booking"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinNoModification() {
        // TODO: Implement result: "Check that the modification is refused"
        throw new UnsupportedOperationException();
    }

    public void webCheckCheckinOnlineNoCancellation() {
        // TODO: Implement result: "Check that the cancellation is refused"
        throw new UnsupportedOperationException();
    }

    public void mobileTunnelCheckHotelDescriptionCheckinOnline(String checkinOnline) {
        // TODO: Implement result: String.format("Check that in the hotel description, checkin online is mentionned
        // checkinOnline = %s", checkinOnline)
        throw new UnsupportedOperationException();
    }

    public void webTunnelDescriptionHotelCheckinOnline(String checkinOnline) {
        // TODO: Implement result: String.format("Check that in the hotel description, checkin online is mentionned
        // checkinOnline = %s", checkinOnline)
        throw new UnsupportedOperationException();
    }}