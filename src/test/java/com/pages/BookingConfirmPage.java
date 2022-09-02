package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass {


	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderNo;
	public WebElement getOrderNo() {
		return orderNo;
	}
	private String getOrderId(String attributeName ) throws IOException {
		
		String attributeValue = getAttributeValue(getOrderNo(), attributeName);
		
		return attributeValue;

	}
	
	
}

	
	
	
	
	

