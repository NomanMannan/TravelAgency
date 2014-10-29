package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Booking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IBookingDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class BookingDAO extends GenericHibernateDAO<Booking, Long> implements
		IBookingDAO {

}
