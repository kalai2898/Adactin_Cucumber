package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	@FindBy(id ="first_name")
	private WebElement fname;
	
	@FindBy(xpath ="(//input[@type='text'])[12]")
	private WebElement lname;
	
	@FindBy(id ="address")
	private WebElement Address;
	
	@FindBy(id ="cc_num")
	private WebElement cno;
	
	@FindBy(id ="cc_type")
	private WebElement ctype;
	
	@FindBy(id ="cc_exp_month")
	private WebElement cmonth;
	
	@FindBy(id ="cc_exp_year")
	private WebElement cyear;
	
	@FindBy(id ="cc_cvv")
	private WebElement ccv;
	
	@FindBy(id ="book_now")
	private WebElement book;

	private WebDriver driver;

	public BookAHotel(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCno() {
		return cno;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public WebElement getCmonth() {
		return cmonth;
	}

	public WebElement getCyear() {
		return cyear;
	}


	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBook() {
		return book;
	}


}
