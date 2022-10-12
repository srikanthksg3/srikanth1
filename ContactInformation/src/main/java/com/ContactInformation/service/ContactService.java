package com.ContactInformation.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.ContactInformation.entity.Contact;

public interface ContactService {
	
	public Contact saveContact(Contact contact);
	public List<Contact> getContactList();
	public String updateContact(Contact contact);
	public String deleteContactById(int cId);
	public Contact findContactById(int cId);
	public List<Contact> findAllContact(Sort sort);
	public Contact exist(String cName);
	public List<Contact> getContactsGrater(int cId);
	

	public Page<Contact> getContactPage(int page, int elementPerPage);
	
	public List<Contact> getContactGrater();

}
