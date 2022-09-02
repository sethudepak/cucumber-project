package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BookingConfirmPage {

	
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement bookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement orderIdText;

	@FindBy(id = "search_hotel_id")
	private WebElement goButton;

	@FindBy(id = "btn_id_654597")
	private WebElement cancel;

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getOrderText() {
		return orderIdText;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getCancel() {
		return cancel;
	}

	private void cancelOrderId(String orderId) {
		loginClick(getBookedItinerary());
		sendkeys(getOrderText(), orderId);
		loginClick(getGoButton());
		loginClick(getCancel());
		confirmAlert();
	
		
		
	}
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	

