package com.military.Controller;

import com.military.Model.Expenditure;
import com.military.Service.ExpenditureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/expenditures")
public class ExpenditureController {

    @Autowired
    private ExpenditureService expenditureService;

    @PostMapping
    public Expenditure createExpenditure(@RequestBody Expenditure expenditure) {
        return expenditureService.saveExpenditure(expenditure);
    }

    @GetMapping
    public List<Expenditure> getExpenditures() {
        return expenditureService.getAllExpenditures();
    }

    @DeleteMapping("/all")
    public String deleteAllExpenditures() {
        expenditureService.deleteAllExpenditures();
        return "All expenditures deleted successfully.";
    }
}
