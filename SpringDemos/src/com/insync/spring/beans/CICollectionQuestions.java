package com.insync.spring.beans;

import java.util.Iterator;
import java.util.List;
//This class demonstrates Constructor Injection with Collection.
//This example uses List, but Set and Map can also be used


public class CICollectionQuestions {
	private int id;
	private String name;
	private List<String> answers;
	
	public CICollectionQuestions() {
		//Default Constructor
	}
	
	public CICollectionQuestions(int id, String name, List<String> answers) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	

}
