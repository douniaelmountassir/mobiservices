package com.transdev.mobiservices.dto;

import java.util.List;

import com.transdev.mobiservices.domain.Reservation;

public class ClientDto {

	private String name;
	
	private String email;
	
	private List<Reservation> reservations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
