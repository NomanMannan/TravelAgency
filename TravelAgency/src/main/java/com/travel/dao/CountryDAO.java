package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Country;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ICountryDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class CountryDAO extends GenericHibernateDAO<Country, Long> implements
		ICountryDAO {

}
