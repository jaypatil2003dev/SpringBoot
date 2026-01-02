package com.project.form.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String leaveType;

    private String fromDate;
    private String toDate;

    private String reason;

    private String status; // PENDING, APPROVED, REJECTED
}
