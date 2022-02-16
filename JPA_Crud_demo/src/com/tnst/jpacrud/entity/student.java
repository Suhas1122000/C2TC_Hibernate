package com.tnst.jpacrud.entity;
import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "student_details")
public class student implements Serializable  {
	
	@Id	
	private	int Id;
	private	String name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
	}
