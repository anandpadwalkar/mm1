/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ua_module_master")
public class ModuleMasterEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mod_id", columnDefinition = "serial")
	private int id;
	@Column(name = "mod_name")
	private String moduleName;
	@Column(name = "mod_status")
	private int moduleStatus;
	@Column(name = "created_by")
	private int createdBy;
	@Column(name = "created_dt")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name = "modified_by")
	private int modifiedBy;
	@Column(name = "modified_dt")
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	@Temporal(TemporalType.DATE)
	private Date modifiedDate;
	@Column(name = "ipaddress")
	private String ipAddress;
	@Column(name = "macaddress")
	private String macAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getModuleStatus() {
		return moduleStatus;
	}
	public void setModuleStatus(int moduleStatus) {
		this.moduleStatus = moduleStatus;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	@Override
	public String toString() {
		return "ModuleMasterEntity [id=" + id + ", moduleName=" + moduleName + ", moduleStatus=" + moduleStatus + "]";
	}
	
	
	
	
}
