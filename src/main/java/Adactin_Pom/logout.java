package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	@FindBy(id ="logout")
	private WebElement logout;
	private WebDriver driver;

	public logout(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getLogout() {
		return logout;
	}
	

}
