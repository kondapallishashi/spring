package com.insync.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.basics.Demo_DisposableBean;

public class Test_Demo_DisposableBean {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans_lifecycle.xml");

		Demo_DisposableBean obj=(Demo_DisposableBean)context.getBean("obj_Disposable");
        System.out.println(obj);
        ((AbstractApplicationContext)context).registerShutdownHook();
	}

}
