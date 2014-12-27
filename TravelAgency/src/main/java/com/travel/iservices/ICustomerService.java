package com.travel.iservices;

import java.util.List;

import com.travel.commons.Country;
import com.travel.commons.Package;
import com.travel.commons.Place;
import com.travel.commons.SightSeeing;
import com.travel.commons.Transport;

public interface ICustomerService {
	
	public List<Country> getCountries();

	public List<Place> getPlaces();

	public List<SightSeeing> getSightseeings();

	public List<Transport> getTransports();

	public List<Package> getPackages();

	public Country getCountry(Long id);

	public Place getPlace(Long id);

	public SightSeeing getSightseeing(Long id);

	public Transport getTransport(Long id);

	public Package getPackage(Long id);

}
