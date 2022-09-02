package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	@FindBy(id="child_room")
	private WebElement childrenPerRoom;
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckInDate() {
		return checkInDate;
	}
	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}
	public WebElement getSearch() {
		return search;}

	
	public void searchHotels(String location,String hotels,String roomType, String noOfRooms,String checkIndate,String checkOutDate,String adultsPerRoom,String childrenPerRoom ) {
		
		sendkeys(getLocation(), location);
		sendkeys(getHotels(), hotels);
		sendkeys(getRoomType(), roomType);
		sendkeys(getNoOfRooms(), noOfRooms);
		clear(getCheckInDate());
		sendkeys(getCheckInDate(), checkIndate);
		clear(getCheckOutDate());
		sendkeys(getCheckOutDate(), checkOutDate);
		sendkeys(getAdultsPerRoom(), adultsPerRoom);
		sendkeys(getChildrenPerRoom(), childrenPerRoom);
		loginClick(getSearch());
		

	}
	public void searchHotels(String location, String noOfRooms,String checkIndate,String checkOutDate,String adultsPerRoom ) {
		sendkeys(getLocation(), location);
		sendkeys(getNoOfRooms(), noOfRooms);
		clear(getCheckInDate());
		sendkeys(getCheckInDate(), checkIndate);
		clear(getCheckOutDate());
		sendkeys(getCheckOutDate(), checkOutDate);
		sendkeys(getAdultsPerRoom(), adultsPerRoom);
		loginClick(getSearch());
		

	}
	
	public void searchHotels() {
		
		loginClick(getSearch());
		

	}
	
	
	
	
	
	
	
}


