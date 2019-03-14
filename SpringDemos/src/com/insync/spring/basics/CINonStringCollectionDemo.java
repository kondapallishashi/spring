package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.CINonStringCollectionQuestions;

public class CINonStringCollectionDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Questions.xml");
		CINonStringCollectionQuestions questions=(CINonStringCollectionQuestions)context.getBean("question");
		questions.displayInfo();
	}

}
