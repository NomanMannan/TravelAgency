package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.SightSeeing;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ISightSeeingDAO;

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class SightSeeingDAO extends GenericHibernateDAO<SightSeeing, Long>
		implements ISightSeeingDAO {

}
