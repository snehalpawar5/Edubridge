package com.hibernate.Firsthb;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class course 
{
	@Id
	private int id;
	private String cname;
	@ManyToMany
	private List<std> stud = new ArrayList<std>();
	
	public int getId() {
		return id;
	}
	public void setId(int is) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<std> getStud() {
		return stud;
	}
	public void setStud(List<std> stud) {
		this.stud = stud;
	}
		
}
