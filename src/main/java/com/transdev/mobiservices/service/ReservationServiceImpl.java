package com.transdev.mobiservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transdev.mobiservices.domain.Bill;
import com.transdev.mobiservices.domain.Reservation;
import com.transdev.mobiservices.dto.ReservationDto;
import com.transdev.mobiservices.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	private final ReservationRepository reservationRepository;

	@Autowired
	public ReservationServiceImpl(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	@Override
	public List<Reservation> getAllReservations() {
		return reservationRepository.findAll();
	}

	@Override
	public Optional<Reservation> getReservationById(Long id) {
		Optional<Reservation> reservation = reservationRepository.findById(id);
        if (reservation != null) {
            return Optional.of(reservation.get());
        }
		else throw new IllegalStateException("Reservation with id " + id + "does not exist!");
	}
	
	@Override
	public boolean payReservation(Reservation reservation, String paymentMethod) {
		if(reservation.isPaid() != true) {
			System.out.println("Proceed to payment");
			reservation.setPaid(true);
		}
		return reservation.isPaid();
	}

	@Override
	public Bill getBill(ReservationDto reservation) {
		return reservation.getBill();
	}

	@Override
	public void addReservation(Reservation reservation) {
		reservationRepository.save(reservation);

	}

	@Override
	public void deleteReservation(Long id) {
		reservationRepository.deleteById(id);

	}

	@Override
	public void updateReservation(Reservation reservation) {
        reservationRepository.save(reservation);

	}

}
