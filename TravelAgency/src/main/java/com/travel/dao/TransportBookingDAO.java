package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.TransportBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ITransportBookingDAO;
@Repository
public class TransportBookingDAO extends
		GenericHibernateDAO<TransportBooking, Long> implements
		ITransportBookingDAO {

}
