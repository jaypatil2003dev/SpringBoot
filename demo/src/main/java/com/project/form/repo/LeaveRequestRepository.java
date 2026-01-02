package com.project.form.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.form.model.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Long>{

}
