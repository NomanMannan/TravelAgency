package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Transport;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ITransportDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class TransportDAO extends GenericHibernateDAO<Transport, Long>
		implements ITransportDAO {

}
