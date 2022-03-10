package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="username")
	private WebElement username;
	private WebDriver driver;
   
	public Login(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}


	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement Password;
	
	public WebElement getPassword() {
		return Password;
	}
	
	@FindBy(id="login")
	private WebElement Login;
	

	public  WebElement getLogin() {
		return Login;
	}
	

}
