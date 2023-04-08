package com.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contacts.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
