package com.military.Service;

import com.military.Model.Expenditure;
import com.military.Repository.ExpenditureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenditureService {

    @Autowired
    private ExpenditureRepository expenditureRepo;

    public Expenditure saveExpenditure(Expenditure expenditure) {
        return expenditureRepo.save(expenditure);
    }

    public List<Expenditure> getAllExpenditures() {
        return expenditureRepo.findAll();
    }

    public void deleteAllExpenditures() {
        expenditureRepo.deleteAll();
    }
}
