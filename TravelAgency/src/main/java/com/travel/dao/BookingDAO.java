package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Booking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IBookingDAO;
@Repository
public class BookingDAO extends GenericHibernateDAO<Booking, Long> implements
		IBookingDAO {

}
