package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Admin;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IAdminDAO;
@Repository
public class AdminDAO extends GenericHibernateDAO<Admin, Long> implements
		IAdminDAO {

}
