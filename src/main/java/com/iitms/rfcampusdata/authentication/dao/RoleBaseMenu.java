/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/

package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuAllocation;

public interface RoleBaseMenu 
{
	public List<RoleMenuAllocation> loadMenu(int id);
	public List<MenuMasterEntity> getMenuList(int moduleId);
}
