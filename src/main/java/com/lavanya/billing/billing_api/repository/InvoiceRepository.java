package com.lavanya.billing.billing_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanya.billing.billing_api.models.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
