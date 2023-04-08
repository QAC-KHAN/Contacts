package com.contacts.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.models.Contact;
import com.contacts.payload.ContactDTO;
import com.contacts.repositories.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	ContactRepository contactRepository;
	@Override
	public List<ContactDTO> findAllContacts() {
		// TODO Auto-generated method stub
		List<Contact> contacts= contactRepository.findAll();
		List<ContactDTO> contactDTOs=new ArrayList<>();
		//contacts.forEach(null);
		for(Contact contact:contacts) {
			ContactDTO cont=new ContactDTO();
			cont.setEmail(contact.getEmail());
			cont.setName(contact.getName());
		cont.setPhone(contact.getPhone());
			cont.setOwnerId(contact.getId());
			contactDTOs.add(cont);
		}
		
		
		/*
		contactDTOs=contacts.stream().map( recContact->{
			ContactDTO cont=new ContactDTO();
			cont.setEmail(recContact.getEmail());
			cont.setName(recContact.getName());
			cont.setPhone(recContact.getPhone());
			cont.setOwnerId(recContact.getId());
			
		}).collect();
		*/
		return contactDTOs;
	}
	
	

}
