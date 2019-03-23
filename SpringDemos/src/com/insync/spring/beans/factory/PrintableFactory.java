package com.insync.spring.beans.factory;

public class PrintableFactory {
	public static PrintableInterface getPrintableClass() {
		//return new PrintableClass1();
		return new PrintableClass2();
	}

}
