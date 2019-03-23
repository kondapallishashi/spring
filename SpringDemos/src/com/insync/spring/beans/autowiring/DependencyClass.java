package com.insync.spring.beans.autowiring;

public class DependencyClass {
	SimpleClass simpleClass;
	
	//Constructor
	public DependencyClass() {
		System.out.println("DependencyClass bean is created");
	}
	
	//Get Method for SimpleClass
	public SimpleClass getSimpleClass() {
		return simpleClass;
	}
	
	//Set Method for SimpleClass
	public void setSimpleClass(SimpleClass simpleClass) {
		this.simpleClass=simpleClass;
	}
	
	void printDetails() {
		System.out.println("Printing Dependency Class details");
	}
	
	public void display() {
		printDetails();
		simpleClass.printDetails();
	}

}
