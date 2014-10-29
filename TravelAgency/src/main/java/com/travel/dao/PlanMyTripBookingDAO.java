package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.PlanMyTripBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPlanMyTripBookingDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class PlanMyTripBookingDAO extends
		GenericHibernateDAO<PlanMyTripBooking, Long> implements
		IPlanMyTripBookingDAO {

}
