package com.tnst.jpacrud.dao;

import javax.persistence.EntityManager;

import com.tnst.jpacrud.entity.student;

public class studentdaoimplement implements studentdao {
	private EntityManager entitymanager;
	
	public studentdaoimplement() {
		entitymanager = JPAUtil.getEntityManager();
	}

	@Override
	public void addstudent(student student) {
		entitymanager.persist(student);
		
	}

	@Override
	public student getstudentById(int Id) {
	student student = entitymanager.find(student.class, Id);
		return student;
	}

	@Override
	public void updatestudent(student student) {
		entitymanager.merge(student);
		
	}

	@Override
	public void removestudent(student student) {
		entitymanager.remove(student);
		
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
		
	}

	@Override
	public void begineTransaction() {
		entitymanager.getTransaction().begin();
		
	}

}
