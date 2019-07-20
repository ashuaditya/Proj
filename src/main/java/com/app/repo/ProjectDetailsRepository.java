package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.ProjectDetails;


public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Integer>
{
	 ProjectDetails save(ProjectDetails ps);
}