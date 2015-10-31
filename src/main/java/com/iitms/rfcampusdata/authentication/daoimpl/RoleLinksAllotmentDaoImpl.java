/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.RoleLinksAllotmentDao;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuAllocation;

@Repository
public class RoleLinksAllotmentDaoImpl implements RoleLinksAllotmentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getAllocatedMenuIds(int roleId) {
		List<Integer> ids= this.sessionFactory.getCurrentSession()
		.createCriteria(RoleMenuAllocation.class)
		.setProjection(Property.forName("menuId"))
		.add(Restrictions.eq("roleId", roleId))
		.list();
		return ids;
	}

	@Override
	public boolean allotMenus(int roleId, String menuIds) {
		Session session = this.sessionFactory.getCurrentSession();
		RoleMenuAllocation entity;
		deleteExistingAllotedMenus(session, roleId);
		for(String menuId : menuIds.split(",")){
			entity = new RoleMenuAllocation();
			entity.setRoleId(roleId);
			entity.setMenuId(Integer.parseInt(menuId));
			session.save(entity);
		}
		return true;
	}

	@Override
	public boolean updateAllotedMenus(int roleId, String menuIds) {
		return this.allotMenus(roleId, menuIds);
	}

	private boolean deleteExistingAllotedMenus(Session session, int roleId){
		session.createQuery("Delete from RoleMenuAllocation r where r.roleId = :roleId")
		.setInteger("roleId", roleId)
		.executeUpdate();
		return true;
	}
	
}
