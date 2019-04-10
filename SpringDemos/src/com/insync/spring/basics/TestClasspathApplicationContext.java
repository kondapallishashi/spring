package com.insync.spring.basics;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClasspathApplicationContext {
	public static void main(String[] args) {
		//Create Application Context
		try {
			//CASE 1: There is only one beans_classpath config file. 
			ApplicationContext context=new ClassPathXmlApplicationContext("beans_classpath.xml");
			System.out.println("Application Context Created Successfully and the details are " +context.toString());
			
			//CASE 2: There are multiple beans classpath config files in the root folder.
			ApplicationContext context1=new ClassPathXmlApplicationContext(new String[] {"beans_classpath.xml","beans_classpath1.xml"});
			System.out.println("Application Context Created Successfully from multiple configuration files and the details are " +context1.toString());
					
		}
		catch(BeansException e) {
			e.printStackTrace();
		}
	}

}
