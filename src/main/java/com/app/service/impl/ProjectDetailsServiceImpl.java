package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.impl.ProjectDetailsDaoImpl;
import com.app.model.ProjectDetails;
import com.app.service.IProjectDetailsService;

@Service
public class ProjectDetailsServiceImpl implements IProjectDetailsService{

	@Autowired
	private ProjectDetailsDaoImpl dao;
	
	public Integer saveProjectDetails(ProjectDetails p) {
	
		return dao.saveProjectDetails(p);
	}

}
