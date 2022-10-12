package com.Spring.SpringJpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Spring.SpringJpa.entity.StudentEntity;

public class FindStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em =factory.createEntityManager();
		
		StudentEntity s=em.find(StudentEntity.class, 101);
		
		System.out.println(s.getS_id()+" "+s.getS_name()+" "+s.getS_age());

	}

}
