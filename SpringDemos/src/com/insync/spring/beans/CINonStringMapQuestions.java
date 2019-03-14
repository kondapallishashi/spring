package com.insync.spring.beans;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CINonStringMapQuestions {
	//Declare variables
	private int id;
	private String name;
	private Map<CINonStringMapAnswer,CINonStringMapUser> answers;

	CINonStringMapQuestions() {
		//Default constructor
	}
	
	CINonStringMapQuestions(int id, String name, Map<CINonStringMapAnswer,CINonStringMapUser> answers) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void displayInfo() {
		System.out.println("Question ID: " + id);
		System.out.println("Question Name: "+ name);
		Set<Entry<CINonStringMapAnswer,CINonStringMapUser>> set=answers.entrySet();
		Iterator<Entry<CINonStringMapAnswer,CINonStringMapUser>> itr=set.iterator();
		while(itr.hasNext()) {
			Entry<CINonStringMapAnswer,CINonStringMapUser>entry=itr.next();
			CINonStringMapAnswer answer=entry.getKey();
			CINonStringMapUser user=entry.getValue();
			System.out.println("Answer Information");
			System.out.println(answer);
			System.out.println("Posted By");
			System.out.println(user);
		}
		
	}

}
