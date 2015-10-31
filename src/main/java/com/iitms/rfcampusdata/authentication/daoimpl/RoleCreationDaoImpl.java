/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.RoleCreationDao;
import com.iitms.rfcampusdata.authentication.entity.RoleMasterEntity;

@Repository
public class RoleCreationDaoImpl implements RoleCreationDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<RoleMasterEntity> getRolesByUserType(int roleTypeId) {
		Session session = this.sessionFactory.getCurrentSession();

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("roleId").as("roleId"));
		projectionList.add(Projections.property("roleName").as("roleName"));
		projectionList.add(Projections.property("roleDescription").as("roleDescription"));
		projectionList.add(Projections.property("active").as("active"));

		List<RoleMasterEntity> list = session.createCriteria(RoleMasterEntity.class).setProjection(projectionList)
				.add(Restrictions.eq("userTypeId", roleTypeId)).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP)
				.list();

		return list;
	}

	@Override
	public RoleMasterEntity getRolesInfo(int roleId) {
		RoleMasterEntity entity = (RoleMasterEntity) this.sessionFactory.getCurrentSession().get(RoleMasterEntity.class,
				roleId);
		return entity;
	}

	@Override
	public boolean addRole(RoleMasterEntity roleMasterEntity) {
		this.sessionFactory.getCurrentSession().save(roleMasterEntity);
		return true;
	}

	@Override
	public boolean updateRole(RoleMasterEntity roleMasterEntity) {
		Session session = this.sessionFactory.getCurrentSession();
		RoleMasterEntity existingRoleEntity = (RoleMasterEntity) session.get(RoleMasterEntity.class,
				roleMasterEntity.getRoleId());
		existingRoleEntity.setRoleName(roleMasterEntity.getRoleName());
		existingRoleEntity.setRoleDescription(roleMasterEntity.getRoleDescription());
		existingRoleEntity.setActive(roleMasterEntity.getActive());
		session.update(existingRoleEntity);
		return true;
	}

	@Override
	public boolean isRoleExist(int roleID, String roleName) {
		Session session = this.sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(RoleMasterEntity.class).setProjection(Projections.rowCount())
				.add(Restrictions.eq("roleName", roleName));
		if (roleID != 0)
			criteria.add(Restrictions.eq("userTypeId", roleID));
		Object o = criteria.uniqueResult();
		return o != null ? true : false;
	}

}
