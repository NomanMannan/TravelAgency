package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Transport;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.ITransportDAO;
@Repository
public class TransportDAO extends GenericHibernateDAO<Transport, Long>
		implements ITransportDAO {

}
