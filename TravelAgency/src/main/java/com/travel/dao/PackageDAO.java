package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPackageDAO;
@Repository
public class PackageDAO extends GenericHibernateDAO<Package, Long> implements
		IPackageDAO {

}
