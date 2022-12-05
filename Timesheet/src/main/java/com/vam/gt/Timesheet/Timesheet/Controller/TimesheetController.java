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


import com.vam.gt.Timesheet.Timesheet.Entity.Timesheet;

import com.vam.gt.Timesheet.Timesheet.Service.TimesheetService;

@RestController
public class TimesheetController {
 
    @Autowired
    private TimesheetService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/timesheets")
    public List<Timesheet> list() {
        return service.listAll();
    }
    @GetMapping("/timesheets/{id}")
    public ResponseEntity<Timesheet> get(@PathVariable Integer id) {
        try {
            Timesheet timesheet = service.get(id);
            return new ResponseEntity<Timesheet>(timesheet, HttpStatus.OK);
//            return ResponseEntity.ok(timesheet);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Timesheet>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/timesheets")
    public ResponseEntity<Timesheet> add(@RequestBody Timesheet timesheet) {
        service.save(timesheet);
        return ResponseEntity.ok(timesheet);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/timesheets/{id}")
    public ResponseEntity<?> update(@RequestBody Timesheet timesheet1, @PathVariable Integer id) {
        try {
            Timesheet timesheet = service.get(id);
            
            service.save(timesheet1);
//            return new ResponseEntity<>(HttpStatus.OK);
             return ResponseEntity.ok(timesheet1);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
    
        
     
    // RESTful API method for Delete operation@DeleteMapping("/products/{id}")
    @DeleteMapping("/timesheets/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
}