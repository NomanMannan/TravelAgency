package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Package;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPackageDAO;

@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class PackageDAO extends GenericHibernateDAO<Package, Long> implements
		IPackageDAO {

}
