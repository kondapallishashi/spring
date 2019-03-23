package com.insync.spring.beans.factory;

public class FactoryMethod {
	//
	private static final FactoryMethod factoryMethod=new FactoryMethod();
	//Private Constructor.
	private FactoryMethod() {
		System.out.println("Private Constructor of FactoryMethod");
	}
	
	//Define Factory method
	public static FactoryMethod getFactoryMethod() {
		System.out.println("Executing Factory Method");
		return factoryMethod;
	}
	
	public void msg() {
		System.out.println("Hello Factory Method");
	}

}


/*
A factory method is a method that returns an instance of a class.
public class A {  
	public static A getA(){//factory method  
    	return new A();  
	}  
}  
*/
