package com.insync.spring.basics;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.insync.spring.beans.HelloWorld;

//This class demonstrates the use of BeanFactory to instantiate classes.
public class BeanFactoryDemo {
	public static void main(String[] args) {
		//METHOD: 01
		Resource resource=new ClassPathResource("Beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		HelloWorld helloWorld1=(HelloWorld) beanFactory.getBean("helloWorld");
		helloWorld1.getMessage();
		//METHOD: 02
		BeanFactory beanFactory1=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		HelloWorld helloWorld2=(HelloWorld) beanFactory1.getBean("helloWorld");
		
		HelloWorld helloWorld3=(HelloWorld) beanFactory1.getBean("helloWorldObj");
		helloWorld3.setMessage("Testing using simple bean configuration");
		helloWorld3.getMessage();
	}

}
