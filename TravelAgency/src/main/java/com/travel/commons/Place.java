package com.travel.commons;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Place {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@ManyToOne
	private Country country;
	private String description;
	@OneToMany(mappedBy="place")
	private List<SightSeeing> sightSeeings;

	public Place() {
		// TODO Auto-generated constructor stub
	}

	public Place(String name, Country country, String description) {
		super();
		this.name = name;
		this.country = country;
		this.description = description;
	}

	public void addSightSeeing(SightSeeing sightSeeing) {
		sightSeeings.add(sightSeeing);

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
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SightSeeing> getSightSeeings() {
		return sightSeeings;
	}

	public void setSightSeeings(List<SightSeeing> sightSeeings) {
		this.sightSeeings = sightSeeings;
	}

}
