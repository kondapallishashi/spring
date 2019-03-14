package com.insync.spring.beans;

public class CINonStringCollectionAnswers {

	//Declare variables Answer ID, Answer String and Answer provided by user.
	//CINonStringCollectionAnswers object contains all the below variables.
	private int id;  
	private String name;  
	private String by;  
	  
	public CINonStringCollectionAnswers() {
		//Default constructor.
	}  
	
	//Constructor that initializes the id, answer and user who submitted the answer.
	public CINonStringCollectionAnswers(int id, String name, String by) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.by = by;  
	}  
	  
	public String toString(){  
	    return id+" "+name+" "+by;  
	}  
}
