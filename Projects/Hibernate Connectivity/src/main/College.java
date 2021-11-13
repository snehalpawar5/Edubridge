package com.hibernate.Firsthb;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;


@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class College 
{
	@Id
	private int id;
	private String name;
	private int fees;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;                      //Cache hibernate
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
}














/*
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College 
{
	@Id
	private int id;
	private String name;
	private int fees;
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
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
}
*/