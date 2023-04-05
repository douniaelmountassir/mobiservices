package com.transdev.mobiservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transdev.mobiservices.domain.Bus;
import com.transdev.mobiservices.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {
	
	private final BusRepository busRepository;
	
	@Autowired
    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

	@Override
	public List<Bus> getAllBuses() {
		return busRepository.findAll();
	}

	@Override
	public Bus getBusById(Long id) {
		Optional<Bus> bus = busRepository.findById(id);
        if (bus != null) {
            return bus.get();
        }
		else throw new IllegalStateException("Bus with id " + id + "does not exist!");
	}

	@Override
	public void addNewBus(Bus bus) {
		busRepository.save(bus);
	}

	@Override
	public void deleteBus(Long id) {
		busRepository.deleteById(id);
	}
	
	

}
