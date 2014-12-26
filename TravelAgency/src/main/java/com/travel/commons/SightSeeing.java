package com.travel.commons;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SightSeeing {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int durations;
	private String description;
	private double adultPrice;
	private double childPrice;
	@OneToMany
	private List<Photo> photos;
	@ManyToOne
	private Place place;

	public SightSeeing() {
		// TODO Auto-generated constructor stub
	}

	public SightSeeing(String name, int durations, String description,
			double adultPrice, double childPrice, Place place) {
		super();
		this.name = name;
		this.durations = durations;
		this.description = description;
		this.adultPrice = adultPrice;
		this.childPrice = childPrice;
		this.place = place;
		place.addSightSeeing(this);
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

	public int getDurations() {
		return durations;
	}

	public void setDurations(int durations) {
		this.durations = durations;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(double adultPrice) {
		this.adultPrice = adultPrice;
	}

	public double getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(double childPrice) {
		this.childPrice = childPrice;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void addPhotos(Photo photo) {
		photos.add(photo);
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
		place.addSightSeeing(this);
	}

	@Override
	public String toString() {
		return name;
	}

}
