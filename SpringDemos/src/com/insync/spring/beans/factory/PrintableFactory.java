package com.insync.spring.beans.factory;

public class PrintableFactory {
	
	//Define a static factory method that returns either PrintableClass1 or PrintableClass2 depending
	//on what is commented out
	public static PrintableInterface getPrintableClass() {
		//return new PrintableClass1();
		return new PrintableClass2();
	}
	
	//Define a non static factory method
	public PrintableInterface getPrintableClassNonStatic() {
		return new PrintableClass1();
		//return new PrintableClass2();
	}
	

}
