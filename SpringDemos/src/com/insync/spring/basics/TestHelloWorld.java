package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.HelloWorld;

public class TestHelloWorld {

	public static void main(String[] args) {
		//Gets the context from the Bean Configuration file.
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      //get the bean from the context.
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	   }
}
