package com.vam.GT.Timesheet.Authentication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vam.GT.Timesheet.Authentication.entity.Login;



@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	public Login findBypassword(String name);
	public Optional<Login> findByemailId(String emailId);
	public Optional<Login> findById(Long id);

	
}