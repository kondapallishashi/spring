package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.HelloWorld;

public class ApplicationContextDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorldObj");
		helloWorld.setMessage("This bean is created using Application Context");
		helloWorld.getMessage();
	}

}
