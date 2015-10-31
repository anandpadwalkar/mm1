/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.CollegeMasterEntity;

public interface CollegeCreationService {

	public List<CollegeMasterEntity> getCollegeList();
	public boolean addCollege(CollegeMasterEntity collegeMasterEntity);
	public boolean updateCollege(CollegeMasterEntity collegeMasterEntity);
	public boolean isCollegeExist(String collegeName);
}
