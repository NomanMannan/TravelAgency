package com.travel.commons;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class SightSeeingBooking extends Booking {

	private int adults;
	private int childs;
	private Date startDate;

	public SightSeeingBooking() {
		// TODO Auto-generated constructor stub
	}

	public SightSeeingBooking(String name, String email, String phone,
			String comments, int adults, int childs, Date startDate) {
		super(name, email, phone, comments);
		this.adults = adults;
		this.childs = childs;
		this.startDate = startDate;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChilds() {
		return childs;
	}

	public void setChilds(int childs) {
		this.childs = childs;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
