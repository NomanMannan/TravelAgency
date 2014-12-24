package com.travel.iservices;

import java.util.List;

import com.travel.commons.Admin;
import com.travel.commons.Agent;
import com.travel.commons.Country;
import com.travel.commons.Customer;
import com.travel.commons.Manager;
import com.travel.commons.Package;
import com.travel.commons.Photo;
import com.travel.commons.Place;
import com.travel.commons.SightSeeing;
import com.travel.commons.Transport;

public interface IAdminService {
	public void addAdmin(Admin admin);

	public void addAgent(Agent agent);

	public void updateAgent(Agent agent);

	public void deleteAgent(Agent agent);

	public void updateCustomer(Customer customer);

	public void addManager(Manager manager);

	public void updateManager(Manager manager);

	public void deleteManager(Manager manager);

	public void addCountry(Country country);

	public void updateCountry(Country country);

	public void deleteCountry(Country country);

	public void addPackage(Package pac);

	public void updatePackage(Package pac);

	public void deletePackage(Package pac);

	public void addPhoto(Photo photo);

	public void updatePhoto(Photo photo);

	public void deletePhoto(Photo photo);

	public void addPlace(Place place);

	public void updatePlace(Place place);

	public void deletePlace(Place place);

	public void addSightseeing(SightSeeing sightseeing);

	public void updateSightseeing(SightSeeing sightseeing);

	public void deleteSightseeing(SightSeeing sightseeing);

	public void addTransport(Transport transport);

	public void updateTransport(Transport transport);

	public void deleteTransport(Transport transport);

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
