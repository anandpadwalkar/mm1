/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iitms.rfcampusdata.authentication.dao.RoleCreationDao;
import com.iitms.rfcampusdata.authentication.entity.RoleMasterEntity;
import com.iitms.rfcampusdomain.authentication.service.RoleCreationService;

@Service
@Transactional
public class RoleCreationServiceImpl implements RoleCreationService{

	@Autowired
	private RoleCreationDao roleCreationDao;
	
	@Override
	public List<RoleMasterEntity> getRolesByUserType(int roleTypeId) {
		return roleCreationDao.getRolesByUserType(roleTypeId);
	}

	@Override
	public RoleMasterEntity getRolesInfo(int roleId) {
		return roleCreationDao.getRolesInfo(roleId);
	}

	@Override
	public boolean addRole(RoleMasterEntity roleMasterEntity) {
		return roleCreationDao.addRole(roleMasterEntity);
	}

	@Override
	public boolean updateRole(RoleMasterEntity roleMasterEntity) {
		return roleCreationDao.updateRole(roleMasterEntity);
	}

	@Override
	public boolean isRoleExist(int roleID, String roleName) {
		return roleCreationDao.isRoleExist(roleID, roleName);
	}

}
