package com.travel.commons;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserCredential {
	@Id
	private String username;
	private String password;
	private boolean enabled = true;

	public UserCredential() {
		// TODO Auto-generated constructor stub
	}

	public UserCredential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public java.lang.String toString() {
		return "UserCredential [username=" + username + ", password="
				+ password + ", enabled=" + enabled + "]";
	}
}
