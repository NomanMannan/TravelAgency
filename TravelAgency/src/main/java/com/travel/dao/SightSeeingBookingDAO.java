package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.SightSeeingBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ISightSeeingBookingDAO;
@Repository
public class SightSeeingBookingDAO extends
		GenericHibernateDAO<SightSeeingBooking, Long> implements
		ISightSeeingBookingDAO {

}
