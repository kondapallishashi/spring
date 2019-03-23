package com.insync.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.autowiring.DependencyClass;

public class AutowiringDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring.xml");
		DependencyClass dependencyClass=context.getBean("dependencyClass",DependencyClass.class);
		dependencyClass.display();
	}

}
