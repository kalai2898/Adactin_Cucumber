package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking {
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement cancel;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement Bcancel;

	private WebDriver driver;
	
	public CancelBooking(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getBcancel() {
		return Bcancel;
	}

}
