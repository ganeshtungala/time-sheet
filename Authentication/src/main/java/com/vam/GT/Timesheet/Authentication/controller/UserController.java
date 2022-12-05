package com.vam.GT.Timesheet.Authentication.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vam.GT.Timesheet.Authentication.entity.UserDetails;
import com.vam.GT.Timesheet.Authentication.exception.ResourceNotFoundException;
import com.vam.GT.Timesheet.Authentication.repository.UserRepository;



@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	 
	@Autowired
	private UserRepository userRepository;
	
	// get all userdetails
	
	@GetMapping("/userdetails")
	public List<UserDetails>getAllUserDetails(){
		return userRepository.findAll();
	}
	
	// create userdetails rest api
	
	@PostMapping("/userdetails")
	public UserDetails createUserDetails(@RequestBody UserDetails userDetails)
	{
	return userRepository .save(userDetails);
}
	
	// get userdetails by id rest api
	
	@GetMapping ("/userdetails/{id}")
	public ResponseEntity<UserDetails> getUserDetailsById(@PathVariable Long id) {
		UserDetails userDetails = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserDetails not exist with id :" +id));
		return ResponseEntity.ok(userDetails);
	}
	
//	update userdetails rest api
	
	@PutMapping("/userdetails/{id}")
	public ResponseEntity<UserDetails> updateUserDetails(@PathVariable Long id, @RequestBody UserDetails userDetails1){
		UserDetails userDetails = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserDetails not exist with id :" +id));
		userDetails.setFirstName(userDetails1.getFirstName());
		userDetails.setLastName(userDetails1.getLastName());
		userDetails.setTotalExperience(userDetails1.getTotalExperience());
		userDetails.setVamExperience(userDetails1.getVamExperience());
		userDetails.setSkillSet(userDetails1.getSkillSet());
		
		UserDetails updatedUserDetails = userRepository.save(userDetails);
		return ResponseEntity.ok(updatedUserDetails);
		
	}
	
	//delete userdetails rest api
	
	@DeleteMapping("/userdetails/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteUserDetails(@PathVariable Long id){
		UserDetails userDetails = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserDetails not exist with id :" +id));
		
		userRepository.delete(userDetails);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
	
		

}
