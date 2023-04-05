package com.transdev.mobiservices.dto;

import java.util.Date;
import java.util.List;

import com.transdev.mobiservices.domain.Bill;
import com.transdev.mobiservices.domain.Bus;
import com.transdev.mobiservices.domain.Client;

public class ReservationDto {
	
	private Date journeyDate;
	
	private List<Bus> buses;
	
	private Client client;
	
	private boolean isPaid;
	
	private String paymentMethod;

    public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	private Bill bill;

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}

}
