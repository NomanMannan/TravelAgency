package com.travel.commons;

import javax.persistence.Entity;

@Entity
public class TransportBooking extends Booking {

	public TransportBooking() {
		// TODO Auto-generated constructor stub
	}

	public TransportBooking(String name, String email, String phone,
			String comments) {
		super(name, email, phone, comments);
	}

}
