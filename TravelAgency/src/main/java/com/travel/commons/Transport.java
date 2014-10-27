package com.travel.commons;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transport {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int seats;
	private int maxBag;
	private double price;

	public Transport() {
		// TODO Auto-generated constructor stub
	}

	public Transport(String name, int seats, int maxBag, double price) {
		super();
		this.name = name;
		this.seats = seats;
		this.maxBag = maxBag;
		this.price = price;
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

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getMaxBag() {
		return maxBag;
	}

	public void setMaxBag(int maxBag) {
		this.maxBag = maxBag;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
