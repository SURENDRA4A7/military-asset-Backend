package com.military.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.military.Model.Transfer;
import com.military.Service.TransferService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/transfers")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping
    public Transfer addTransfer(@RequestBody Transfer transfer) {
        System.out.println("Transfer Received: " + transfer);
        return transferService.saveTransfer(transfer);
    }


    @GetMapping
    public List<Transfer> getTransfers() {
        return transferService.getAllTransfers();
    }

    @DeleteMapping("/all")
    public String deleteAllTransfers() {
        transferService.deleteAllTransfers();
        return "All transfer records deleted successfully.";
    }

}
