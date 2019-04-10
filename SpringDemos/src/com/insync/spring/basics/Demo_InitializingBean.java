package com.insync.spring.basics;

import org.springframework.beans.factory.InitializingBean;

//This class implements the InitializingBean interface
public class Demo_InitializingBean implements InitializingBean {
	//Declare the variables
	private String message;
	private String name;

	
	public Demo_InitializingBean() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor gets called for initializing data members in demo initializing bean");
		message="welcome!!!";
		name="no name";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message+"\t"+name;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		name="Mr."+name.toUpperCase();
		System.out.println("after propertiesSet got called");

	}

}

