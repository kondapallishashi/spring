package com.insync.spring.contextawarebean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.insync.spring.basics.Demo_InitializingBean;

//Declare a class the implements the ApplicationContextAware interface
public class Demo_ContextAwareBean implements ApplicationContextAware {

	//Add a data member of type ApplicationContext
	private ApplicationContext context;

	//Override the method setApplicationContext()
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("context set in Context Aware class");
		this.context = ctx;

	}

	//Add a method display() to get one of the bean and display its properties.
	public void display() {
		System.out.println((Demo_InitializingBean) context.getBean("obj_Initializing"));
	}

}
