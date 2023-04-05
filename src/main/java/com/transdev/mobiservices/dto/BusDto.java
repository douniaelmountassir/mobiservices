package com.transdev.mobiservices.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.transdev.mobiservices.domain.Reservation;

public class BusDto {
	
	private String journey;
	
	private int seats;
	
	private Date departureDate;
	
	private BigDecimal price;
	
	private List<Reservation> reservations;

	public String getJourney() {
		return journey;
	}

	public void setJourney(String journey) {
		this.journey = journey;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
