package com.lavanya.billing.billing_api.controller;

import com.lavanya.billing.billing_api.models.Invoice;
import com.lavanya.billing.billing_api.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceRepository repo;

    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        System.out.println("Received invoice: " + invoice);
        return repo.save(invoice);
    }

    @GetMapping
    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }
}
