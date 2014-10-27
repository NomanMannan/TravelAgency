package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Person;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPersonDAO;
@Repository
public class PersonDAO extends GenericHibernateDAO<Person, Long> implements
		IPersonDAO {

}
