package com.vam.gt.Timesheet.Timesheet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vam.gt.Timesheet.Timesheet.Entity.Tickets;



public interface TicketsRepository extends JpaRepository<Tickets, Integer> {

	List<Tickets> findAll();
 
}