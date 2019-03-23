package com.insync.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.factory.PrintableInterface;

public class PrintableFactoryDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("factory.xml");
		PrintableInterface printable=(PrintableInterface)context.getBean("printableClass");
		printable.print();
	}

}
