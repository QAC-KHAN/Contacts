package com.contacts.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.contacts.models.Owner;
import com.contacts.repositories.OwnerRepository;


public class OwnerServiceImpl implements OwnerService{

	
	@Autowired
	private OwnerRepository ownerRepository;
	
//	public OwnerServiceImpl(OwnerRepository ownerRepository) {
//		this.ownerRepository=ownerRepository;
//	}


	@Override
	public Owner Save(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepository.save(owner);
	}

}
