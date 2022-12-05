package com.vam.gt.Timesheet.Timesheet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vam.gt.Timesheet.Timesheet.Entity.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet, Integer> {

	List<Timesheet> findAll();
 
}