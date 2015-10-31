/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdomain.authentication.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iitms.rfcampusdata.authentication.dao.DomainDao;
import com.iitms.rfcampusdomain.authentication.service.DomainService;

@Service
public class DomainServiceImpl implements DomainService{

	@Autowired
	private DomainDao domainDao;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return domainDao.getMessage();
	}

}
