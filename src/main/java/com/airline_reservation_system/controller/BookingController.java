package com.airline_reservation_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airline_reservation_system.model.Booking;
import com.airline_reservation_system.model.Flight;
import com.airline_reservation_system.service.BookingService;
import com.airline_reservation_system.service.FlightService;

@Controller
public class BookingController {

    private final FlightService flightService;
    private final BookingService bookingService;

    public BookingController(FlightService f, BookingService b) {
        this.flightService = f;
        this.bookingService = b;
    }

    @GetMapping("/book/{id}")
    public String showBookingForm(@PathVariable Long id, Model model) {
        Flight flight = flightService.getFlightById(id);
        model.addAttribute("flight", flight);
        return "booking";
    }

    @PostMapping("/booking/confirm/{id}")
    public String confirmBooking(@PathVariable Long id,
                                 @RequestParam String passengerName,
                                 @RequestParam int passengerAge,
                                 @RequestParam String gender,
                                 @RequestParam String idProof,
                                 @RequestParam int seats,
                                 Model model) {

        Booking booking = bookingService.createBooking(id, passengerName, passengerAge,
                gender, idProof, seats);

        model.addAttribute("booking", booking);
        return "booking-success";
    }
}
