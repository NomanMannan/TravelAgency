package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.PackageBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPackageBookingDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class PackageBookingDAO extends
		GenericHibernateDAO<PackageBooking, Long> implements IPackageBookingDAO {

}
