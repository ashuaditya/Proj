package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IProjectDetailsDao;
import com.app.model.ProjectDetails;
import com.app.repo.ProjectDetailsRepository;

@Repository
public class ProjectDetailsDaoImpl implements IProjectDetailsDao{

	@Autowired
	private ProjectDetailsRepository repo;
	
	@Transactional
	public Integer saveProjectDetails(ProjectDetails p) {
		p = repo.save(p);
		return p.getPdId();
	}

}
