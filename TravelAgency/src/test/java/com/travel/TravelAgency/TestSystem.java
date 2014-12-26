package com.travel.TravelAgency;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Address;
import com.travel.commons.Admin;
import com.travel.commons.Country;
import com.travel.commons.Package;
import com.travel.commons.Place;
import com.travel.commons.SightSeeing;
import com.travel.commons.Transport;
import com.travel.commons.UserCredential;
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

@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class TestSystem extends TestCase {
	@Autowired
	private IAdminDAO adminDAO;

	@Autowired
	private IBookingDAO bookingDAO;

	@Autowired
	private ICountryDAO countryDAO;

	@Autowired
	private IPackageDAO packageDAO;

	@Autowired
	private IPackageBookingDAO packageBookingDAO;

	@Autowired
	private IPhotoDAO photoDAO;

	@Autowired
	private IPlaceDAO placeDAO;

	@Autowired
	private IPlanMyTripBookingDAO planMyTripBookingDAO;

	@Autowired
	private ISightSeeingDAO sightseeingDAO;

	@Autowired
	private ISightSeeingBookingDAO sightseeingBookingDAO;

	@Autowired
	private ITransportDAO transportDAO;

	@Autowired
	private ITransportBookingDAO transportbookingDAO;

	@Autowired
	private IUserCredentialDAO userDAO;

	@Test
	public void testContext() {
		assertNotNull(adminDAO);
		assertNotNull(bookingDAO);
		assertNotNull(countryDAO);
		assertNotNull(packageDAO);
		assertNotNull(packageBookingDAO);
		assertNotNull(photoDAO);
		assertNotNull(placeDAO);
		assertNotNull(planMyTripBookingDAO);
		assertNotNull(sightseeingDAO);
		assertNotNull(sightseeingBookingDAO);
		assertNotNull(transportDAO);
		assertNotNull(transportbookingDAO);

	}

	/**
	 * Test of all create methods
	 */
	@Test
	@Rollback(false)
	public void testCreate() {
		System.out.println("Create Admin");
		// instantiating a admin
		UserCredential user = new UserCredential("admin", "admin");
		Address address = new Address("N 4th Street", "Fairfield", "IA",
				"52557", "USA");
		Admin admin = new Admin("Noman", "Male", address, "788-988-9877",
				"admin@admin.com", new Date(), user);

		adminDAO.create(admin);
		userDAO.create(user);
		assertNotNull(admin.getId());
		// assertEquals(1, adminDAO.getAll().size());
		assertEquals(1, userDAO.getAll().size());

		System.out.println("Create Country"); // instantiating a country

		Country country = new Country("Bangladesh", "My Country");

		countryDAO.create(country);
		assertNotNull(country.getId());
		// assertEquals(1, countryDAO.getAll().size());

		System.out.println("Create Place"); // instantiating a place

		Place place = new Place("Dhaka", country, "Capital");

		placeDAO.create(place);
		assertNotNull(place.getId());
		// assertEquals(1, placeDAO.getAll().size());

		System.out.println("Create Sightseeing");

		SightSeeing sightseeing = new SightSeeing("Songsad Bhaban", 4,
				"Bulshit", 100, 50, place);

		sightseeingDAO.create(sightseeing);
		assertNotNull(sightseeing.getId());
		// assertEquals(1, sightseeingDAO.getAll().size());

		System.out.println("Create Transport");

		Transport transport = new Transport("Van", 10, 4, 100);

		transportDAO.create(transport);
		assertNotNull(transport.getId());
		//assertEquals(1, transportDAO.getAll().size());

		System.out.println("Create Package");

		Package pac = new Package("Pac1", new Date(), new Date(), 5, 100, 10, 100, "1st Pac",
				"very good", "no problem");

		packageDAO.create(pac);
		assertNotNull(pac.getId());
		//assertEquals(4, packageDAO.getAll().size());

	}

}
