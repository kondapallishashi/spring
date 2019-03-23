package com.insync.spring.beans.autowiring;

public class Employee {
	private int id;
	private String designation;
	private EmployeeContact contactDetails;
	private EmployeeAddress addressDetails;
	
	public Employee() {
		System.out.println("Default Constructor of Employee");
	}

	public Employee(int id, String designation) {
		this.id=id;
		this.designation=designation;
		System.out.println("Constructor of Employee with id: "+id+"\n designation: "+designation);
	}
	public Employee(int id, String designation, EmployeeContact contactDetails) {
		System.out.println("Constructor of Employee with id, designation and contact details");
		this.id=id;
		this.designation=designation;
		this.contactDetails=contactDetails;
	}
	public Employee(int id, String designation, EmployeeContact contactDetails, EmployeeAddress addressDetails) {
		System.out.println("Constructor of Employee with id, designation, contact details and address details");
		this.id=id;
		this.designation=designation;
		this.contactDetails=contactDetails;
		this.addressDetails=addressDetails;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Details of Employee are: \n");
		System.out.println("ID: "+id+"\nDesignation: "+designation);
		//System.out.println("Contact Details: \n");
		contactDetails.displayContactDetails();
		addressDetails.displayAddress();
		
	}
}
