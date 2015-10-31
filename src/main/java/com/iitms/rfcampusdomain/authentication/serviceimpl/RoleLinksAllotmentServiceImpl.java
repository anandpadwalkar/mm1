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

import com.iitms.rfcampusdata.authentication.dao.RoleLinksAllotmentDao;
import com.iitms.rfcampusdomain.authentication.service.MenuService;
import com.iitms.rfcampusdomain.authentication.service.ModuleService;
import com.iitms.rfcampusdomain.authentication.service.RoleLinksAllotmentService;

@Service
@Transactional
public class RoleLinksAllotmentServiceImpl implements RoleLinksAllotmentService{

	@Autowired
	private RoleLinksAllotmentDao roleLinksAllotmentDao;
	@Autowired
	private ModuleService moduleService;
	@Autowired
	private MenuService menuService;
	
	@Override
	public List<Integer> getAllocatedMenuIds(int roleId) {
		return roleLinksAllotmentDao.getAllocatedMenuIds(roleId);
	}
	@Override
	public boolean allotMenus(int roleId, String menuIds) {
		return roleLinksAllotmentDao.allotMenus(roleId, menuIds);
	}
	@Override
	public boolean updateAllotedMenus(int roleId, String menuIds) {
		return roleLinksAllotmentDao.updateAllotedMenus(roleId, menuIds);
	}
	
	
}
