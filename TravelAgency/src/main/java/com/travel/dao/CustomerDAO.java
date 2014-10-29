package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Customer;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ICustomerDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class CustomerDAO extends GenericHibernateDAO<Customer, Long> implements
		ICustomerDAO {

}
