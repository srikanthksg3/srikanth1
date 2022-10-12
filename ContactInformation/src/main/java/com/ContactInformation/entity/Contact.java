package com.ContactInformation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Builder
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cName;
	private Long cNo;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Long getcNo() {
		return cNo;
	}
	public void setcNo(Long cNo) {
		this.cNo = cNo;
	}
	public Contact() {
		
	}
	public Contact(int cId, String cName, Long cNo) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cNo = cNo;
	}
	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", cName=" + cName + ", cNo=" + cNo + "]";
	}

}
