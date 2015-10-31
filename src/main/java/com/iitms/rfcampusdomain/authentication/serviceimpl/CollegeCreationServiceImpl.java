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

import com.iitms.rfcampusdata.authentication.dao.CollegeCreationDao;
import com.iitms.rfcampusdata.authentication.entity.CollegeMasterEntity;
import com.iitms.rfcampusdomain.authentication.service.CollegeCreationService;

@Service
@Transactional
public class CollegeCreationServiceImpl implements CollegeCreationService{

	@Autowired
	private CollegeCreationDao collegeCreationDao; 
	
	@Override
	public List<CollegeMasterEntity> getCollegeList() {
		return collegeCreationDao.getCollegeList();
	}

	@Override
	public boolean addCollege(CollegeMasterEntity collegeMasterEntity) {
		return collegeCreationDao.addCollege(collegeMasterEntity);
	}

	@Override
	public boolean updateCollege(CollegeMasterEntity collegeMasterEntity) {
		return collegeCreationDao.updateCollege(collegeMasterEntity);
	}

	@Override
	public boolean isCollegeExist(String collegeName) {
		return collegeCreationDao.isCollegeExist(collegeName);
	}

}
