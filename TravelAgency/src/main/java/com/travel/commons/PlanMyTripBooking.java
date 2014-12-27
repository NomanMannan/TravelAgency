package com.travel.commons;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

@Entity
public class PlanMyTripBooking extends Booking {

	@NotNull(message="Give your departure country")
	private String travelFromCountry;
	@OneToMany
	@JoinTable(name = "planmytripbooking_country", joinColumns = { @JoinColumn(name = "booking_id") }, inverseJoinColumns = { @JoinColumn(name = "country_id") })
	@NotNull(message="Must select a country")
	private List<Country> travelToCountries;
	@OneToMany
	@JoinTable(name = "planmytripbooking_place", joinColumns = { @JoinColumn(name = "booking_id") }, inverseJoinColumns = { @JoinColumn(name = "place_id") })
	@NotNull(message="Must select a place")
	private List<Place> travelToPlaces;
	@OneToMany
	@JoinTable(name = "planmytripbooking_sightseeing", joinColumns = { @JoinColumn(name = "booking_id") }, inverseJoinColumns = { @JoinColumn(name = "sightseeing_id") })
	private List<SightSeeing> travelToSightSeeings;
	@Temporal(TemporalType.DATE)
	@Future(message="Must be a future date")
	private Date departureDate;
	@Temporal(TemporalType.DATE)
	@Future(message="Must be a future date")
	private Date returnDate;
	@NotNull
	private int adults;
	private int childs;

	public PlanMyTripBooking() {
		// TODO Auto-generated constructor stub
	}

	public PlanMyTripBooking(String travelFromCountry, Date departureDate,
			Date returnDate, int adults, int childs) {
		super();
		this.travelFromCountry = travelFromCountry;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.adults = adults;
		this.childs = childs;
	}

	public String getTravelFromCountry() {
		return travelFromCountry;
	}

	public void setTravelFromCountry(String travelFromCountry) {
		this.travelFromCountry = travelFromCountry;
	}

	public List<Country> getTravelToCountries() {
		return travelToCountries;
	}

	public void addTravelToCountries(Country travelToCountry) {
		travelToCountries.add(travelToCountry);
	}

	public List<Place> getTravelToPlaces() {
		return travelToPlaces;
	}

	public void addTravelToPlaces(Place travelToPlace) {
		travelToPlaces.add(travelToPlace);
	}

	public List<SightSeeing> getTravelToSightSeeings() {
		return travelToSightSeeings;
	}

	public void addTravelToSightSeeings(SightSeeing travelToSightSeeing) {
		travelToSightSeeings.add(travelToSightSeeing);
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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

	public void setTravelToCountries(List<Country> travelToCountries) {
		this.travelToCountries = travelToCountries;
	}

	public void setTravelToPlaces(List<Place> travelToPlaces) {
		this.travelToPlaces = travelToPlaces;
	}

	public void setTravelToSightSeeings(List<SightSeeing> travelToSightSeeings) {
		this.travelToSightSeeings = travelToSightSeeings;
	}

}
