package com.transdev.mobiservices.repository;

import org.springframework.stereotype.Repository;

import com.transdev.mobiservices.domain.Client;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	Client findClientByEmail(String email);
}