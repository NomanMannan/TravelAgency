package com.travel.commons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	@NotNull(message="Give your name")
	private String name;
	@Pattern(regexp="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", message="Invalid email address")
	private String email;
	@NotNull(message="Give your phone number")
	private String phone;
	private String comments;

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(String name, String email, String phone, String comments) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
