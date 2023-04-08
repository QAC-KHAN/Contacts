package com.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contacts.models.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
