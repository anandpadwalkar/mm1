/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.CollegeCreationDao;
import com.iitms.rfcampusdata.authentication.entity.CollegeMasterEntity;

@Repository
public class CollegeCreationDaoImpl implements CollegeCreationDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CollegeMasterEntity> getCollegeList() {
		List<CollegeMasterEntity> list = this.sessionFactory.getCurrentSession()
				.createCriteria(CollegeMasterEntity.class)
				.list();
		return list;
	}

	@Override
	public boolean addCollege(CollegeMasterEntity collegeMasterEntity) {
		this.sessionFactory.getCurrentSession().save(collegeMasterEntity);
		return true;
	}

	@Override
	public boolean updateCollege(CollegeMasterEntity collegeMasterEntity) {
		this.sessionFactory.getCurrentSession().update(collegeMasterEntity);
		return true;
	}

	@Override
	public boolean isCollegeExist(String collegeName) {
		Object o = this.sessionFactory.getCurrentSession()
		.createCriteria(CollegeMasterEntity.class)
		.setProjection(Projections.rowCount())
		.add(Restrictions.eq("", collegeName))
		.uniqueResult();
		
		return o != null? true : false;
	}

}
