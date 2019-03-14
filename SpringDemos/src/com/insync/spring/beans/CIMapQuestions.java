package com.insync.spring.beans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Constructor Injection with Map Collection.
/* This program uses Map to store answer associated with the posted user name.
 * 
 * 
 */

public class CIMapQuestions {
	private int id;
	private String name;
	private Map<String,String> answers;
	
	public CIMapQuestions() {
		//Default Constructor
	}
	
	public CIMapQuestions(int id, String name, Map<String,String> answers) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	

	public void displayInfo() {
		System.out.println("Question Id: "+id);
		System.out.println("Question Name: "+name);
		System.out.println("Answers ...");
		Set<Entry<String,String>> set=answers.entrySet();
		Iterator<Entry<String,String>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println("Answer: "+entry.getKey()+" Posted By: "+entry.getValue());
		}
	}
}
