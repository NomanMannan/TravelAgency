package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.UserRole;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IUserRoleDAO;

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class UserRoleDAO extends
		GenericHibernateDAO<UserRole, String> implements IUserRoleDAO {

}
