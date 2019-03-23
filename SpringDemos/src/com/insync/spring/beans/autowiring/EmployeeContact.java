package com.insync.spring.beans.autowiring;

public class EmployeeContact {
	private int phoneNumber;
	private String emailId;
	
	public EmployeeContact() {
		System.out.println("Employee Contact Default Constructor");
	}
	
	public EmployeeContact(int phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public EmployeeContact(int phoneNumber, String emailId) {
		this.phoneNumber=phoneNumber;
		this.emailId=emailId;
	}
	
	public void displayContactDetails() {
		System.out.println("Contact Details are: \nPhone Number: "+phoneNumber+"\nEmail ID: "+emailId );
	}

}
