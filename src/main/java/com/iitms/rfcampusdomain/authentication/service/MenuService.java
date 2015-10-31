/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuAllocation;

public interface MenuService 
{
	public  List<RoleMenuAllocation> getMenuOfRole(int roleId);
	public List<MenuMasterEntity> getMenuList(int moduleId);
}
