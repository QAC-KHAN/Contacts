

package com.contacts.apis;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.models.Contact;

@RestController
@RequestMapping("/api/v1/owner")
public class OwnerApiController {
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResponseEntity<?> Save(){
		return new ResponseEntity<>(null);
	}

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ResponseEntity<List<Contact>> getContacts(){
		
		return new ResponseEntity<>(null);
	}  
}
