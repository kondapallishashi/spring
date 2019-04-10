package com.insync.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.basics.Demo_InitializingBean;

public class Test_Demo_InitializingBean {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans_lifecycle.xml");
	
		Demo_InitializingBean obj=(Demo_InitializingBean)context.getBean("obj_Initializing");
        System.out.println(obj);
     
	}

}
