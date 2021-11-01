package com.hibernate.Firsthb;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;


@Entity(name="Student")
public class std
{
	@Id
	private int id;
	private String name;
	private int marks;
	@ManyToMany
	private List<course> cname  = new ArrayList<course>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<course> getCname() {
		return cname;
	}
	public void setCname(List<course> cname) {
		this.cname = cname;
	}
	
}
