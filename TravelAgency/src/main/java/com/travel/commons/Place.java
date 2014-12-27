package com.travel.commons;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Place {
	@Id
	@GeneratedValue
	private long id;
	@Size(min=5, max=20, message="Name must be between 5 and 20 characters")
	private String name;
	@ManyToOne
	private Country country;
	private String description;
	@OneToMany(mappedBy = "place")
	private List<SightSeeing> sightseeings;

	public Place() {
		// TODO Auto-generated constructor stub
	}

	public Place(String name, Country country, String description) {
		super();
		this.name = name;
		this.country = country;
		this.description = description;
		country.addPlace(this);
	}

	public void addSightSeeing(SightSeeing sightseeing) {
		sightseeings.add(sightseeing);

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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
		country.addPlace(this);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SightSeeing> getSightseeings() {
		return sightseeings;
	}

	public void setSightseeings(List<SightSeeing> sightseeings) {
		this.sightseeings = sightseeings;
	}

	@Override
	public String toString() {
		return name;
	}

}
