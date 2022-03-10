package com.StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import com.helper.FileReaderManager;
import com.helper.PageObjectManager;
import BaseClass.Baseclass;
import RunnerTest.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps extends Baseclass {
	
 public static WebDriver driver=Runner.driver;
   
    PageObjectManager pom=new PageObjectManager(driver);
  
  @Given("Adactin login page is Lanuched")
 public void adactin_login_page_is_lanuched() throws IOException {
	String url = FileReaderManager.getInstance().getCrInstance().getUrl();
	getUrl(url);
    //getUrl("https://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

  @When("user enter valid Username in username field")
 public void user_enter_valid_username_in_username_field() throws IOException {
     //WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
     inputValueElement(pom.getInstanceLogin().getUsername(),FileReaderManager.getInstance().getCrInstance().getUser());
 }
 @When("user enter valid Password in password field")
 public void user_enter_valid_password_in_password_field() throws IOException {
    //WebElement pass = driver.findElement(By.id("password"));
    inputValueElement(pom.getInstanceLogin().getPassword(),FileReaderManager.getInstance().getCrInstance().getPass());
    		}
 @When("user click the login button")
 public void user_click_the_login_button() {
    //WebElement login = driver.findElement(By.id("login"));
   clickOnElement(pom.getInstanceLogin().getLogin());
 }
 @Then("login must be successful")
 public void login_must_be_successful() {
	String title = driver.getTitle();
	  String Exceptedtitle="Adactin.com - Search Hotel";
	  Assert.assertEquals(title, Exceptedtitle);
	 System.out.println("login sucessfully");
 }

 @Given("User need to enter vaild details : <location>, Hotel Creek, Deluxe, {int}\\/{int}\\/{int}, {int}\\/{int}\\/{double}-Four,<Children per Room>")
 public void user_need_to_enter_vaild_details_location_hotel_creek_deluxe_four_children_per_room(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Double double1) throws InterruptedException {
   //WebElement local = driver.findElement(By.id("location"));
   selection( pom.getInstanceSearch().getLocations(),"byValue","Melbourne");
  // WebElement hotel = driver.findElement(By.id("hotels"));
   selection(pom.getInstanceSearch().getHotels(),"byValue","Hotel Creek");
   //WebElement rtype = driver.findElement(By.id("room_type"));
   selection(pom.getInstanceSearch().getRtype(),"byValue","Deluxe");
   //WebElement rno = driver.findElement(By.id("room_nos"));
   selection(pom.getInstanceSearch().getRnos(),"byValue","1");
   elementClear(driver.findElement(By.xpath("(//input[@type='text'])[2]")));
   Thread.sleep(2000);
   //WebElement checkIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
   inputValueElement(pom.getInstanceSearch().getCheckIn(),"10/03/2022");
   elementClear(driver.findElement(By.xpath("(//input[@type='text'])[3]")));
   Thread.sleep(2000);
   //WebElement checkOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
   inputValueElement(pom.getInstanceSearch().getCheckOut(),"12/03/2022");
   //WebElement room = driver.findElement(By.id("adult_room"));
   selection(pom.getInstanceSearch().getAdult(),"byValue","4");
  // WebElement child = driver.findElement(By.id("child_room"));
   selection(pom.getInstanceSearch().getChild(),"byValue","0");
   
}
 @When("The User click on the search button")
 public void the_user_click_on_the_search_button() {
     //WebElement search = driver.findElement(By.id("Submit"));
     clickOnElement(pom.getInstanceSearch().getClick());
    
 }
 @Then("It will be navigate to list of available Hotels")
 public void it_will_be_navigate_to_list_of_available_hotels() {
  String expected="pom.getInstanceSearch().getHotels()";
  String actual="pom.getInstanceSearch().getHotels()";
  Assert.assertEquals(expected, actual);
  if(expected==actual)
  {
	  System.out.println("Passed");
  }
 }
 @Given("It will show the list of available Hotels")
 public void it_will_show_the_list_of_available_hotels() {
	 System.out.println("It show available Hotels");
     
 }
 @When("User needs to Select any one of the Hotel")
 public void user_needs_to_select_any_one_of_the_hotel() {
     //WebElement select = driver.findElement(By.id("radiobutton_0"));
     clickOnElement(pom.getInstanceSelect().getSelecthotel());
 }
 @When("the user click on Continue button")
 public void the_user_click_on_continue_button() throws InterruptedException {
   // WebElement click1 = driver.findElement(By.id("continue"));
   clickOnElement(pom.getInstanceSelect().getContinue());
   Thread.sleep(2000);
 }
 @Then("It will be navigate to payment page")
 public void it_will_be_navigate_to_payment_page() {
       System.out.println("navigate to payment page");
 }

 @Given("User need to enter vaild details")
 public void user_need_to_enter_vaild_details() {
     System.out.println("Enter Valid Details");
 }
 @When("The user enter the First Name,Last Name and Billing Address")
 public void the_user_enter_the_first_name_last_name_and_billing_address() throws InterruptedException {
    // WebElement fname = driver.findElement(By.id("first_name"));
     inputValueElement(pom.getInstanceBook().getFname(),"Devi");
     Thread.sleep(2000);
    // WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
     inputValueElement(pom.getInstanceBook().getLname(),"Velu");
    Thread.sleep(2000);
     //WebElement addr = driver.findElement(By.id("address"));
     inputValueElement(pom.getInstanceBook().getAddress(),"Jeevanlal Nagar,Chennai-28");
     
 }
 @When("user enter the credential details for payment Credit Card No")
 public void user_enter_the_credential_details_for_payment_credit_card_no() throws IOException {
    //WebElement ccard = driver.findElement(By.id("cc_num"));
    inputValueElement(pom.getInstanceBook().getCno(),FileReaderManager.getInstance().getCrInstance().getCard());
 }
 @When("user select the Credit Card Type ,Expiry Date of card like Month and year")
 public void user_select_the_credit_card_type_expiry_date_of_card_like_month_and_year() throws IOException {
   // WebElement ctype = driver.findElement(By.id("cc_type"));
    selection(pom.getInstanceBook().getCtype(),"byVisibleText",FileReaderManager.getInstance().getCrInstance().gettype());
   // WebElement cmonth = driver.findElement(By.id("cc_exp_month"));
    selection(pom.getInstanceBook().getCmonth(),"byVisibleText",FileReaderManager.getInstance().getCrInstance().getmonth());
   // WebElement cyear = driver.findElement(By.id("cc_exp_year"));
    selection(pom.getInstanceBook().getCyear(),"byValue",FileReaderManager.getInstance().getCrInstance().getyear());
 }
 @When("user enter the CVV Number")
 public void user_enter_the_cvv_number() throws IOException {
    //WebElement ccv = driver.findElement(By.id("cc_cvv"));
    inputValueElement(pom.getInstanceBook().getCcv(),FileReaderManager.getInstance().getCrInstance().getccv());
 }
 @When("user click on Book Now button")
 public void user_click_on_book_now_button() throws InterruptedException {
 //WebElement button = driver.findElement(By.id("book_now"));
    clickOnElement(pom.getInstanceBook().getBook());
   Thread.sleep(5000);
 }
 @Then("Processing for Hotel Booking and navigate to Booking Confirmation")
 public void processing_for_hotel_booking_and_navigate_to_booking_confirmation() {
    System.out.println("proceesing input is valid");
    String users = "validInfo";
    if (users=="validInfo") {
		System.out.println("Info:valid");
    }
	else if (users!="invalid") {
		System.out.println("Info:invalid");
     }
 }
@Given("user get Booking Confirmation page")
 public void user_get_booking_confirmation_page() {
	System.out.println("User get booking Confirmation Page");
 }
 @When("user verify Booking Confirmation details")
 public void user_verify_booking_confirmation_details() {
   System.out.println("user confirm details");
 }
 @When("user click on My Itinerary button")
 public void user_click_on_my_itinerary_button() throws InterruptedException {
   // WebElement click = driver.findElement(By.id("my_itinerary"));
    clickOnElement(pom.getInstanceConfirm().getItinerary());
    Thread.sleep(5000);
 }
 @Given("It will shows the list of available Hotels")
 public void it_will_shows_the_list_of_available_hotels() {
     System.out.println("Cancel unwanted Booking");
 }
 @When("The user click on cancel button")
 public void the_user_click_on_cancel_button() {
    clickOnElement(pom.getInstanceCancel().getCancel());
   // clickOnElement(driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")));
  // WebElement click = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
    clickOnElement(pom.getInstanceCancel().getBcancel());
  
 }
 @Then("It will be back to search Hotel webpage")
 public void it_will_be_back_to_search_hotel_webpage() {
	  simpleAlert();
     System.out.println("sucessfully cancelled");
 }

 
 @Then("It shows users itinerary list of Booking details")
 public void it_shows_users_itinerary_list_of_booking_details() {
    System.out.println("shows booking details");
 }
@Given("user logging out of website")
 public void user_logging_out_of_website() {
    System.out.println("After Booking Hotels logout");
 }
 @When("User click on Logout button")
 public void user_click_on_logout_button() throws InterruptedException {
	 Thread.sleep(3000);
   // WebElement lagout = driver.findElement(By.id("logout"));
    clickOnElement(pom.getInstanceLogOut().getLogout());
 }
 @Then("User gets Logged Out")
 public void user_gets_logged_out() {
     System.out.println("Logout Sucessfully");
 }


}








	


