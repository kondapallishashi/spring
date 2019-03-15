package com.insync.spring.beans.di;

import java.util.Iterator;
import java.util.List;

public class SINonStringListQuestion {
	private int id;
	private String name;
	private List<SINonStringListAnswer> answer;
	
	//Getter & Setter Methods
	//Get method for id;
	public int getId() {
		return id;
	}
	
	//Set method for id;
	public void setId(int id) {
		this.id=id;
	}
	
	//Get method for name
	public String getName() {
		return name;
	}
	
	//Set method for name
	public void setName(String name) {
		this.name=name;
	}
	
	//Get method for answers.
	public List<SINonStringListAnswer> getAnswer() {
		return answer;
	}
	
	//Set method for answers
	public void setAnswer(List<SINonStringListAnswer> answer) {
		this.answer=answer;
	}

	public void displayInfo() {
		System.out.println("ID: "+id+", Name"+name);
		Iterator<SINonStringListAnswer> iterator=answer.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
