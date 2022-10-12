package com.Spring.SpringJpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Spring.SpringJpa.entity.StudentEntity;

public class PersistStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("Student_details");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		StudentEntity s1 = new StudentEntity();
		s1.setS_id(101);
		s1.setS_name("Srikanth");
		s1.setS_age(26);
		
		StudentEntity s2 = new StudentEntity();
		s2.setS_id(102);
		s2.setS_name("Naveen");
		s2.setS_age(27);
		
		StudentEntity s3 = new StudentEntity();
		s3.setS_id(103);
		s3.setS_name("Vijju");
		s3.setS_age(10);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		
		em.getTransaction().commit();
		
		factory.close();
		em.close();

	}

}
