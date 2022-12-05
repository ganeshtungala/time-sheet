package com.vam.GT.Timesheet.Authentication.service;

import java.util.List;

import com.vam.GT.Timesheet.Authentication.entity.Login;



public interface LoginService{

	public List<Login> getemployees();
	public Login getemployeeById(String emailId);
	public Login saveemployee(Login employee);
	public Login getemployeeByName(String name);
	public Login findByemailId(Long id);

}