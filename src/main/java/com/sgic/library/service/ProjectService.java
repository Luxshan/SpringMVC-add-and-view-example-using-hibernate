package com.sgic.library.service;

import java.util.List;

import com.sgic.library.model.Project;

public interface ProjectService {
	public abstract Project addProject(Project project);
	public List<Project> getAllProject();
}
