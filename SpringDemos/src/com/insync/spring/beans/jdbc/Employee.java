package com.insync.spring.beans.jdbc;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee() {
		this.id=0;
		this.firstName="";
		this.lastName="";
		this.age=0;
	}
	
	public Employee(int id, String firstName, String lastName, int age) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	//Getter and Setter Methods
	//Get method for id
	public int getId() {
		return id;
	}
	
	//Set method for id
	public void setId(int id) {
		this.id=id;
	}
	
	//get method for firstName
	public String getFirstName() {
		return firstName;
	}
	
	//Set method for firstName
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}

	//get method for lastName
		public String getLastName() {
			return lastName;
		}
		
		//Set method for lastName
		public void setLastName(String lastName) {
			this.lastName=lastName;
		}

		//Get method for age
		public int getAge() {
			return age;
		}
		
		//Set method for Age
		public void setAge(int age) {
			this.age=age;
		}
}
