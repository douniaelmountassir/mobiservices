package com.transdev.mobiservices.service;

import java.util.List;

import com.transdev.mobiservices.domain.Client;
import com.transdev.mobiservices.dto.ClientDto;

public interface ClientService {
	
	Client addClient(ClientDto clientDto);
	
    Client getClientById(Long id);
    
    Client getClientByEmail(String email);
    
    List<Client> getAllClients();
    
    void updateClient(Client client);
    
    void deleteClient(Long id);

}
