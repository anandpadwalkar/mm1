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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"college_master\"")
public class CollegeMasterEntity implements Serializable{

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "college_id", columnDefinition = "serial")
	private int collegeId;
	@Column(name = "\"coll_name\"")
	private String collegeName;
	@Column(name = "\"coll_code\"")
	private String collegeCode;
	@Column(name = "\"coll_logo\"")
	private String collegeLogo;
	@Column(name = "\"panno\"")
	private String panNumber;
	@Column(name = "\"tinno\"")
	private String tinNumber;
	@Column(name = "\"tanno\"")
	private String tanNumber;
	@Column(name = "\"principal\"")
	private String principalName;
	@Column(name = "\"workorderno\"")
	private String workOrderNumber;
	@Column(name = "\"workorderdate\"")
	private Date workOrderDate;
	@Column(name = "\"pro_start_dt\"")
	private Date projectStartDate;
	@Column(name = "\"pro_end_dt\"")
	private Date projectEndDate;
	@Column(name = "\"is_soc_coll\"")
	private boolean socialCollege;
	@Column(name = "\"active\"")
	private int active;
	@Column(name = "\"no_of_users\"")
	private int numberOfUsers;
	@Column(name = "\"ipAddress\"")
	private String ipAddress;
	@Column(name = "\"macAddress\"")
	private String macAddress;
	@Column(name = "\"created_by\"")
	private int createdBy;
	@Column(name = "\"create_dt\"")
	private Date createdDate;
	@Column(name = "\"modified_by\"")
	private int modifiedBy;
	@Column(name = "\"modified_dt\"")
	private Date modifiedDate;
	
	@Column(name = "\"soc_id\"")
	private int societyId;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "\"soc_id\"", referencedColumnName = "soc_id", insertable = false, updatable = false, nullable = false)
	private SocietyMaster societyMaster;
	
	@Column(name = "\"univid\"")
	private int universityId;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "\"univid\"", referencedColumnName = "univsrno", insertable = false, updatable = false, nullable = false)
	private UniversityMaster universityMaster;
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeLogo() {
		return collegeLogo;
	}
	public void setCollegeLogo(String collegeLogo) {
		this.collegeLogo = collegeLogo;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public int getSocietyId() {
		return societyId;
	}
	public void setSocietyId(int societyId) {
		this.societyId = societyId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getTinNumber() {
		return tinNumber;
	}
	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	public String getTanNumber() {
		return tanNumber;
	}
	public void setTanNumber(String tanNumber) {
		this.tanNumber = tanNumber;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getWorkOrderNumber() {
		return workOrderNumber;
	}
	public void setWorkOrderNumber(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}
	public Date getWorkOrderDate() {
		return workOrderDate;
	}
	public void setWorkOrderDate(Date workOrderDate) {
		this.workOrderDate = workOrderDate;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	public void setProjectEndDate(Date projectEndDate) {
		this.projectEndDate = projectEndDate;
	}
	public boolean isSocialCollege() {
		return socialCollege;
	}
	public void setSocialCollege(boolean socialCollege) {
		this.socialCollege = socialCollege;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getNumberOfUsers() {
		return numberOfUsers;
	}
	public void setNumberOfUsers(int numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
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
	public SocietyMaster getSocietyMaster() {
		return societyMaster;
	}
	public void setSocietyMaster(SocietyMaster societyMaster) {
		this.societyMaster = societyMaster;
	}
	public UniversityMaster getUniversityMaster() {
		return universityMaster;
	}
	public void setUniversityMaster(UniversityMaster universityMaster) {
		this.universityMaster = universityMaster;
	}
	
	
}
