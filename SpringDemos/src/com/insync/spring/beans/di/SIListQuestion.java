package com.insync.spring.beans.di;

import java.util.Iterator;
import java.util.List;

public class SIListQuestion {
	private int id;
	private String name;
	private List<String> answers;
	
	//Get Method for id;
	public int getId() {
		return id;
	}

	//Set Method for id;
	public void setId(int id) {
		this.id=id;
	}
	
	//Get Method for name;
	public String getName() {
		return name;
	}
	//Set method for name;
	public void setName(String name) {
		this.name=name;
	}
	//Get method for answers
	public List<String> getAnswers() {
		return answers;
	}
	//Set method for answers
	public void setAnswers(List<String> answers) {
		this.answers=answers;
	}
	
	public void displayInfo() {
		System.out.println("ID: "+id);
		System.out.println("Question: "+name);
		Iterator<String> iterator=answers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
