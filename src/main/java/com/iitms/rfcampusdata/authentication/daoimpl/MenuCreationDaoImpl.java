/*******************************************************************************
 * Copyright (c) 2015 MasterSoft.
 * Team Java
 * All rights reserved.
 *******************************************************************************/
package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.MenuCreationDao;
import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;

@Repository
public class MenuCreationDaoImpl implements MenuCreationDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<MenuMasterEntity> getModulewiseMenu(int moduleId, int searchInTable) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = null;

        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.property("menuId").as("menuId"));
        projectionList.add(Projections.property("menuName").as("menuName"));
        projectionList.add(Projections.property("menuLink").as("menuLink"));

        criteria = session.createCriteria(MenuMasterEntity.class);

        List<MenuMasterEntity> list = criteria.setProjection(projectionList).add(Restrictions.eq("moduleId", moduleId))
            .setResultTransformer(new AliasToBeanResultTransformer(MenuMasterEntity.class)).list();

        return list;
    }

    @Override
    public boolean addMenu(MenuMasterEntity menuMasterEntity) {
        this.sessionFactory.getCurrentSession().save(menuMasterEntity);
        return true;
    }

    @Override
    public boolean updateMenu(MenuMasterEntity menuMasterEntity) {
        Session session = this.sessionFactory.getCurrentSession();
        MenuMasterEntity existingMenuEntity =
            (MenuMasterEntity) session.get(MenuMasterEntity.class, menuMasterEntity.getMenuId());
        existingMenuEntity.setModuleId(menuMasterEntity.getModuleId());
        existingMenuEntity.setMenuName(menuMasterEntity.getMenuName());
        existingMenuEntity.setMenuLink(menuMasterEntity.getMenuLink());
        existingMenuEntity.setMenuTooltip(menuMasterEntity.getMenuTooltip());
        existingMenuEntity.setMenuStatus(menuMasterEntity.getMenuStatus());
        session.update(existingMenuEntity);
        return true;
    }

    @Override
    public boolean isMenuExist(String menuName, int moduleId) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria;

        criteria = session.createCriteria(MenuMasterEntity.class);
        Object o = criteria.setProjection(Projections.rowCount()).add(Restrictions.eq("menuName", menuName))
            .add(Restrictions.eq("moduleId", moduleId)).uniqueResult();
        return o != null ? true : false;
    }

    @Override
    public MenuMasterEntity getMenuInfo(int menuId) {
        Session session = this.sessionFactory.getCurrentSession();
        Criteria criteria = null;

        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.property("moduleId").as("moduleId"));
        projectionList.add(Projections.property("menuName").as("menuName"));
        projectionList.add(Projections.property("menuLink").as("menuLink"));
        projectionList.add(Projections.property("menuTooltip").as("menuToolTip"));// menuStatus
        projectionList.add(Projections.property("menuStatus").as("active"));
        projectionList.add(Projections.property("parentMenuId").as("parentMenuId"));

        criteria = session.createCriteria(MenuMasterEntity.class);

        MenuMasterEntity menuResponse = (MenuMasterEntity) criteria.setProjection(projectionList)
            .add(Restrictions.eq("menuId", menuId)).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP).uniqueResult();

        return menuResponse;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<MenuMasterEntity> getMainMenu(int moduleId) {
        Session session = this.sessionFactory.getCurrentSession();
        ProjectionList projectionList = Projections.projectionList();
        projectionList.add(Projections.property("menuId").as("menuId"));
        projectionList.add(Projections.property("menuName").as("menuName"));

        List<MenuMasterEntity> list = session.createCriteria(MenuMasterEntity.class).setProjection(projectionList)
            .add(Restrictions.eq("moduleId", moduleId)).add(Restrictions.eq("parentMenuId", moduleId))
            .setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP).list();

        return list;
    }

}
