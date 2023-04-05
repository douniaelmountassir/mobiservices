package com.transdev.mobiservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transdev.mobiservices.domain.Client;
import com.transdev.mobiservices.dto.ClientDto;
import com.transdev.mobiservices.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
    private final ClientRepository clientRepository;
	
	@Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

	@Override
	public Client addClient(ClientDto clientDto) {
		Client foundClient = clientRepository.findClientByEmail(clientDto.getEmail());
        if (foundClient != null) {
        	throw new IllegalStateException("Client with email " + clientDto.getEmail() + "already exists!");
        }

        Client client = new Client();
        client.setEmail(clientDto.getEmail());
        client.setName(clientDto.getName());

        return clientRepository.save(client);
	}

	@Override
	public Client getClientById(Long id) {
		return clientRepository.getReferenceById(id);
	}

	@Override
	public Client getClientByEmail(String email) {
		return clientRepository.findClientByEmail(email);
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public void updateClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
	}

}
