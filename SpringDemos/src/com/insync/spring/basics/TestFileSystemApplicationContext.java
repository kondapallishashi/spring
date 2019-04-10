package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestFileSystemApplicationContext {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Java\\Files\\beans_fileSystem.xml");
				//OR
		    	 context=new FileSystemXmlApplicationContext("C:\\work\\javaws\\SpringContainerInitialization\\src\\beans_fileSystem.xml");
				System.out.println("container created successfully");
	}

}
