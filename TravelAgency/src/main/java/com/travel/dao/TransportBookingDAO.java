package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.TransportBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ITransportBookingDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class TransportBookingDAO extends
		GenericHibernateDAO<TransportBooking, Long> implements
		ITransportBookingDAO {

}
