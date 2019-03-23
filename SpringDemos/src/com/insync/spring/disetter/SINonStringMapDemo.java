package com.insync.spring.disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.di.SIMapNonStringQuestion;

public class SINonStringMapDemo {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("QuestionsSetter.xml");
		SIMapNonStringQuestion question=(SIMapNonStringQuestion)context.getBean("questionMapNonString");
		question.displayInfo();
	}

}
