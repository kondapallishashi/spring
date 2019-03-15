package com.insync.spring.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.di.SINonStringListQuestion;

public class SINonStringListDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("QuestionsSetter.xml");
		SINonStringListQuestion question=(SINonStringListQuestion)context.getBean("questionObj");
		question.displayInfo();
	}
}
