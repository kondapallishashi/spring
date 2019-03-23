package com.insync.spring.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.di.SIMapQuestion;

public class SIMapQuestionDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("QuestionsSetter.xml");
		SIMapQuestion question=(SIMapQuestion)context.getBean("questionMap");
		question.displayInfo();
	}

}
