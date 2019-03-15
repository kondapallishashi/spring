package com.insync.spring.beans.di;

public class Address {
	private String street, city, state, country;
	
	//Get Method for street
	public String getStreet() {
		return street;
	}
	//Set method for street
	public void setStreet(String street) {
		this.street=street;
	}
	
	//Get method for city
	public String getCity() {
		return city;
	}
	//Set method for city
	public void setCity(String city) {
		this.city=city;
	}
	//Get method for state
	public String getState() {
		return state;
	}
	//Set method for state
	public void setState(String state) {
		this.state=state;
	}
	//Get method for country
	public String getCountry() {
		return country;
	}
	//Set method for country
	public void setCountry(String country) {
		this.country=country;
	}
	
	public String toString() {
		return "Street: "+street+"\nCity: "+ city+"\nState: "+state+" \nCountry"+country;
	}
}
