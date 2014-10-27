package com.travel.dao;

import org.springframework.stereotype.Repository;

import com.travel.commons.Photo;
import com.travel.idao.GenericHibernateDAO;
import com.travel.idao.IPhotoDAO;
@Repository
public class PhotoDAO extends GenericHibernateDAO<Photo, Long> implements
		IPhotoDAO {

}
