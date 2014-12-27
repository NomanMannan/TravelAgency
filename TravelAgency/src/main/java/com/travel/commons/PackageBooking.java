package com.travel.commons;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

@Entity
public class PackageBooking extends Booking {
	@NotNull
	private int adults;
	private int childs;
	@Future
	private Date startDate;

	public PackageBooking() {
		// TODO Auto-generated constructor stub
	}

	public PackageBooking(String name, String email, String phone,
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
