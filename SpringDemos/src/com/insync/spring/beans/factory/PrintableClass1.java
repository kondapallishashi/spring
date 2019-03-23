package com.insync.spring.beans.factory;

public class PrintableClass1 implements PrintableInterface{

	@Override
	public void print() {
		System.out.println("Printing from PrintableClass1");
	}
}
 