/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ua_role_type_master")
public class RoleTypeMasterEntity implements Serializable{

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "serial")
    private int id;
    @Column(name = "role_type_name")
    private String roleTypeName;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRoleTypeName() {
        return roleTypeName;
    }
    public void setRoleTypeName(String roleTypeName) {
        this.roleTypeName = roleTypeName;
    }
    
    
}
