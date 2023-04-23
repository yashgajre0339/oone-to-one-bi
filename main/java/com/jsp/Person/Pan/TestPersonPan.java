package com.jsp.Person.Pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestPersonPan {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yash");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person =new Person();
		person.setName("xyz");
		person.setEmail("xyz@email.com");
		
		
		
		Pan pan= new Pan();
		pan.setGst_number("xyz123");
		pan.setPerson(person);
		person.setPan(pan);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
		
		
	}

	
}
