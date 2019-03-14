package com.insync.spring.beans;

import java.util.Iterator;
import java.util.List;

public class CINonStringCollectionQuestions {
	private int id;
	private String name;
	//Declare a List of type CINonStringCollectionAnswers.
	private List<CINonStringCollectionAnswers> answers;
	
	public CINonStringCollectionQuestions() {
		//Default Constructor
	}

	public CINonStringCollectionQuestions(int id, String name, List<CINonStringCollectionAnswers> answers) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    Iterator<CINonStringCollectionAnswers> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
