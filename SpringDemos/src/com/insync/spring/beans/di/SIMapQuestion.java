package com.insync.spring.beans.di;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SIMapQuestion {
	private int id;
	private String name;
	private Map<String,String> answers;
	
	//Get method for id
	public int getId() {
		return id;
	}
	
	//Set method for id;
	public void setId(int id) {
		this.id=id;
	}
	//Get method for name.
	public String getName() {
		return name;
	}
	
	//Set method for name
	public void setName(String name) {
		this.name=name;
	}
	
	//Get method for answers
	public Map<String,String> getAnswers() {
		return answers;
	}
	
	//Set method for answers
	public void setAnswers(Map<String,String> answers) {
		this.answers=answers;
	}

	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String, String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
	    }  
	}  
}
