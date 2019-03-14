package com.insync.spring.beans;

/* This is a simple java class with multiple constructors.
 * This class is used to demonstrate the Dependency Injection using Constructor Method
 */
public class Employee {
	private int id;
	private String name;
	
	//Default Constructor
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	//Constructor with one parameter
	public Employee(int id) {
		this.id=id;
	}
	
	//Constructor with one parameter employee name
	public Employee(String name) {
		this.name=name;
	}
	
	//Constructor with both id and name parameters
	public Employee(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	//Define a method that displays the details of Employee
	public void showEmployeeInfo() {
		System.out.println("Details of Employee:- ID: "+id+" Name: "+name);
	}

}
