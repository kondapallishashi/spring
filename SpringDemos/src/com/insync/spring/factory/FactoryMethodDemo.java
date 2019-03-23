package com.insync.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.factory.FactoryMethod;

public class FactoryMethodDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("factory.xml");
		FactoryMethod factoryMethod=(FactoryMethod)context.getBean("factoryMethod");
		factoryMethod.msg();
	}

}
