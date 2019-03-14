package com.insync.spring.beans;
//This class is used to demonstrate Construction with Dependent Object.
/*For example, if the classes have a HAS-A relation, first create the dependent object and pass it as
 * argument to the main class constructor.
 * 
 * This example demonstrates Address class dependency with EmployeeWithAddress class.
 */
public class EmployeeWithAddress {
	private int id;
	private String name;
	private Address address;
	
	public EmployeeWithAddress() {
		System.out.println("Default constructor");
	}
	
	public EmployeeWithAddress(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void showEmployeeInfo() {
		System.out.println("Details of Employee:- ID: "+id+" Name: "+name);
		System.out.println(address.toString());
	}
	

}
