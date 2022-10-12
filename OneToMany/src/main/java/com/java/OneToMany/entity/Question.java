package com.java.OneToMany.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Question") 
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id")
	private int id; 
	@Column(name="name")
	private String qname;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "Question")
	private List<Answer> answers;

}
