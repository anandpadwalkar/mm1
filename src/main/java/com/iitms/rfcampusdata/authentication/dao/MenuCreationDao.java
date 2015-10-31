/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/

package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;

public interface MenuCreationDao 
{

    public List<MenuMasterEntity> getModulewiseMenu(int moduleId, int searchInTable);

    public List<MenuMasterEntity> getMainMenu(int moduleId);

    public boolean addMenu(MenuMasterEntity menuMasterEntity);

    public boolean updateMenu(MenuMasterEntity menuMasterEntity);

    public boolean isMenuExist(String menuName, int moduleId);

    public MenuMasterEntity getMenuInfo(int menuId);

}
