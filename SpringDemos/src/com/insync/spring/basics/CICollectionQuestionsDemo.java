package com.insync.spring.basics;

/*  Dependent files: CICollectionQuestions.java, CICollectionQuestionsDemo.java, Questions.xml
 * 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insync.spring.beans.CICollectionQuestions;

public class CICollectionQuestionsDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Questions.xml");
		CICollectionQuestions questions=(CICollectionQuestions)context.getBean("questions");
		questions.displayInfo();		
	}
}
