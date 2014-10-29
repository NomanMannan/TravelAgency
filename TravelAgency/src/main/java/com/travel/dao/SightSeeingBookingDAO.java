package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.SightSeeingBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ISightSeeingBookingDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class SightSeeingBookingDAO extends
		GenericHibernateDAO<SightSeeingBooking, Long> implements
		ISightSeeingBookingDAO {

}
