package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.SightSeeing;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ISightSeeingDAO;

@Repository
public class SightSeeingDAO extends GenericHibernateDAO<SightSeeing, Long>
		implements ISightSeeingDAO {

}
