package com.travel.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.travel.commons.Photo;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPhotoDAO;
@Repository
@Transactional(propagation=Propagation.MANDATORY)
public class PhotoDAO extends GenericHibernateDAO<Photo, Long> implements
		IPhotoDAO {

}
