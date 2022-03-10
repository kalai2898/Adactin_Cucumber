package com.helper;

import org.openqa.selenium.WebDriver;

import Adactin_Pom.BookAHotel;
import Adactin_Pom.CancelBooking;
import Adactin_Pom.ConfirmBooking;
import Adactin_Pom.Login;
import Adactin_Pom.SearchHotel;
import Adactin_Pom.SelectHotel;
import Adactin_Pom.logout;

public class PageObjectManager {
	
	private WebDriver driver;
// private Login in;
// private SearchHotel search;
// private SelectHotel select;
// private BookAHotel book;
// private ConfirmBooking Cbook;
// private CancelBooking Cancel;
//  private logout out;
//
	public PageObjectManager(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public Login getInstanceLogin()
	{
		Login in=new Login(driver);
		return in;
	}
	public SearchHotel getInstanceSearch()
	{
		 SearchHotel search= new SearchHotel(driver);
		return search;
	}
	public SelectHotel getInstanceSelect()
	{
		SelectHotel select=new SelectHotel(driver);
		return select;
	}
	public BookAHotel getInstanceBook()
	{
		BookAHotel book=new BookAHotel(driver);
		return book;
	}
  public ConfirmBooking getInstanceConfirm()
  {
	  ConfirmBooking Cbook=new ConfirmBooking(driver);
	  return Cbook;
}
  public CancelBooking getInstanceCancel()
  {
	  CancelBooking cancel=new CancelBooking(driver);
	return cancel;
	}
  public logout getInstanceLogOut()
  {
	  logout out=new logout(driver);
	return out;
	  
  }
	

}
