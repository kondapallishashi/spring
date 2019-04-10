package com.insync.spring.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class TestBeanFactory {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans_classpath.xml"));
		//In case the Bean Configuration file is not in class path but in file system
		BeanFactory beanFactory1=new XmlBeanFactory(new FileSystemResource("c:\\Java\\Files\\beans_fileSystem.xml"));
		System.out.println("Bean Factory Created Successfully");
	}
}
