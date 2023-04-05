package com.transdev.mobiservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transdev.mobiservices.domain.Reservation;
import com.transdev.mobiservices.service.ReservationService;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
	
	@Autowired
    private ReservationService reservationService;
	
	@GetMapping("/all")
	public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }
	
	@GetMapping("/{id}")
	public Optional<Reservation> getReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }
	
	@PostMapping("/add")
    public void addNewReservation(@RequestBody Reservation reservation) {
        reservationService.addReservation(reservation);
    }
	
	@PutMapping("/update")
    public void updateUser(@RequestBody Reservation reservation) {
        reservationService.updateReservation(reservation);
    }
	
	@DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

}
