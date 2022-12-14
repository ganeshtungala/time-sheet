package com.vam.gt.Timesheet.Timesheet.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vam.gt.Timesheet.Timesheet.Entity.Projects;

import com.vam.gt.Timesheet.Timesheet.Repository.ProjectsRepository;


@Service
@Transactional
public class ProjectsService {

   @Autowired
   private ProjectsRepository repo;
    
   public List<Projects> listAll() {
	  
       return repo.findAll();
   }
    
   public void save(Projects projects) {
       repo.save(projects);
   }
    
   public Projects get(Integer projectsId) {
       return repo.findById(projectsId).get();
   }
    
   public void delete(Integer projectsId) {
       repo.deleteById(projectsId);
   }
}