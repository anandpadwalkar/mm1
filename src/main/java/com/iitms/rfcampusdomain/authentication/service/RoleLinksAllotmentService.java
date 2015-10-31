/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

public interface RoleLinksAllotmentService {

	public List<Integer> getAllocatedMenuIds(int roleId);
	public boolean allotMenus(int roleId, String menuIds);
	public boolean updateAllotedMenus(int roleId, String menuIds);
}
