package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	@FindBy(id ="radiobutton_0")
	private WebElement selecthotel;

	@FindBy (id ="continue")
	private WebElement Continue;

	private WebDriver driver;
	
	public SelectHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
}
