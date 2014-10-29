package com.travel.commons;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class PlanMyTripBooking extends Booking {

	private String travelFromCountry;
	@OneToMany
	@JoinTable(name="planmytripbooking_country",
	joinColumns={@JoinColumn(name="booking_id")},
	inverseJoinColumns={@JoinColumn(name="country_id")})
	private List<Country> travelToCountries;
	@OneToMany
	@JoinTable(name="planmytripbooking_place",
	joinColumns={@JoinColumn(name="booking_id")},
	inverseJoinColumns={@JoinColumn(name="place_id")})
	private List<Place> travelToPlaces;
	@OneToMany
	@JoinTable(name="planmytripbooking_sightseeing",
	joinColumns={@JoinColumn(name="booking_id")},
	inverseJoinColumns={@JoinColumn(name="sightseeing_id")})
	private List<SightSeeing> travelToSightSeeings;
	private Date departureDate;
	private Date returnDate;
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

	public String TravelFromCountry() {
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

}
