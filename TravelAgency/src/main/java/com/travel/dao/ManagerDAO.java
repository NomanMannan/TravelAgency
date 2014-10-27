package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Manager;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IManagerDAO;
@Repository
public class ManagerDAO extends GenericHibernateDAO<Manager, Long> implements
		IManagerDAO {

}
