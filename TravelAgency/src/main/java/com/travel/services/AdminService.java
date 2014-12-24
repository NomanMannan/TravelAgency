package com.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
import com.travel.idao.IAdminDAO;
import com.travel.idao.ICountryDAO;
import com.travel.idao.IPackageDAO;
import com.travel.idao.IPhotoDAO;
import com.travel.idao.IPlaceDAO;
import com.travel.idao.ISightSeeingDAO;
import com.travel.idao.ITransportDAO;
import com.travel.idao.IUserCredentialDAO;
import com.travel.iservices.IAdminService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class AdminService implements IAdminService {

	@Autowired
	private IAdminDAO adminDAO;

	@Autowired
	private ICountryDAO countryDAO;

	@Autowired
	private IPackageDAO packageDAO;

	@Autowired
	private IPhotoDAO photoDAO;

	@Autowired
	private IPlaceDAO placeDAO;

	@Autowired
	private ISightSeeingDAO sightseeingDAO;

	@Autowired
	private ITransportDAO transportDAO;

	@Autowired
	private IUserCredentialDAO userDAO;

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAgent(Agent agent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAgent(Agent agent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAgent(Agent agent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addManager(Manager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateManager(Manager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteManager(Manager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCountry(Country country) {
		countryDAO.create(country);
	}

	@Override
	public void updateCountry(Country country) {
		countryDAO.update(country);
	}

	@Override
	public void deleteCountry(Country country) {
		countryDAO.delete(country);
	}

	@Override
	public void addPackage(Package pac) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePackage(Package pac) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePackage(Package pac) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPhoto(Photo photo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePhoto(Photo photo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePhoto(Photo photo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlace(Place place) {
		placeDAO.create(place);

	}

	@Override
	public void updatePlace(Place place) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePlace(Place place) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSightseeing(SightSeeing sightseeing) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSightseeing(SightSeeing sightseeing) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSightseeing(SightSeeing sightseeing) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTransport(Transport transport) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Country> getCountries() {
		return countryDAO.getAll();
	}

	@Override
	public List<Place> getPlaces() {
		return placeDAO.getAll();
	}

	@Override
	public List<SightSeeing> getSightseeings() {
		return sightseeingDAO.getAll();
	}

	@Override
	public List<Transport> getTransports() {
		return transportDAO.getAll();
	}

	@Override
	public Country getCountry(Long id) {
		return countryDAO.get(id);
	}

	@Override
	public Place getPlace(Long id) {
		return placeDAO.get(id);
	}

	@Override
	public SightSeeing getSightseeing(Long id) {
		return sightseeingDAO.get(id);
	}

	@Override
	public Transport getTransport(Long id) {
		return transportDAO.get(id);
	}

	@Override
	public List<Package> getPackages() {
		return packageDAO.getAll();
	}

	@Override
	public Package getPackage(Long id) {
		return packageDAO.get(id);
	}

}
