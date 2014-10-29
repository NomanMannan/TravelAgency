package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.PlanMyTripBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPlanMyTripBookingDAO;
@Repository
public class PlanMyTripBookingDAO extends
		GenericHibernateDAO<PlanMyTripBooking, Long> implements
		IPlanMyTripBookingDAO {

}
