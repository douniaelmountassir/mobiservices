package com.transdev.mobiservices.service;

import java.util.List;
import java.util.Optional;

import com.transdev.mobiservices.domain.Bill;
import com.transdev.mobiservices.domain.Reservation;
import com.transdev.mobiservices.dto.ReservationDto;

public interface ReservationService {
	
	List<Reservation> getAllReservations();

    Optional<Reservation> getReservationById(Long id);
    
    boolean payReservation(Reservation reservation, String paymentMethod);
    
    Bill getBill(ReservationDto reservation);

    void addReservation(Reservation reservation);

    void deleteReservation(Long id);

    void updateReservation(Reservation reservation);

}
