package com.tnst.jpacrud.dao;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
public class JPAUtil {

	private static EntityManagerFactory factory;
	private static EntityManager entitymanager;
	static {
factory =	Persistence.createEntityManagerFactory("JPA-PU");
   }
	public static EntityManager getEntityManager() {
		if(entitymanager==null||entitymanager.isOpen()) {
			entitymanager = factory.createEntityManager();
		}
	return entitymanager;
}
}