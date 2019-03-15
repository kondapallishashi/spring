package com.insync.spring.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.di.SIListQuestion;

public class SIListQuestionDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("QuestionsSetter.xml");
		SIListQuestion question=(SIListQuestion)context.getBean("question");
		question.displayInfo();
	}

}
