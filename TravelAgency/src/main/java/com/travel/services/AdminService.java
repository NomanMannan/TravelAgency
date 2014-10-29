package com.travel.services;

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
import com.travel.idao.IBookingDAO;
import com.travel.idao.ICountryDAO;
import com.travel.idao.IPackageBookingDAO;
import com.travel.idao.IPackageDAO;
import com.travel.idao.IPhotoDAO;
import com.travel.idao.IPlaceDAO;
import com.travel.idao.IPlanMyTripBookingDAO;
import com.travel.idao.ISightSeeingBookingDAO;
import com.travel.idao.ISightSeeingDAO;
import com.travel.idao.ITransportBookingDAO;
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
		// TODO Auto-generated method stub

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

}
