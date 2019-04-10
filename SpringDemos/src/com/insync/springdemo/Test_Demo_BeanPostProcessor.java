package com.insync.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.basics.Demo_Custom_Init;
import com.insync.spring.postprocessor.Demo_BeanPostProcessor;

public class Test_Demo_BeanPostProcessor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans_lifecycle.xml");

		Demo_BeanPostProcessor obj=(Demo_BeanPostProcessor)context.getBean("beanPostProcessor");
        System.out.println(obj);
        
        Demo_Custom_Init obj1=(Demo_Custom_Init)context.getBean("obj");
        System.out.println(obj1);
    
	}

}
