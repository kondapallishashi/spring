package com.insync.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//Define a class that implements the BeanPostProcessor interface
public class Demo_BeanPostProcessor implements BeanPostProcessor {

	//override postProcessBeforeInitialization() method
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("initializing bean before init:- "+beanName);
		return bean;
	}
	
	//override postProcessAfterInitialization() method
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("initializing bean after init:-"+beanName);
		return bean;
	}
}
