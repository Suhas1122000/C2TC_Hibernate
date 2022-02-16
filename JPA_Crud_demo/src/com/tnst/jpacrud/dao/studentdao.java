package com.tnst.jpacrud.dao;

import com.tnst.jpacrud.entity.student;

public interface studentdao {
public abstract void addstudent(student student);
public abstract student getstudentById(int Id);
public abstract void updatestudent(student student);
public abstract void removestudent(student student);

public abstract void commitTransaction();
public abstract void begineTransaction();
}
