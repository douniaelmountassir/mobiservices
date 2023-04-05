package com.transdev.mobiservices.service;

import java.util.List;

import com.transdev.mobiservices.domain.Bus;

public interface BusService {
	
	List<Bus> getAllBuses();

    Bus getBusById(Long id);

    void addNewBus(Bus bus);

    void deleteBus(Long id);

}
