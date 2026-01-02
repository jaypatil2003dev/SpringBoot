package com.project.form.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.form.model.LeaveRequest;
import com.project.form.repo.LeaveRequestRepository;

@Service
public class LeaveRequestService {
	
	private final LeaveRequestRepository repo;
	
	public LeaveRequestService(LeaveRequestRepository repo) {
		this.repo=repo;
	}
	
	public LeaveRequest applyLeave(LeaveRequest leave) {
		leave.setStatus("PENDING");
		return repo.save(leave);
	}
	
	public List<LeaveRequest> getAllLeaves(){
		return repo.findAll();
	}
	

}
