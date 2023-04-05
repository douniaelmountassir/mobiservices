package com.transdev.mobiservices.service;

import java.util.Optional;

import com.transdev.mobiservices.domain.Bill;
import com.transdev.mobiservices.dto.ReservationDto;

public interface BillService {
	
	Optional<Bill> getBillById(Long id);
	String generateBill(ReservationDto reservation); //check if it's paid

}
