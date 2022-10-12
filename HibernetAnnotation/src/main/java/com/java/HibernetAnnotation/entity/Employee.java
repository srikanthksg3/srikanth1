package com.java.HibernetAnnotation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity  
@Table(name= "emp500") 
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="firstname", nullable = false)
	private String firstName;
	@Column(name="lastname", nullable = false)
	private String lastName;
	

}
