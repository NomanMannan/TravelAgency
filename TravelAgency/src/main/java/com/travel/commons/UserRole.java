package com.travel.commons;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class UserRole implements Serializable{
	@Id
	private String username;
    @Enumerated(EnumType.STRING)
    @Column(name="authority")
	private UserType role;

	public UserRole() {
		// TODO Auto-generated constructor stub
	}

	public UserRole(String username, UserType role) {

		this.username = username;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserType getRole() {
		return role;
	}

	public void setRole(UserType role) {
		this.role = role;
	}

}
