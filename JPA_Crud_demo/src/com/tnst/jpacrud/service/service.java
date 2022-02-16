package com.tnst.jpacrud.service;

import com.tnst.jpacrud.entity.student;

public interface service {
	
	public abstract void addstudent(student student);
	public abstract student findstudentById(int Id);
	public abstract void updatestudent(student student);
	public abstract void removestudent(student student);


}
