package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.UserCredential;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IUserCredentialDAO;
@Repository
public class UserCredentialDAO extends
		GenericHibernateDAO<UserCredential, Long> implements IUserCredentialDAO {

}
