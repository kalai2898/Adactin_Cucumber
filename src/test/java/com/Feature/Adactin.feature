Feature: Adactin Hotel Booking Application
  

  Scenario: Logging verification
    Given Adactin login page is Lanuched
    When user enter valid Username in username field
    And  user enter valid Password in password field 
    And user click the login button
    Then login must be successful


    Scenario Outline:    Search For Hotel Booking
     Given User need to enter vaild details : <location>, <Hotels>, <Room Type>, <Check In Date>, <Check Out Date>,<Adults per Room>,<Children per Room>
     When The User click on the search button
     Then It will be navigate to list of available Hotels
     Examples:
     
     |Location |Hotels     |Room Type|Number of Rooms|Check In Date|Check Out Date|Adults per Room|Children per Room
     |Melbourne|Hotel Creek|Deluxe   |1-One          |28/02/2022   |02/03/2022    |  4-Four       | 0-None
     
    Scenario: Select the Hotel Booking
     Given It will show the list of available Hotels 
     When  User needs to Select any one of the Hotel
     And the user click on Continue button
     Then It will be navigate to payment page

  
     
   Scenario: Book A Hotel
      Given User need to enter vaild details
      When The user enter the First Name,Last Name and Billing Address 
      And user enter the credential details for payment Credit Card No
      And user select the Credit Card Type ,Expiry Date of card like Month and year
      And user enter the CVV Number
      And user click on Book Now button
      Then Processing for Hotel Booking and navigate to Booking Confirmation
    
   Scenario: Booking Confirmation
      Given user get Booking Confirmation page
      When user verify Booking Confirmation details
      And user click on My Itinerary button
      Then It shows users itinerary list of Booking details
      
     Scenario: Cancel the Hotel Booking
     Given It will shows the list of available Hotels 
     When The user click on cancel button
     Then It will be back to search Hotel webpage
      
    Scenario: User Logout from the Adactin Hotel website
      Given user logging out of website
      When User click on Logout button
      Then User gets Logged Out

    


       
      
      
      
      
