package com.vam.GT.Timesheet.Authentication.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vam.GT.Timesheet.Authentication.entity.Login;
import com.vam.GT.Timesheet.Authentication.exception.ResourceNotFoundException;
import com.vam.GT.Timesheet.Authentication.repository.LoginRepository;
import com.vam.GT.Timesheet.Authentication.service.LoginService;



@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/createuser")
	public Login saveemployee(@RequestBody Login employee) {
		return loginService.saveemployee(employee);
	}
	@GetMapping("/list")
	public List<Login> findemployees(){
		List<Login> employeelist = loginService.getemployees();
		return employeelist;
	}
	//	@GetMapping ("/{id}")
	//	public ResponseEntity<?> getUserDetailsById(@RequestBody Login id) {
	//		Login login = loginService.findByemailId(id.getId());
	//		if(login!=null) {
	//			if(id.getId().equals(login.getId())) {
	//				return ResponseEntity.ok(login);
	//			}
	//		}
	//			
	//		return new ResponseEntity<>("wert",HttpStatus.NOT_FOUND);
	//	}

	@PostMapping ("/getuser")
	public ResponseEntity<?> getUserDetailsById(@RequestBody Login response) {
		Login login = loginService.findByemailId(response.getId());
		if(login==null) {
			return new ResponseEntity<>("unable to process the request ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(login, HttpStatus.OK);
	}








	@PostMapping("/login")
	public ResponseEntity<?> userlogin(@RequestBody Login Data) {
		Login Response = loginService.getemployeeById(Data.getEmailId());
		if(Response.getPassword().equals(Data.getPassword())) {

			return ResponseEntity.ok(Response);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();

	}

	@DeleteMapping("/userdetails/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteLogin(@PathVariable Long id){
		Login Response = loginService.findById(id);

		loginService.delete(Response);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}






}