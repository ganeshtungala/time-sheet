package com.vam.GT.Timesheet.Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vam.GT.Timesheet.Authentication.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{




}
