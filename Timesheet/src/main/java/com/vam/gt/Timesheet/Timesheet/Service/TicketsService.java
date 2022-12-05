package com.vam.gt.Timesheet.Timesheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vam.gt.Timesheet.Timesheet.Entity.Tickets;

import com.vam.gt.Timesheet.Timesheet.Repository.TicketsRepository;


@Service
@Transactional
public class TicketsService {
 
    @Autowired
    private TicketsRepository repo;
     
    public List<Tickets> listAll() {
        return repo.findAll();
    }
     
    public void save(Tickets tickets) {
        repo.save(tickets);
    }
     
    public Tickets get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}