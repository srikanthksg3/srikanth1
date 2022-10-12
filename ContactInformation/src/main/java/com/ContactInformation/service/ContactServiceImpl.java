package com.ContactInformation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.ContactInformation.entity.Contact;
import com.ContactInformation.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public Contact saveContact(Contact contact) {
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> getContactList() {
		return (List<Contact>)contactRepo.findAll();
	}

	@Override
	public String updateContact(Contact contact) {
		boolean flag= contactRepo.existsById(contact.getcId());
		String message= null;
		if(flag) {
			contactRepo.save(contact);
			message = contact.getcId()+" Contact is saved";
		}else {
			message="Contact is not saved";
		}
		return message;
	}

	@Override
	public String deleteContactById(int cId) {
		String message=null;
		boolean flag= contactRepo.existsById(cId);
		if(flag) {
			contactRepo.deleteById(cId);
			message="Deleted contact by "+cId;
		}else {
			message="Contact not deleted";
		}
		return message;
	}
	
	public Contact findContactById(int cId) {
		
		Contact y= null;
		boolean flag= contactRepo.existsById(cId);
		if(flag) {
			y = contactRepo.findContactById(cId);
			
		}
		return y;
	}

	@Override
	public List<Contact> findAllContact(Sort sort) {
		return contactRepo.findAllContact(Sort.by("cName"));
	}

	@Override
	public Contact exist(String cName) {
		return contactRepo.exist(cName);
	}

	@Override
	public List<Contact> getContactsGrater(int cId) {
		
		return contactRepo.getContacts(cId);
	}

	@Override
	public Page<Contact> getContactPage(int page, int elementPerPage) {
		PageRequest paging =PageRequest.of(page, elementPerPage);
		return contactRepo.findAll(paging);
	}

	@Override
	public List<Contact> getContactGrater() {
		return contactRepo.getContactGrater();
	}

	
}
