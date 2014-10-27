package com.travel.commons;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Admin extends Person {

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, String gender, Address address, String phone,
			String email, Date dob, UserCredential user) {
		super(name, gender, address, phone, email, dob, user);
	}

}
