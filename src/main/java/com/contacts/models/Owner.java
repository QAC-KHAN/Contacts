package com.contacts.models;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	@Column(name="full_name")
	private String fullName;



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


}
