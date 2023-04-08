package com.contacts.services;

import java.util.List;

import com.contacts.payload.ContactDTO;

public interface ContactService {
	
	
	public List<ContactDTO> findAllContacts();

}
