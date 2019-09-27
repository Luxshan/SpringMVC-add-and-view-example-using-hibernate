package com.sgic.library.dao;

import java.util.List;

import com.sgic.library.model.Project;

public interface ProjectDAO {
	public abstract Project createProject(Project project);
	public List<Project> getAllProject();
}
