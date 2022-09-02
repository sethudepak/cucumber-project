package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {


	public BookHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNumber;
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNumber() {
		return ccNumber;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvNumber() {
		return cvvNumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	public void bookHotel (String firstName,String lastName,String address,String getCcNumber, String ccType,String expmonth,String expyear ,String cvvNumber  ) {
		sendkeys(getFirstName(), firstName);
		sendkeys(getLastName(), lastName);
		sendkeys(getAddress(), address);
		sendkeys(getCcNumber(), getCcNumber);
		selectByVisualText(getCcType(), ccType);
		selectByVisualText(getExpmonth(), expmonth);
		selectByVisualText(getExpyear(), expyear);
		sendkeys(getCvvNumber(), cvvNumber);
		loginClick(getBooknow());

}
	public void bookHotel () {
		
		loginClick(getBooknow());

}
	
	
}

	
	

