package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Admin;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IAdminDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class AdminDAO extends GenericHibernateDAO<Admin, Long> implements
		IAdminDAO {

}
