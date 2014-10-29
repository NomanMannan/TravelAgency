package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.UserCredential;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IUserCredentialDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class UserCredentialDAO extends
		GenericHibernateDAO<UserCredential, Long> implements IUserCredentialDAO {

}
