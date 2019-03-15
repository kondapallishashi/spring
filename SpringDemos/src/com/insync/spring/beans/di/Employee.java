package com.insync.spring.beans.di;

public class Employee {
	private int id;
	private String name;
	private String city;
	
	//Get Method for id.
	public int getId() {
		return id;
	}
	
	//Set method for id.
	public void setId(int id) {
		this.id=id;
	}

	//Get method for name
	public String getName() {
		return name;
	}
	//Set method for name
	public void setName(String name) {
		this.name=name;
	}
	//Get method for city
	public String getCity() {
		return city;
	}
	//Set method for city
	public void setCity(String city) {
		this.city=city;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("ID: "+ id + "\nName: "+ name + "\nCity: "+ city);
	}
}
