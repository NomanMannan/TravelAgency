package com.travel.commons;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Package {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private Date startDate;
	private Date endDate;
	private int duration;
	private SightSeeing sightSeeing;
	private Place place;
	private Transport transport;
	private double basePrice;
	private double profit;
	private int bonusPoint;
	private String itenarary;
	private String termsAndConditions;
	private String cancellationPolicy;

	public Package() {
		// TODO Auto-generated constructor stub
	}

	public Package(String name, Date startDate, Date endDate, int duration,
			SightSeeing sightSeeing, Place place, Transport transport,
			double basePrice, double profit, int bonusPoint, String itenarary,
			String termsAndConditions, String cancellationPolicy) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.duration = duration;
		this.sightSeeing = sightSeeing;
		this.place = place;
		this.transport = transport;
		this.basePrice = basePrice;
		this.profit = profit;
		this.bonusPoint = bonusPoint;
		this.itenarary = itenarary;
		this.termsAndConditions = termsAndConditions;
		this.cancellationPolicy = cancellationPolicy;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public SightSeeing getSightSeeing() {
		return sightSeeing;
	}

	public void setSightSeeing(SightSeeing sightSeeing) {
		this.sightSeeing = sightSeeing;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getItenarary() {
		return itenarary;
	}

	public void setItenarary(String itenarary) {
		this.itenarary = itenarary;
	}

	public String getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public String getCancellationPolicy() {
		return cancellationPolicy;
	}

	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}

}
