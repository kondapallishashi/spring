package com.insync.spring.basics;

public class Demo_Custom_Init {
	//Declaring two variables
	private String message;
	private String name;
	
	//Constructor for the bean class
	public Demo_Custom_Init() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor gets called for initializing data members in Custom init");
		message = "welcome!!!";
		name = "no name";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message + "\t" + name;
	}

	// Initialization Method
	public void myInit() {
		name = name.toUpperCase();
		System.out.println("myInit() get called from Demo_Custom_Init class");
	}

	// Destroy Method
	public void destroy() {
		name = null;
		System.out.println("destroy called from Demo_Custom_Init class");
	}
}
