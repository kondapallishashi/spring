package com.insync.spring.beans;

import java.util.Date;

public class CINonStringMapAnswer {
	private int id;
	private String answer;
	private Date postedDate;
	
	public CINonStringMapAnswer() {
		//Default Constructor
	}
	
	public CINonStringMapAnswer(int id, String answer, Date postedDate) {
		this.id=id;
		this.answer=answer;
		this.postedDate=postedDate;
	}
	
	public String toString() {
	
		return "ID: "+id+" Answer: "+answer+" Posted Date: "+postedDate;
	}
}
