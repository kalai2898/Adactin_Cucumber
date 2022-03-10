package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	@FindBy(id ="location")
	private WebElement Locations;
	
	@FindBy(id ="hotels")
	private WebElement Hotels;
	
	@FindBy(id ="room_type")
	private WebElement rtype;
	
	@FindBy(id ="room_nos")
	private WebElement rnos;
	
	@FindBy(xpath ="(//input[@type='text'])[2]")
	private WebElement checkIn;
	
	@FindBy(xpath ="(//input[@type='text'])[3]")
	private WebElement checkOut;
	
	@FindBy(id ="adult_room")
	private WebElement adult;
	
	@FindBy(id ="child_room")
	private WebElement child;

	private WebDriver driver;
	
	public SearchHotel(WebDriver driver2) {
	 this.driver=driver2;
	 PageFactory.initElements(driver2, this);
	}

	public WebElement getLocations() {
		return Locations;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRtype() {
		return rtype;
	}

	public WebElement getRnos() {
		return rnos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	
	@FindBy(id ="Submit")
	private WebElement click;
	
	public WebElement getClick() {
		return click;
	}

}
