package com.airline_reservation_system.service;

import org.springframework.stereotype.Service;

import com.airline_reservation_system.model.Booking;
import com.airline_reservation_system.model.Flight;
import com.airline_reservation_system.repository.BookingRepository;
import com.airline_reservation_system.repository.FlightRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepo;
    private final FlightRepository flightRepo;

    public BookingService(BookingRepository b, FlightRepository f) {
        this.bookingRepo = b;
        this.flightRepo = f;
    }

    public Booking createBooking(Long flightId, String name, int age, String gender,
                                 String idProof, int seats) {

        Flight flight = flightRepo.findById(flightId).orElse(null);

        Booking booking = new Booking();
        booking.setPassengerName(name);
        booking.setPassengerAge(age);
        booking.setGender(gender);
        booking.setIdProof(idProof);
        booking.setSeats(seats);
        booking.setTotalPrice(seats * flight.getPrice());
        booking.setFlight(flight);

        flight.setAvailableSeats(flight.getAvailableSeats() - seats);
        flightRepo.save(flight);

        return bookingRepo.save(booking);
    }
}
