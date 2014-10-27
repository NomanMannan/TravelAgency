package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Agent;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IAgentDAO;
@Repository
public class AgentDAO extends GenericHibernateDAO<Agent, Long> implements
		IAgentDAO {

}
