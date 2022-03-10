package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBooking {
	
	private WebDriver driver;

	public ConfirmBooking(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getItinerary() {
		return Itinerary;
	}

	@FindBy(id ="my_itinerary")
	private WebElement Itinerary;
	

}
