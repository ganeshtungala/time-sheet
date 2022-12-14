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
    @GetMapping("/tickets")
    public List<Tickets> list() {
        return service.listAll();
    }
    @GetMapping("/tickets/{ticketsId}")
    public ResponseEntity<Tickets> get(@PathVariable Integer ticketsId) {
        try {
        	Tickets tickets = service.get(ticketsId);
            return new ResponseEntity<Tickets>(tickets, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Tickets>(HttpStatus.NOT_FOUND);
        }      
    }
     
    // RESTful API method for Create operation
    @PostMapping("/tickets")
    public ResponseEntity<Tickets> add(@RequestBody Tickets tickets) {
        service.save(tickets);
        Tickets tickets1 = service.get(tickets.getTicketsId());
      System.out.println(tickets1.getProjects());
        return ResponseEntity.ok(tickets);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/tickets/{ticketsId}")
    public ResponseEntity<?> update(@RequestBody Tickets tickets1, @PathVariable Integer ticketsId) {
        try {
        	Tickets tickets = service.get(ticketsId);
            
            service.save(tickets1);
//            return new ResponseEntity<>(HttpStatus.OK);
             return ResponseEntity.ok(tickets);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }    
        
     
    // RESTful API method for Delete operation@DeleteMapping("/products/{id}")
    @DeleteMapping("/tickets/{ticketsId}")
    public void delete(@PathVariable Integer ticketsId) {
        service.delete(ticketsId);
        System.out.println("deleted");
    
}
}