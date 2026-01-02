package com.project.form.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.form.model.LeaveRequest;
import com.project.form.service.LeaveRequestService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/leaves")
public class LeaveRequestController {
	
	 private final LeaveRequestService service;

	    public LeaveRequestController(LeaveRequestService service) {
	        this.service = service;
	    }

	    // Faculty applies leave
	    @PostMapping("/apply")
	    public LeaveRequest applyLeave(@RequestBody LeaveRequest leave) {
	        return service.applyLeave(leave);
	    }

	    // Admin views all leaves
	    @GetMapping
	    public List<LeaveRequest> getAllLeaves() {
	        return service.getAllLeaves();
	    }

}
