package com.vam.GT.Timesheet.Authentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vam.GT.Timesheet.Authentication.entity.Login;
import com.vam.GT.Timesheet.Authentication.entity.UserDetails;
import com.vam.GT.Timesheet.Authentication.exception.ResourceNotFoundException;
import com.vam.GT.Timesheet.Authentication.service.LoginService;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/")
	public Login saveemployee(@RequestBody Login employee) {
		return loginService.saveemployee(employee);
	}
	@GetMapping("/")
	public List<Login> findemployees(){
		List<Login> employeelist = loginService.getemployees();
		return employeelist;
	}
	@GetMapping ("/{id}")
	public ResponseEntity<Login> getUserDetailsById(@PathVariable Long id) {
		Login login = loginService.findByemailId(id);
//				.orElseThrow(() -> new ResourceNotFoundException("UserDetails not exist with id :" +id));
		return ResponseEntity.ok(login);
	}


//	@PostMapping("/login")
//	public ResponseEntity<HttpStatus> userlogin(@RequestBody Login employee) {
//		Login employeeResponse = loginService.getemployeeById(employee.getEmailId());
//		if (employeeResponse!=null) {
//			if (employee.getPassword().equals(employeeResponse.getPassword())){
//				return new ResponseEntity<>(HttpStatus.OK);
//				
//			}
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}

@PostMapping("/login")
public ResponseEntity<?> userlogin(@RequestBody Login Data) {
	Login Response = loginService.getemployeeById(Data.getEmailId());
		if(Response.getPassword().equals(Data.getPassword())) {
//			  log.info("Request to create group: {}", group);
		return ResponseEntity.ok("User Verified");
	}
	return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
	
}