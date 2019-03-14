package com.insync.spring.beans;
/* This class has a HAS A relation with EmployeeWithAddress class, ie EmployeeWithAddress class 
 * has Address as a variable.
 * 
 */
public class Address {
	//Declare Variables
	String street;
	String city;
	String state;
	String country;
	
	public Address(String street, String city, String state, String country) {
		super();
		this.street=street;
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	//Concatenates the street, city, state, country string values and returns the Address as one string.
	public String toString() {
		return "Address : "+street + " , " + city + " , "+ state + " , "+country +" .";
	}
	

}
