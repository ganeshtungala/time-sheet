package com.vam.GT.Timesheet.Authentication.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.GT.Timesheet.Authentication.entity.Login;
import com.vam.GT.Timesheet.Authentication.repository.LoginRepository;
import com.vam.GT.Timesheet.Authentication.service.LoginService;



@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepository EmployeeRepository;
		
	@Override
	public Login saveemployee(Login employee) {
		return EmployeeRepository.save(employee);
	}
	
	@Override
	public List<Login> getemployees(){
		return EmployeeRepository.findAll();
	}
	
	@Override
	public Login getemployeeById(String emailId) {
		Optional<Login> employee = EmployeeRepository.findByemailId(emailId);
		return employee.get();
	}
	
	@Override
	public Login getemployeeByName(String name) {
		return EmployeeRepository.findBypassword(name);
	}
 @Override
	public Login findByemailId(Long id) {
		// TODO Auto-generated method stub
		Optional<Login> employee = EmployeeRepository.findById(id);
	     return employee.get();
	     
	}
 @Override
	public Login findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Login> employee = EmployeeRepository.findById(id);
	     return employee.get();
	     
	}

@Override
public void delete(Login userDetails) {
	// TODO Auto-generated method stub
	
}
}
