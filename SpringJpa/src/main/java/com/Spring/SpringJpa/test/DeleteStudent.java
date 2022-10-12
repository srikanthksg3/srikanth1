package com.Spring.SpringJpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Spring.SpringJpa.entity.StudentEntity;

public class DeleteStudent {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		StudentEntity s = em.find(StudentEntity.class, 102);
		em.remove(s);
		em.getTransaction().commit();
		emf.close();
		em.close();

	}

}
