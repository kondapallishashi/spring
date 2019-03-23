package com.insync.spring.beans.di;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SIMapNonStringQuestion {
	public int id;
	public String name;
	public Map<SIMapNonStringAnswer,SIMapNonStringUser> answers;
	
	//Getter and Setter Methods.
	
	//Get Method for id;
	public int getId() {
		return id;
	}
		
	//Set Method for id;
	public void setId(int id) {
		this.id=id;
	}
	
	//Get Method for name
	public String getName() {
		return name;
	}
	//Set method for name
	public void setName(String name) {
		this.name=name;
	}
	//Get method for answers
	public Map<SIMapNonStringAnswer,SIMapNonStringUser> getAnswers() {
		return answers;
	}
	//Set method for answers
	public void setAnswers(Map<SIMapNonStringAnswer,SIMapNonStringUser> answers) {
		this.answers=answers;
	}
	
	
	public void displayInfo(){  
	    System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");  
	    Set<Entry<SIMapNonStringAnswer, SIMapNonStringUser>> set=answers.entrySet();  
	    Iterator<Entry<SIMapNonStringAnswer, SIMapNonStringUser>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<SIMapNonStringAnswer, SIMapNonStringUser> entry=itr.next();  
	        SIMapNonStringAnswer ans=entry.getKey();  
	        SIMapNonStringUser user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  
	}  

}
