package com.insync.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.factory.PrintableInterface;

public class PrintableFactoryDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("factory.xml");
		PrintableInterface printable=(PrintableInterface)context.getBean("printableClass");
		System.out.println("Demonstrating Static Factory Method that returns instance of another class");
		printable.print();
		System.out.println("Demonstrating Non Static Factory Method that returns instance of another class");
		PrintableInterface printableNonStatic=(PrintableInterface)context.getBean("printableFactory");
		printableNonStatic.print();
		
		
		
	}

}
