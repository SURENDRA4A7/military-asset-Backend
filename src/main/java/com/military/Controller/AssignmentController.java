package com.military.Controller;

import com.military.Model.Assignment;
import com.military.Service.AssignmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping
    public Assignment createAssignment(@RequestBody Assignment assignment) {
        return assignmentService.saveAssignment(assignment);
    }

    @GetMapping
    public List<Assignment> getAssignments() {
        return assignmentService.getAllAssignments();
    }

    @DeleteMapping("/all")
    public String deleteAllAssignments() {
        assignmentService.deleteAllAssignments();
        return "All assignments deleted successfully.";
    }
}
