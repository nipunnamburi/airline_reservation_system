package com.airline_reservation_system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airline_reservation_system.model.Flight;
import com.airline_reservation_system.repository.FlightRepository;

@Service
public class FlightService {

    private final FlightRepository repo;

    public FlightService(FlightRepository repo) {
        this.repo = repo;
    }

    public List<Flight> searchFlights(String origin, String destination, String date) {
        return repo.findByOriginAndDestinationAndDate(origin, destination, date);
    }

    public Flight getFlightById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
