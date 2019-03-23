package com.insync.spring.beans.autowiring;

public class EmployeeAddress {
	private String street;
	private String city;
	private String state;
	private int zip;

	public EmployeeAddress(String street, String city, String state, int zip) {
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
	
	public EmployeeAddress() {
		System.out.println("Default constructor of Employee Address");
	}
	
	public void displayAddress() {
		System.out.println("Address Details: \nStreet: "+street+"\nCity: "+city+"\nState: "+state+"\nZip Code: "+zip);
	}
}
