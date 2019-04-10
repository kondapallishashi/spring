package com.insync.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.contextawarebean.Demo_ContextAwareBean;

public class Test_Demo_ContextAwareBean {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans_lifecycle.xml");

		Demo_ContextAwareBean obj=(Demo_ContextAwareBean)context.getBean("obj_ContextAware");
        obj.display();
		
	}

}
