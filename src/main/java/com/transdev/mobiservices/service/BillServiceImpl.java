package com.transdev.mobiservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transdev.mobiservices.domain.Bill;
import com.transdev.mobiservices.dto.ReservationDto;
import com.transdev.mobiservices.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService {
	
	private final BillRepository billRepository;
	
	@Autowired
	public BillServiceImpl(BillRepository billRepository) {
		this.billRepository = billRepository;
	}
	
	@Override
	public Optional<Bill> getBillById(Long id) {
		return billRepository.findById(id);
	}

	@Override
	public String generateBill(ReservationDto reservation) {
		if(reservation.isPaid() != false) {
			return "Printing bill...";
		} else return "Reservation isn't paid for yet!";
	}
	
	

}
