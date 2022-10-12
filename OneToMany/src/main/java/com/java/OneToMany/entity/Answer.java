package com.java.OneToMany.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="answer") 
public class Answer {
	
	@Id  
    @GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="id")
	private int id;
	@Column(name="answername")
    private String answername;
	@Column(name="postedby")
    private String postedBy;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Question question;

}
