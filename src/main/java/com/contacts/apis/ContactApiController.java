package com.contacts.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.models.Contact;
import com.contacts.payload.ContactDTO;
import com.contacts.services.ContactService;



@RestController
@RequestMapping("/api/v1/contacts")
public class ContactApiController {

	@Autowired
	ContactService contactService;
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ResponseEntity<List<ContactDTO>> getContacts(){
		List<ContactDTO> contactDTOs= contactService.findAllContacts();
		return new ResponseEntity<List<ContactDTO>>(contactDTOs,HttpStatus.OK);
	} 
}
