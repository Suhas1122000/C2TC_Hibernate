package com.tnst.jpacrud.service;
import com.tnst.jpacrud.dao.*;
import com.tnst.jpacrud.entity.student;
public class studentserviceimpl implements service {
	
private studentdao dao;
public studentserviceimpl(){
	dao= new studentdaoimplement();
}
@Override
public void addstudent(student student) {
	dao.begineTransaction();
	dao.addstudent(student);
	dao.commitTransaction();
	
}
@Override
public student findstudentById(int Id) {
student student = dao.getstudentById(Id);
	return student;
}
@Override
public void updatestudent(student student) {
	dao.begineTransaction();
	dao.updatestudent(student);
	dao.commitTransaction();
	
}
@Override
public void removestudent(student student) {
	dao.begineTransaction();
	dao.removestudent(student);
	dao.commitTransaction();
	
	
}

}
