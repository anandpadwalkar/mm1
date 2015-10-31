/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.ModuleDao;
import com.iitms.rfcampusdata.authentication.entity.ModuleMasterEntity;

@Repository
public class ModuleDaoImpl implements ModuleDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<ModuleMasterEntity> listAuthorisedModule() {
		List<ModuleMasterEntity> list = this.sessionFactory.getCurrentSession().createCriteria(ModuleMasterEntity.class)
				.addOrder(Order.asc("id"))
				.list();

		return list;
	}

	@Override
	public boolean addModule(ModuleMasterEntity moduleMasterEntity) {
		this.sessionFactory.getCurrentSession().save(moduleMasterEntity);
		return true;
	}

	@Override
	public boolean updateModule(ModuleMasterEntity moduleMasterEntity) {
		Session session = this.sessionFactory.getCurrentSession();
		ModuleMasterEntity entity = (ModuleMasterEntity) session.get(ModuleMasterEntity.class,
				moduleMasterEntity.getId());
		entity.setModuleName(moduleMasterEntity.getModuleName());
		entity.setModuleStatus(moduleMasterEntity.getModuleStatus());
		session.update(entity);
		return true;
	}

	@Override
	public boolean isModuleNameExist(int moduleId, String moduleName) {
		Session session = this.sessionFactory.getCurrentSession();
		Object o = session.createCriteria(ModuleMasterEntity.class).add(Restrictions.eq("moduleName", moduleName))
				//.add(Restrictions.ne("id", moduleId))
				.setProjection(Projections.rowCount()).uniqueResult();

		return o != null ? true : false;
	}

	@Override
	public ModuleMasterEntity getModuleInfo(int moduleId) {
		ModuleMasterEntity entity = (ModuleMasterEntity) this.sessionFactory.getCurrentSession()
				.get(ModuleMasterEntity.class, moduleId);
		return entity;
	}

}
