package com.vam.gt.Timesheet.Timesheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vam.gt.Timesheet.Timesheet.Entity.Timesheet;
import com.vam.gt.Timesheet.Timesheet.Repository.TimesheetRepository;
 
@Service
@Transactional
public class TimesheetService {
 
    @Autowired
    private TimesheetRepository repo;
     
    public List<Timesheet> listAll() {
        return repo.findAll();
    }
     
    public void save(Timesheet timesheet) {
        repo.save(timesheet);
    }
     
    public Timesheet get(Integer timesheetId) {
        return repo.findById(timesheetId).get();
    }
     
    public void delete(Integer timesheetId) {
        repo.deleteById(timesheetId);
    }
}