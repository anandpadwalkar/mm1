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

import com.iitms.rfcampusdata.authentication.dao.ModuleDao;
import com.iitms.rfcampusdata.authentication.entity.ModuleMasterEntity;
import com.iitms.rfcampusdomain.authentication.service.ModuleService;

@Service
@Transactional
public class ModuleServiceImpl implements ModuleService{

	@Autowired
	private ModuleDao moduleDao;
	
	@Override
	public List<ModuleMasterEntity> listAuthorisedModule() {
		return moduleDao.listAuthorisedModule();
	}

	@Override
	public boolean addModule(ModuleMasterEntity moduleMasterEntity) {
		return moduleDao.addModule(moduleMasterEntity);
	}

	@Override
	public boolean updateModule(ModuleMasterEntity moduleMasterEntity) {
		return moduleDao.updateModule(moduleMasterEntity);
	}

	@Override
	public boolean isModuleNameExist(int moduleId, String moduleName) {
		return moduleDao.isModuleNameExist(moduleId, moduleName);
	}

	@Override
	public ModuleMasterEntity getModuleInfo(int moduleId) {
		return moduleDao.getModuleInfo(moduleId);
	}

}
