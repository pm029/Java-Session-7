package com.hsbc.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //entity is connected to the table. (so in this case its connected to this table named college.
public class College {
	
	@Id //this shows that the first one is a primary key
	private int regno;
	private int marks;
	private String name;
	
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	//autopopulate the getters and setters. right click and click on source and then "generate getters and setters"
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	}

