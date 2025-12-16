package com.airline_reservation_system.controller;

import com.airline_reservation_system.service.FlightService;
import com.airline_reservation_system.model.Flight;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FlightController {

    private final FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }

    @GetMapping("/search/results")
    public String searchFlights(@RequestParam String origin,
                                @RequestParam String destination,
                                @RequestParam String date,
                                Model model) {

        List<Flight> flights = service.searchFlights(origin, destination, date);
        model.addAttribute("flights", flights);

        return "flight-results";
    }
}
