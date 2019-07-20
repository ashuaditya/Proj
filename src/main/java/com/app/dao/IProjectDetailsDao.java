package com.app.dao;

import org.springframework.stereotype.Component;

import com.app.model.ProjectDetails;

@Component
public interface IProjectDetailsDao {

	public Integer saveProjectDetails(ProjectDetails p);
}
