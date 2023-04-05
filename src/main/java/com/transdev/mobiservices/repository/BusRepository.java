package com.transdev.mobiservices.repository;

import org.springframework.stereotype.Repository;

import com.transdev.mobiservices.domain.Bus;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

}
