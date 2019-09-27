package com.sgic.library.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sgic.library.model.Project;

@Repository
@Transactional
public class ProjectDAOImpl implements ProjectDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Project createProject(Project project) {
		hibernateTemplate.save(project);
		return null;
	}
	
	public List<Project> getAllProject() {
		
		List<Project> project = hibernateTemplate.loadAll(Project.class);
		//List<Project> project =  (List<Project>) getHibernateTemplate().find(query);
		return project;
	}

}
