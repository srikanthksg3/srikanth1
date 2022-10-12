package com.ContactInformation.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ContactInformation.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer>{
	
	@Query(value="SELECT c FROM Contact c WHERE c.cId = ?1")
	Contact findContactById(int cId);
	
	@Query(value="SELECt c FROM Contact c")
	List<Contact> findAllContact(Sort sort);
	
	@Query(value="SELECT c FROM Contact c WHERE c.cName like %?1")
	Contact exist(String cName);
	
	@Query(value="SELECT c FROM Contact c WHERE c.cId>= :cId")
	List<Contact> getContacts(int cId);
	
	@Query(value="SELECT c FROM Contact c(SELECT COUNT(p) FROM c.cId p)>=2")
	List<Contact> getContactGrater();
	
}
