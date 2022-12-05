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


import com.vam.gt.Timesheet.Timesheet.Entity.Tickets;

import com.vam.gt.Timesheet.Timesheet.Service.TicketsService;

@RestController
public class TicketsController {
 
    @Autowired
    private TicketsService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/Tickets")
    public List<Tickets> list() {
        return service.listAll();
    }
    @GetMapping("/Tickets/{id}")
    public ResponseEntity<Tickets> get(@PathVariable Integer id) {
        try {
        	Tickets tickets = service.get(id);
            return new ResponseEntity<Tickets>(tickets, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Tickets>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/Tickets")
    public ResponseEntity<Tickets> add(@RequestBody Tickets tickets) {
        service.save(tickets);
        return ResponseEntity.ok(tickets);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/Tickets/{id}")
    public ResponseEntity<?> update(@RequestBody Tickets tickets1, @PathVariable Integer id) {
        try {
        	Tickets tickets = service.get(id);
            
            service.save(tickets1);
//            return new ResponseEntity<>(HttpStatus.OK);
             return ResponseEntity.ok(tickets);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }    
        
     
    // RESTful API method for Delete operation@DeleteMapping("/products/{id}")
    @DeleteMapping("/Tickets/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
        System.out.println("deleted");
    
}
}