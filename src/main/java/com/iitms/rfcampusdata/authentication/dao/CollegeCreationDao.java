/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/

package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.CollegeMasterEntity;

public interface CollegeCreationDao
{

    public List<CollegeMasterEntity> getCollegeList();

    public boolean addCollege(CollegeMasterEntity collegeMasterEntity);

    public boolean updateCollege(CollegeMasterEntity collegeMasterEntity);

    public boolean isCollegeExist(String collegeName);
}
