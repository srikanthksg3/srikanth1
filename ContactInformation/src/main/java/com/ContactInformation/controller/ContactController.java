package com.ContactInformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ContactInformation.entity.Contact;
import com.ContactInformation.entity.PageSettings;
import com.ContactInformation.service.ContactService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	@PostMapping
	public Contact saveContact(@RequestBody Contact contact) {
		System.out.println(contact.toString());
		return contactService.saveContact(contact);
	}
	@GetMapping
	public List<Contact> getContactList(){
		return contactService.getContactList();
	}
	@PutMapping
	public String updateContact(@RequestBody Contact contact) {
		return contactService.updateContact(contact);
	}
	@DeleteMapping("/delete/{cId}")
	public String deleteContactById(@PathVariable int cId) {
		return contactService.deleteContactById(cId);
	}
	
	@GetMapping("/contact/{cId}")
	public Contact findContactById(@PathVariable int cId) {
		return contactService.findContactById(cId);
	}
	@GetMapping("/contact")
	public List<Contact> findAllContact(Sort sort){
		return contactService.findAllContact(sort);
	}
	@GetMapping("/name/{cName}")
	public Contact exist(@PathVariable String cName) {
		return contactService.exist(cName);
	}
	@GetMapping("/id/{cId}")
	public List<Contact> getContactsGrater(@PathVariable int cId){
		return contactService.getContactsGrater(cId);
	}
	
	@GetMapping("/con/{page}/{elementPerPage}")
	public Page<Contact> getContactPage(@PathVariable int page,@PathVariable int elementPerPage ){
		return contactService.getContactPage(page,elementPerPage);
	}

	@GetMapping("/grat")
	public List<Contact> getContactGrater(){
		return contactService.getContactGrater();
	}

}
