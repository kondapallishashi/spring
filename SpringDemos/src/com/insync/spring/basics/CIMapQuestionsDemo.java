package com.insync.spring.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.CIMapQuestions;

public class CIMapQuestionsDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Questions.xml");
		CIMapQuestions question=(CIMapQuestions)context.getBean("questionsmap");
		question.displayInfo();
	}

}
