package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.PackageBooking;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPackageBookingDAO;
@Repository
public class PackageBookingDAO extends
		GenericHibernateDAO<PackageBooking, Long> implements IPackageBookingDAO {

}
