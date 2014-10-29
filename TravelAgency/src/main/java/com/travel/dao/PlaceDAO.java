package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Place;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPlaceDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class PlaceDAO extends GenericHibernateDAO<Place, Long> implements
		IPlaceDAO {

}
