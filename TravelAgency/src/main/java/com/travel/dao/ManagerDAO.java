package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Manager;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IManagerDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class ManagerDAO extends GenericHibernateDAO<Manager, Long> implements
		IManagerDAO {

}
