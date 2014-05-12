package com.shambhu.service;

import com.shambhu.model.Project;

public class ProjectService {
	private Project project;

	public Project getProject() {
		System.out.println("Get Project Method");
		return project;
	}

	public void setProject(Project project) {
		System.out.println("Set Project Method");
		this.project = project;
	}

}
