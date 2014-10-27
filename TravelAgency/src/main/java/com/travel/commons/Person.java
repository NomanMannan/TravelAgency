package com.travel.commons;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String name;
	private String gender;
	@Embedded
	private Address address;
	private String phone;
	private String email;
	private Date dob;
	@JoinColumn(name = "username")
	private UserCredential user;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, Address address, String phone,
			String email, Date dob, UserCredential user) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.dob = dob;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public UserCredential getUser() {
		return user;
	}

	public void setUser(UserCredential user) {
		this.user = user;
	}

}
