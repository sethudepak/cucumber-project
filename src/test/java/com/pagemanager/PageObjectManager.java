package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager  {

	 private LoginPage loginpage;
	 private SearchHotelPage searchhotelpage;
	 private SelectHotelPage selecthotelpage;
	 private BookHotelPage   bookhotelpage;
	 private BookingConfirmPage bookingconfirmpage;
	 private CancelBookingPage  cancelbookingpage;
	public LoginPage getLoginpage() {
		return loginpage;loginpage=new LoginPage loginpage ;
	}
	public SearchHotelPage getSearchhotelpage() {
		return searchhotelpage;
	}
	public SelectHotelPage getSelecthotelpage() {
		return selecthotelpage;
	}
	public BookHotelPage getBookhotelpage() {
		return bookhotelpage;
	}
	public BookingConfirmPage getBookingconfirmpage() {
		return bookingconfirmpage;
	}
	public CancelBookingPage getCancelbookingpage() {
		return cancelbookingpage;
	} 
	 
	 
	 
	 }
	 
}
