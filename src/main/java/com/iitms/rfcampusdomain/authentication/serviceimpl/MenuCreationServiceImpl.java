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

import com.iitms.rfcampusdata.authentication.dao.MenuCreationDao;
import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;
import com.iitms.rfcampusdomain.authentication.service.MenuCreationService;

@Service
@Transactional
public class MenuCreationServiceImpl implements MenuCreationService{

	@Autowired
	private MenuCreationDao menuCreationDao;

	@Override
	public List<MenuMasterEntity> getModulewiseMenu(int moduleId, int searchInTable) {
		return menuCreationDao.getModulewiseMenu(moduleId, searchInTable);
	}

	@Override
	public boolean addMenu(MenuMasterEntity menuMasterEntity) {
		return menuCreationDao.addMenu(menuMasterEntity);
	}

	@Override
	public boolean updateMenu(MenuMasterEntity menuMasterEntity) {
		return menuCreationDao.updateMenu(menuMasterEntity);
	}

	@Override
	public boolean isMenuExist(String menuName, int searchInTable) {
		return menuCreationDao.isMenuExist(menuName, searchInTable);
	}

	@Override
	public MenuMasterEntity getMenuInfo(int menuId) {
		return menuCreationDao.getMenuInfo(menuId);
	}

	@Override
	public List<MenuMasterEntity> getMainMenu(int moduleId) {
		return menuCreationDao.getMainMenu(moduleId);
	}

	

	
}
