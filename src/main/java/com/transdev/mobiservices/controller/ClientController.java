package com.transdev.mobiservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transdev.mobiservices.domain.Client;
import com.transdev.mobiservices.dto.ClientDto;
import com.transdev.mobiservices.service.ClientService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/client")
public class ClientController {
	
	@Autowired
    private ClientService clientService;
	
	@PostMapping("/register")
    public void register(@RequestBody ClientDto clientDto, HttpServletRequest request) {
        clientService.addClient(clientDto);
    }
	
	@GetMapping(path = "/all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
	
	@PutMapping("/update")
    public void updateUser(@RequestBody Client client) {
        clientService.updateClient(client);
    }
	
	@DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
	
}
