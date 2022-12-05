package com.vam.gt.Timesheet.Timesheet.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vam.gt.Timesheet.Timesheet.Entity.Projects;

import com.vam.gt.Timesheet.Timesheet.Service.ProjectsService;


@RestController
public class ProjectsController {
 
    @Autowired
    private ProjectsService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/Projects")
    public List<Projects> list() {
        return service.listAll();
    }
    @GetMapping("/Projects/{id}")
    public ResponseEntity<Projects> get(@PathVariable Integer id) {
        try {
        	Projects projects = service.get(id);
            return new ResponseEntity<Projects>(projects, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Projects>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/Projects")
    public ResponseEntity<Projects> add(@RequestBody Projects projects) {
        service.save(projects);
        return ResponseEntity.ok(projects);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/Projects/{id}")
    public ResponseEntity<?> update(@RequestBody Projects projects1, @PathVariable Integer id) {
        try {
        	Projects projects = service.get(id);
            
            service.save(projects1);
//            return new ResponseEntity<>(HttpStatus.OK);
             return ResponseEntity.ok(projects1);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    
        
     
    // RESTful API method for Delete operation@DeleteMapping("/products/{id}")
    @DeleteMapping("/Projects/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
}
