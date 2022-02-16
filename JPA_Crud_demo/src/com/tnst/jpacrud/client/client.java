package com.tnst.jpacrud.client;

import com.tnst.jpacrud.entity.student;
import com.tnst.jpacrud.service.service;
import com.tnst.jpacrud.service.studentserviceimpl;

public class client {

	public static void main(String[] args) {
		service service = new studentserviceimpl();
		student student = new student();
		
		student.setId(127);
		student.setName("suhas");
         service.addstudent(student);
       
       student = service.findstudentById(127);
       System.out.println("Id = "+ student.getId());
       System.out.println("name "+ student.getName());
       
      student = service.findstudentById(126);
       student.setName("suhas121");
       service.updatestudent(student);
       
      student = service.findstudentById(125);
       service.removestudent(student);
       System.out.println(" end ");
      
       
      
	}

}
