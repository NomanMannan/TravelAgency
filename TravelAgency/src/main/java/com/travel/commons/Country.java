package com.travel.commons;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Country {
	@Id
	@GeneratedValue
	private long id;
	@Size(min=5, max=20, message="Name must be between 5 and 20 characters")
	private String name;
	@Lob
	private String description;
	@OneToMany(mappedBy="country")
	private List<Place> places;

	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public void addPlace(Place place) {
		places.add(place);

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

}
