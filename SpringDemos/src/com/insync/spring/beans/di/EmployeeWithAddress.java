package com.insync.spring.beans.di;

public class EmployeeWithAddress {

	private int id;
	private String name;
	private Address address;
	
	//Getter and Setter Methods
	//Get Method for ID
	public int getId() {
		return id;
	}
	//Set Method for ID
	public void setId(int id) {
		this.id=id;
	}
	
	
	//Get Method for Name
	public String getName() {
		return name;
	}
	//Set Method for Name
	public void setName(String name) {
		this.name=name;
	}
	//Get Method for Address
	public Address getAddress() {
		return address;
	}
	//Set Method for Address
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Employee Details: \n ID: "+id+"\nName: "+name+"\nAddress:"+address);
	}
}
