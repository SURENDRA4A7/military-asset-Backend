package com.military.Service;

import com.military.Model.Assignment;
import com.military.Repository.AssignmentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepo assignmentRepo;

    public Assignment saveAssignment(Assignment assignment) {
        return assignmentRepo.save(assignment);
    }

    public List<Assignment> getAllAssignments() {
        return assignmentRepo.findAll();
    }

    public void deleteAllAssignments() {
        assignmentRepo.deleteAll();
    }
}
