package com.insync.spring.beans.autowiring;

public class SimpleClass {

	public SimpleClass() {
		System.out.println("SimpleClass bean is created");
	}
	
	void printDetails() {
		System.out.println("Printing SimpleClass Details");
	}
}
