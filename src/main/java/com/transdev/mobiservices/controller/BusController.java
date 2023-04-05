package com.transdev.mobiservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transdev.mobiservices.domain.Bus;
import com.transdev.mobiservices.service.BusService;

@RestController
@RequestMapping("/api/bus")
public class BusController {
	
	@Autowired
	private BusService busService;
    
    @GetMapping("/all")
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable Long id){
        return busService.getBusById(id);
    }

    @PostMapping("/add")
    public void addNewBus(@RequestBody Bus bus) {
        busService.addNewBus(bus);
    }

    @DeleteMapping("/{id}")
    public void deleteBus(@PathVariable Long id) {
        busService.deleteBus(id);
    }

}
