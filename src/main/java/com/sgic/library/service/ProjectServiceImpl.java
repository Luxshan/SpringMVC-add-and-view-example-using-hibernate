package com.sgic.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.library.dao.ProjectDAO;
import com.sgic.library.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
    private ProjectDAO projectDAO;

	public ProjectDAO getProjectDAO() {
		return projectDAO;
	}

	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		return projectDAO.createProject(project);
	}

	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return projectDAO.getAllProject();
	}
}
