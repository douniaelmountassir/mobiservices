package com.transdev.mobiservices.dto;

import com.transdev.mobiservices.domain.Reservation;

public class BillDto {
	
    private Reservation reservation;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
