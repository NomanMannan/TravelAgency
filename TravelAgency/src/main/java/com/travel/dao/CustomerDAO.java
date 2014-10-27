package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Customer;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ICustomerDAO;
@Repository
public class CustomerDAO extends GenericHibernateDAO<Customer, Long> implements
		ICustomerDAO {

}
