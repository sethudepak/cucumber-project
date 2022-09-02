package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="radiobutton_0")
private WebElement radiobutton;
@FindBy(id="continue")
private WebElement btnContinue;

public WebElement getRadiobutton() {
	return radiobutton;
}
public WebElement getBtnContinue() {
	return btnContinue;
}

public void selectHotel() {
	
loginClick(getRadiobutton());
loginClick(getBtnContinue());
}

public void clickContinue() {
	
loginClick(getBtnContinue());
}
	
	
}

	
	
	
	
	

