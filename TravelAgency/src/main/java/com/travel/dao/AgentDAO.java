package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Agent;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IAgentDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class AgentDAO extends GenericHibernateDAO<Agent, Long> implements
		IAgentDAO {

}
