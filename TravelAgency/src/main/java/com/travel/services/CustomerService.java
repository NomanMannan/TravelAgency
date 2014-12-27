package com.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Country;
import com.travel.commons.Package;
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
import com.travel.iservices.ICustomerService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CustomerService implements ICustomerService {

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
