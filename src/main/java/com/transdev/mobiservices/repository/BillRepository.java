package com.transdev.mobiservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transdev.mobiservices.domain.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
