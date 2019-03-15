package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.CINonStringMapQuestions;

public class CINonStringMapDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Questions.xml");
		CINonStringMapQuestions question=(CINonStringMapQuestions) context.getBean("questionObj");
		question.displayInfo();
	}

}
