/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.RoleMasterEntity;

public interface RoleCreationService {

	public List<RoleMasterEntity> getRolesByUserType(int roleTypeId);
	public RoleMasterEntity getRolesInfo(int roleId);
	public boolean addRole(RoleMasterEntity roleMasterEntity);
	public boolean updateRole(RoleMasterEntity roleMasterEntity);
	public boolean isRoleExist(int roleID, String roleName);
}
