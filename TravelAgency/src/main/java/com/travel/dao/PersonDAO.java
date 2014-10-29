package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Person;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPersonDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class PersonDAO extends GenericHibernateDAO<Person, Long> implements
		IPersonDAO {

}
