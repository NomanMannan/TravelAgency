package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Country;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ICountryDAO;
@Repository
public class CountryDAO extends GenericHibernateDAO<Country, Long> implements
		ICountryDAO {

}
