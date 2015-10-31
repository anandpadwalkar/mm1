/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ua_role_menu_allo")
public class RoleMenuAllocation implements Serializable{

	@Id
	@Column(name = "ua_roll_menu_all_id")
	private int id;
	@Column(name = "ua_role_id")
	private int roleId;
	@Column(name = "menu_id")
	private int menuId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id", referencedColumnName = "menu_id", insertable = false, updatable = false, nullable = false)
	private MenuMasterEntity menu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public MenuMasterEntity getMenu() {
		return menu;
	}

	public void setMenu(MenuMasterEntity menu) {
		this.menu = menu;
	}

	
	
	
}
