package com.military.Service;

import com.military.Model.Transfer;
import com.military.Repository.TransferRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {

    @Autowired
    private TransferRepo transferRepo;

    public Transfer saveTransfer(Transfer transfer) {
        return transferRepo.save(transfer);
    }

    public List<Transfer> getAllTransfers() {
        return transferRepo.findAll();
    }
    public void deleteAllTransfers() {
        transferRepo.deleteAll();
    }


}
