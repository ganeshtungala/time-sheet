package com.vam.gt.Timesheet.Timesheet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vam.gt.Timesheet.Timesheet.Entity.Projects;



public interface ProjectsRepository extends JpaRepository<Projects, Integer> {

	List<Projects> findAll();
 
}