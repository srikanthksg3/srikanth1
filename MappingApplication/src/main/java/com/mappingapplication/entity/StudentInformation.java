package com.mappingapplication.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class StudentInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	private String name;
	
	/*@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> ob;*/

}
