/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.ModuleMasterEntity;

public interface ModuleService {

	public List<ModuleMasterEntity> listAuthorisedModule();
	public boolean addModule(ModuleMasterEntity moduleMasterEntity);
	public boolean updateModule(ModuleMasterEntity moduleMasterEntity);
	public ModuleMasterEntity getModuleInfo(int moduleId);
	public boolean isModuleNameExist(int moduleId, String moduleName);
}
