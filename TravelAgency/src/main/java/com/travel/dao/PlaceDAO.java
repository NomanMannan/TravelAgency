package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Place;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPlaceDAO;
@Repository
public class PlaceDAO extends GenericHibernateDAO<Place, Long> implements
		IPlaceDAO {

}
