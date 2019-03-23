package com.insync.spring.beans.di;

import java.util.Date;

public class SIMapNonStringAnswer {

	private int id;  
	private String answer;  
	private Date postedDate;  
	public SIMapNonStringAnswer() {}  
	public SIMapNonStringAnswer(int id, String answer, Date postedDate) {  
	    super();  
	    this.id = id;  
	    this.answer = answer;  
	    this.postedDate = postedDate;  
	}  
	  
	public String toString(){  
	    return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;  
	}  
}
