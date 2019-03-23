package com.insync.spring.beans.factory;

public class PrintableClass2 implements PrintableInterface {	
	@Override
	public void print() {
		System.out.println("Printing from PrintableClass2");
	}	
}
